package Molde;

import java.util.ArrayList;
import java.util.List;

public class Contrato {

    private int idContrato;
    private String contrato;
    private int codigoPredio;

    public Contrato(int idContrato, String contrato, int codigoPredio) {
        this.idContrato = idContrato;
        this.contrato = contrato;
        this.codigoPredio = codigoPredio;
    }

    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public int getCodigoPredio() {
        return codigoPredio;
    }

    public void setCodigoPredio(int codigoPredio) {
        this.codigoPredio = codigoPredio;
    }

    public String getClaveIndice() {
        return "CON-" + this.idContrato;
    }

    @Override
    public String toString() {
        return "Contrato [ID->" + idContrato + ", Contrato->" + contrato + ", Codigo Predio->" + codigoPredio + "]";
    }
}
