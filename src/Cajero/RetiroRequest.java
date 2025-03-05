package cajero;

import java.util.Map;

public class RetiroRequest {

    private int monto;
    private int saldoDisponible;
    private Map<Integer, Integer> billetesDisponibles;

    public RetiroRequest(int monto, int saldoDisponible, Map<Integer, Integer> billetesDisponibles) {
        this.monto = monto;
        this.saldoDisponible = saldoDisponible;
        this.billetesDisponibles = billetesDisponibles;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(int saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public Map<Integer, Integer> getBilletesDisponibles() {
        return billetesDisponibles;
    }

    public void setBilletesDisponibles(Map<Integer, Integer> billetesDisponibles) {
        this.billetesDisponibles = billetesDisponibles;
    }
}
