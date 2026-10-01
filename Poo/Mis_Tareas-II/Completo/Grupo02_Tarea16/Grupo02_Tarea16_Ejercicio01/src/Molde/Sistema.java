package Molde;

import ControlDAO.ArbolDAO;
import ControlDAO.ContratoDAO;
import ControlDAO.InventarioDAO;
import ControlDAO.OrdenDAO;
import ControlDAO.PredioDAO;
import ControlDAO.SitioDAO;
import Interf.ArbolINTER;
import Interf.ContraroINTER;
import Interf.InventarioINTER;
import Interf.OrdenINTER;
import Interf.PredioINTER;
import Interf.SitioINTER;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Sistema {

    private List<Nodo<Object>> inventarios = new ArrayList<>();
    private Map<String, Nodo<Object>> hashMap = new HashMap<>();

    /*
        INVENTARIO
          PREDIO
            CONTRATO
              ORDEN
                SITIO
                  ARBOL        
     */
    // Constructor
    public void agregarInventario(Inventario inv) {
        Nodo<Object> nodoInv = new Nodo<>(inv);
        inventarios.add(nodoInv);
        hashMap.put(inv.getClaveIndice(), nodoInv);
        try {
            InventarioINTER dao = new InventarioDAO();
            dao.registrar(inv);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
//------------------ Métodos para agregar  -------------------------

    public void agregarPredio(String claveINV, Predio p) {
        Nodo<Object> padre = hashMap.get(claveINV);

        if (padre != null) {
            Nodo<Object> nodoHijo = new Nodo<>(p);
            padre.agregarHijo(nodoHijo);
            hashMap.put(p.getClaveIndice(), nodoHijo);
            try {
                PredioINTER dao = new PredioDAO();
                dao.registrar(p);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void agregarContrato(String clavePredio, Contrato c) {
        Nodo<Object> padre = hashMap.get(clavePredio);
        if (padre != null) {
            Nodo<Object> nodoHijo = new Nodo<>(c);
            padre.agregarHijo(nodoHijo);
            hashMap.put(c.getClaveIndice(), nodoHijo);
            try {
                ContraroINTER dao = new ContratoDAO();
                dao.registrar(c);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void agregarOrden(String claveContrato, Orden o) {
        Nodo<Object> padre = hashMap.get(claveContrato);
        if (padre != null) {
            Nodo<Object> nodoHijo = new Nodo<>(o);
            padre.agregarHijo(nodoHijo);
            hashMap.put(o.getClaveIndice(), nodoHijo);
            try {
                OrdenINTER dao = new OrdenDAO();
                dao.registrar(o);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void agregarSitio(String claveOrden, Sitio s) {
        Nodo<Object> padre = hashMap.get(claveOrden);
        if (padre != null) {
            Nodo<Object> nodoHijo = new Nodo<>(s);
            padre.agregarHijo(nodoHijo);
            hashMap.put(s.getClaveIndice(), nodoHijo);
            try {
                SitioINTER dao = new SitioDAO();
                dao.registrar(s);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void agregarArbol(String claveSitio, Arbol a) {
        Nodo<Object> padre = hashMap.get(claveSitio);
        if (padre != null) {
            Nodo<Object> nodoHijo = new Nodo<>(a);
            padre.agregarHijo(nodoHijo);
            hashMap.put(a.getClaveIndice(), nodoHijo);
            try {
                ArbolINTER dao = new ArbolDAO();
                dao.registrar(a);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

//--------------------------------------
    public Nodo<Object> buscarNodo(String clave) {
        return hashMap.get(clave);
    }

    public void imprimirKEYS(JTextArea txt) {
        txt.append("=== Claves en hashMap ===\n");
        for (String clave : hashMap.keySet()) {
            txt.append("-- " + clave + "\n");
        }
    }

    public boolean repetir(String codigo) {
        if (hashMap.get(codigo) == null) {
            return true;
        }
        return false;
    }

    public void imprimirNodo(Nodo<?> nodo, int nivel, JTextArea txt) {
        txt.append("  ".repeat(nivel));//Va a generar los especias dependiendo del nivel
        txt.append("|---> " + nodo.getDato() + "\n");

        for (Nodo<?> hijo : nodo.getHijos()) {
            imprimirNodo(hijo, nivel + 1, txt);//recursividad
        }
    }

    //==============================================================================
    //==============================================================================
    private void cargarInventariosDesdeBD() {
        try {
            InventarioDAO dao = new InventarioDAO();
            for (Inventario inv : dao.listar()) {
                Nodo<Object> nodoInv = new Nodo<>(inv);
                inventarios.add(nodoInv);
                hashMap.put(inv.getClaveIndice(), nodoInv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void cargarPrediosDesdeBD() {
        try {
            PredioINTER dao = new PredioDAO();
            for (Predio p : dao.listar()) {
                Nodo<Object> nodoPredio = new Nodo<>(p);
                Nodo<Object> padre = hashMap.get("INV-" + p.getCodigoInventario());
                if (padre != null) {
                    padre.agregarHijo(nodoPredio);
                }
                hashMap.put(p.getClaveIndice(), nodoPredio);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void cargarContratosDesdeBD() {
        try {
            ContraroINTER dao = new ContratoDAO();
            for (Contrato c : dao.listar()) {
                Nodo<Object> nodoContrato = new Nodo<>(c);
                Nodo<Object> padre = hashMap.get("PRE-" + c.getCodigoPredio());
                if (padre != null) {
                    padre.agregarHijo(nodoContrato);
                }
                hashMap.put(c.getClaveIndice(), nodoContrato);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void cargarOrdenesDesdeBD() {
        try {
            OrdenINTER dao = new OrdenDAO();
            for (Orden o : dao.listar()) {
                Nodo<Object> nodoOrden = new Nodo<>(o);
                Nodo<Object> padre = hashMap.get("CON-" + o.getCodigoContrato());
                if (padre != null) {
                    padre.agregarHijo(nodoOrden);
                }
                hashMap.put(o.getClaveIndice(), nodoOrden);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void cargarSitiosDesdeBD() {
        try {
            SitioINTER dao = new SitioDAO();
            for (Sitio s : dao.listar()) {
                Nodo<Object> nodoSitio = new Nodo<>(s);
                Nodo<Object> padre = hashMap.get("ORD-" + s.getCodigoOrden());
                if (padre != null) {
                    padre.agregarHijo(nodoSitio);
                }
                hashMap.put(s.getClaveIndice(), nodoSitio);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void cargarArbolesDesdeBD() {
        try {
            ArbolINTER dao = new ArbolDAO();
            for (Arbol a : dao.listar()) {
                Nodo<Object> nodoArbol = new Nodo<>(a);
                Nodo<Object> padre = hashMap.get("SIT-" + a.getCodigoSitio());
                if (padre != null) {
                    padre.agregarHijo(nodoArbol);
                }
                hashMap.put(a.getClaveIndice(), nodoArbol);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cargarTodoDesdeBD() {
        cargarInventariosDesdeBD();
        cargarPrediosDesdeBD();
        cargarContratosDesdeBD();
        cargarOrdenesDesdeBD();
        cargarSitiosDesdeBD();
        cargarArbolesDesdeBD();
    }
//====================================================================
//====================================================================
//======================EDITAR===========================

    public void editarInventario(Inventario nuevoINV) {
        try {

            Nodo<Object> nodo = hashMap.get(nuevoINV.getClaveIndice());
            if (nodo != null) {
                nodo.setDato(nuevoINV);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el inventario con clave: " + nuevoINV.getClaveIndice());
                return;
            }

            InventarioINTER dao = new InventarioDAO();
            dao.editar(nuevoINV);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editarPredio(Predio nuevoPRE) {
        try {
            Nodo<Object> nodo = hashMap.get(nuevoPRE.getClaveIndice());
            if (nodo != null) {
                nodo.setDato(nuevoPRE);
            } else {
                JOptionPane.showMessageDialog(null,
                        "No se encontró el predio con clave: " + nuevoPRE.getClaveIndice());
                return;
            }

            PredioINTER dao = new PredioDAO();
            dao.editar(nuevoPRE);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editarContrato(Contrato nuevoCON) {
        try {
            Nodo<Object> nodo = hashMap.get(nuevoCON.getClaveIndice());
            if (nodo != null) {
                nodo.setDato(nuevoCON);
            } else {
                JOptionPane.showMessageDialog(null,
                        "No se encontró el contrato con clave: " + nuevoCON.getClaveIndice());
                return;
            }

            ContraroINTER dao = new ContratoDAO();
            dao.editar(nuevoCON);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editarOrden(Orden nuevaORD) {
        try {
            Nodo<Object> nodo = hashMap.get(nuevaORD.getClaveIndice());
            if (nodo != null) {
                nodo.setDato(nuevaORD);
            } else {
                JOptionPane.showMessageDialog(null,
                        "No se encontró la orden con clave: " + nuevaORD.getClaveIndice());
                return;
            }

            OrdenINTER dao = new OrdenDAO();
            dao.editar(nuevaORD);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editarSitio(Sitio nuevoSIT) {
        try {
            Nodo<Object> nodo = hashMap.get(nuevoSIT.getClaveIndice());
            if (nodo != null) {
                nodo.setDato(nuevoSIT);
            } else {
                JOptionPane.showMessageDialog(null,
                        "No se encontró el sitio con clave: " + nuevoSIT.getClaveIndice());
                return;
            }

            SitioINTER dao = new SitioDAO();
            dao.editar(nuevoSIT);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editarArbol(Arbol nuevoARB) {
        try {
            Nodo<Object> nodo = hashMap.get(nuevoARB.getClaveIndice());
            if (nodo != null) {
                nodo.setDato(nuevoARB);
            } else {
                JOptionPane.showMessageDialog(null,
                        "No se encontró el árbol con clave: " + nuevoARB.getClaveIndice());
                return;
            }

            ArbolINTER dao = new ArbolDAO();
            dao.editar(nuevoARB);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//=========================================================================
//=========================================================================
//================================ELIMINAR=====================================

    public void eliminarInventario(Inventario inv) {
        try {
            Nodo<Object> nodo = hashMap.remove(inv.getClaveIndice());
            if (nodo != null) {
                inventarios.remove(nodo);
            } else {
                JOptionPane.showMessageDialog(null,
                        "No se encontró el inventario con clave: " + inv.getClaveIndice());
                return;
            }

            //Eliminar en BD
            InventarioINTER dao = new InventarioDAO();
            dao.eliminar(inv.getIdInventario());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void eliminarPredio(Predio pre) {
        try {
            Nodo<Object> nodo = hashMap.remove(pre.getClaveIndice());
            if (nodo != null) {
                // quitar del padre Inventario
                Nodo<Object> padre = hashMap.get("INV-" + pre.getCodigoInventario());
                if (padre != null) {
                    padre.getHijos().remove(nodo);
                }
            } else {
                JOptionPane.showMessageDialog(null,
                        "No se encontró el predio con clave: " + pre.getClaveIndice());
                return;
            }

            PredioINTER dao = new PredioDAO();
            dao.eliminar(pre.getIdPredio());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void eliminarContrato(Contrato con) {
        try {
            Nodo<Object> nodo = hashMap.remove(con.getClaveIndice());
            if (nodo != null) {
                Nodo<Object> padre = hashMap.get("PRE-" + con.getCodigoPredio());
                if (padre != null) {
                    padre.getHijos().remove(nodo);
                }
            } else {
                JOptionPane.showMessageDialog(null,
                        "No se encontró el contrato con clave: " + con.getClaveIndice());
                return;
            }
            ContraroINTER dao = new ContratoDAO();
            dao.eliminar(con.getIdContrato());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void eliminarOrden(Orden ord) {
        try {
            Nodo<Object> nodo = hashMap.remove(ord.getClaveIndice());
            if (nodo != null) {
                Nodo<Object> padre = hashMap.get("CON-" + ord.getCodigoContrato());
                if (padre != null) {
                    padre.getHijos().remove(nodo);
                }
            } else {
                JOptionPane.showMessageDialog(null,
                        "No se encontró la orden con clave: " + ord.getClaveIndice());
                return;
            }
            OrdenINTER dao = new OrdenDAO();
            dao.eliminar(ord.getIdOrden());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void eliminarSitio(Sitio sit) {
        try {
            Nodo<Object> nodo = hashMap.remove(sit.getClaveIndice());
            if (nodo != null) {
                Nodo<Object> padre = hashMap.get("ORD-" + sit.getCodigoOrden());
                if (padre != null) {
                    padre.getHijos().remove(nodo);
                }
            } else {
                JOptionPane.showMessageDialog(null,
                        "No se encontró el sitio con clave: " + sit.getClaveIndice());
                return;
            }

            SitioINTER dao = new SitioDAO();
            dao.eliminar(sit.getIdSitio());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void eliminarArbol(Arbol arb) {
        try {
            Nodo<Object> nodo = hashMap.remove(arb.getClaveIndice());
            if (nodo != null) {
                Nodo<Object> padre = hashMap.get("SIT-" + arb.getCodigoSitio());
                if (padre != null) {
                    padre.getHijos().remove(nodo);
                }
            } else {
                JOptionPane.showMessageDialog(null,
                        "No se encontró el árbol con clave: " + arb.getClaveIndice());
                return;
            }

            ArbolINTER dao = new ArbolDAO();
            dao.eliminar(arb.getId());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
