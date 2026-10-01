package Contro;

import Modelo.Cliente;
import Modelo.Operacion_Prestamo;
import Modelo.Tipo_Prestamo;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Arreglo_Objetos{
    Cliente[] arregloCliente;
    Tipo_Prestamo[] arregloTipoPrestamo;
    Operacion_Prestamo[] arregloOperacionPrestamo;
    int i_Cliente, i_TipoPrestamo, i_OperacionPrestamo;
    double monto = 0;
    
    public Arreglo_Objetos(String tipo){
        if(tipo.equals("cliente")){
            arregloCliente = new Cliente[10];
        }
        else{
            if(tipo.equals("tipo_prestamo")){   
                arregloTipoPrestamo = new Tipo_Prestamo[5];
            }
            else{
                arregloOperacionPrestamo = new Operacion_Prestamo[15];
            }
        }      
    }

    public void Agregar_OperacionesPrestamo(Operacion_Prestamo objOperacionPrestamo){
        try {
        arregloOperacionPrestamo[i_OperacionPrestamo] = objOperacionPrestamo;
        i_OperacionPrestamo++;
        }
        catch (ArrayIndexOutOfBoundsException error) {
            JOptionPane.showMessageDialog(null, "¡¡LA LISTA ESTÁ LLENA!!");
        }
    }
    
    public void Mostrar_OperacionesPrestamo(JTable tabla){
        String[] cabecera = {"Cliente Asignado", "Tipo Asignado", "Monto Inicial", "Saldo Pendiente",};
        DefaultTableModel modeloTabla = new DefaultTableModel(cabecera, 0);
        tabla.setModel(modeloTabla);
        
        for (int pos = 0; pos < i_OperacionPrestamo; pos++) {
             modeloTabla.addRow(arregloOperacionPrestamo[pos].ObtenerRegistro());    
        }
    }
    
    public void FiltroTipo_Mostrar_OperacionesPrestamo(String filtroTipo, JTable tabla){
        String[] cabecera = {"Cliente Asignado", "Tipo Asignado", "Monto Inicial", "Saldo Pendiente",};
        DefaultTableModel modeloTabla = new DefaultTableModel(cabecera, 0);
        tabla.setModel(modeloTabla);
        
        for (int pos = 0; pos < i_OperacionPrestamo; pos++) {
             if(filtroTipo.equals(arregloOperacionPrestamo[pos].getTipo_Asignado())){
                 modeloTabla.addRow(arregloOperacionPrestamo[pos].ObtenerRegistro());
             }           
        }
    }
    
    public void BusquedaCliente_Mostrar_OperacionesPrestamo(String filtroCliente, JTable tabla){
        String[] cabecera = {"Cliente Asignado", "Tipo Asignado", "Monto Inicial", "Saldo Pendiente",};
        DefaultTableModel modeloTabla = new DefaultTableModel(cabecera, 0);
        tabla.setModel(modeloTabla);
        
        for (int pos = 0; pos < i_OperacionPrestamo; pos++) {
             String busquedaCliente = arregloOperacionPrestamo[pos].getCliente_Asignado() + "";
             if(busquedaCliente.startsWith(filtroCliente)){
                 modeloTabla.addRow(arregloOperacionPrestamo[pos].ObtenerRegistro());
             }           
        }
    }
    
    public void Aumentador(){
        for (int i = 0; i < i_OperacionPrestamo; i++) {
            monto = monto + arregloOperacionPrestamo[i].getMonto_Inicial();
        }
    }
    
    public void Editar_OperacionesPrestamo(int pos_Editar, JTable tabla, int cliente_Asignado, String tipo_Asignado, double monto_Inicial, double saldo_Pendiente){
        arregloOperacionPrestamo[pos_Editar].setCliente_Asignado(cliente_Asignado);
        arregloOperacionPrestamo[pos_Editar].setTipo_Asignado(tipo_Asignado);
        arregloOperacionPrestamo[pos_Editar].setMonto_Inicial(monto_Inicial);
        arregloOperacionPrestamo[pos_Editar].setSaldo_Pendiente(saldo_Pendiente);
            
        Mostrar_OperacionesPrestamo(tabla);
    }
    
    public void Eliminar_OperacionesPrestamo(int pos_Eliminar, JTable tabla){
        for (int pos = pos_Eliminar; pos < i_OperacionPrestamo-1; pos++) {
           arregloOperacionPrestamo[pos] = arregloOperacionPrestamo[pos+1];       
        }
        i_OperacionPrestamo--;
        Mostrar_OperacionesPrestamo(tabla);
    }
    
    public void Registrar_Cliente(Cliente objCliente){
        try {
        arregloCliente[i_Cliente] = objCliente;
        i_Cliente++;
        }
        catch (ArrayIndexOutOfBoundsException error) {
            JOptionPane.showMessageDialog(null, "¡¡LA LISTA ESTÁ LLENA!!");
        }
    }
    
    public void Listar_CLiente(JTable tabla){
        String[] cabecera = {"CI Cliente", "Nombre Completo", "Ingreso Mensual", "Total Deuda Acumulada"};
        DefaultTableModel modeloTablaM = new DefaultTableModel(cabecera, 0);
        tabla.setModel(modeloTablaM);
        
        for (int pos = 0; pos < i_Cliente; pos++) {
             modeloTablaM.addRow(arregloCliente[pos].ObtenerRegistro());    
        }
    }
    
    public void Listar_Cliente_Cbox(JComboBox cBox){
        DefaultComboBoxModel modeloCBox = new DefaultComboBoxModel();
        cBox.setModel(modeloCBox);
        
        for (int pos = 0; pos < i_Cliente; pos++) {
            modeloCBox.addElement(arregloCliente[pos].getCI_Cliente());
        }      
    }
    
    public void CalcularTotalDeudaAcumulada(int ci_Cliente, String tipo_Prestamo, double montoInicial, JTable tablaCliente){
        int tasaInteresAnual = 0;
        int plazosMaxMeses = 0;
                
        for (int pos = 0; pos < i_TipoPrestamo; pos++) {
            if(tipo_Prestamo.equals(arregloTipoPrestamo[pos].getNombre_Tipo())){
                tasaInteresAnual = arregloTipoPrestamo[pos].getTasa_Interes_Anual();
                plazosMaxMeses = arregloTipoPrestamo[pos].getPlazo_Maximo_Meses();
            }      
        }
        
        for (int pos = 0; pos < i_Cliente; pos++) {
            if(arregloCliente[pos].getCI_Cliente() == ci_Cliente){
                arregloCliente[pos].setTotal_Deuda_Acumulada(montoInicial + (montoInicial*(tasaInteresAnual/100))*(plazosMaxMeses/12));
            }
        }     
        Listar_CLiente(tablaCliente);
    }
    
    public void Registrar_TipoPrestamo(Tipo_Prestamo objTipoPrestamo){
        try {
        arregloTipoPrestamo[i_TipoPrestamo] = objTipoPrestamo;
        i_TipoPrestamo++;
        }
        catch (ArrayIndexOutOfBoundsException error) {
            JOptionPane.showMessageDialog(null, "¡¡LA LISTA ESTÁ LLENA!!");
        }
    }
    
    public void Listar_TipoPrestamo(JTable tabla){
        String[] cabecera = {"Codigo", "Tipo", "Tasa de Interes Anual (%)", "Plazo Máximo Meses"};
        DefaultTableModel modeloTablaM = new DefaultTableModel(cabecera, 0);
        tabla.setModel(modeloTablaM);
        
        for (int pos = 0; pos < i_TipoPrestamo; pos++) {
             modeloTablaM.addRow(arregloTipoPrestamo[pos].ObtenerRegistro());    
        }
    } 
    
    public void Listar_TipoPrestamo_Cbox(JComboBox cBox){
        DefaultComboBoxModel modeloCBox = new DefaultComboBoxModel();
        cBox.setModel(modeloCBox);
        
        for (int pos = 0; pos < i_TipoPrestamo; pos++) {
            modeloCBox.addElement(arregloTipoPrestamo[pos].getNombre_Tipo());
        }      
    }
}
