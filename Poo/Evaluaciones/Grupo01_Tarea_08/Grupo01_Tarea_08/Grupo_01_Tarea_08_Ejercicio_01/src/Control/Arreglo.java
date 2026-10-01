package Control;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JList;

public class Arreglo {

    String[] Pasajes = new String[50];
    int i = 0;
    int[] Pasajes01 = new int[50];
    int j = 0;

    public void Agregar(String datos) {
        try {
            Pasajes[i] = datos;
            i++;
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Se exedió la cantidad de boletos");
        }
    }

    public void Listar(JList lista1) {
        DefaultListModel modLista = new DefaultListModel();
        lista1.setModel(modLista);
        for (int p = 0; p < i; p++) {
            modLista.addElement(Pasajes[p]);
        }
    }

    public void Pasajes01(int Datos) {
        try {
            Pasajes01[j] = Datos;
            j++;
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Se alcanzo la cantidad maximas de boletos");
        }
    }

    public void Boletos(JList lista2) {
        DefaultListModel ModLista = new DefaultListModel();
        lista2.setModel(ModLista);
        for (int bt = 0; bt < j; bt++) {
            ModLista.addElement(bt);
        }
    }

    public int getTotal() {
        return i;

    }

    public String SimilarFinal(String destino) {   //destinos similares
        StringBuilder similares = new StringBuilder();
        String destinoComprar = destino.trim().toLowerCase();
        if (destinoComprar.length() < 2) {
            return "";
        }
        String UltimosCaracteres = destinoComprar.substring(destinoComprar.length() - 2);
      
        for (int s = 0; s < i; s++) {
            String [] datos = Pasajes[s].split(",");
            if(datos.length >=4){
                String destinoGuardado = datos[3].trim().toLowerCase();
                if(!destinoGuardado.equals(destinoComprar)&& destinoGuardado.endsWith(UltimosCaracteres)){
                    similares.append(destinoGuardado).append(",");
                }
            }
        }
        if (similares.length() > 0) {
            similares.setLength(similares.length() - 2);
        }
        return similares.toString();
    }

    public boolean RepetinumeroAsiento(String numeroAsiento) {
        for (int b = 0; b < i; b++) {
            if (Pasajes[b].equalsIgnoreCase(numeroAsiento.trim())) {
                return true;
            }
        }
        return false;
    }

}
