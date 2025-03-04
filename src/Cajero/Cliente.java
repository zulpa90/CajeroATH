package cajero;

public class Cliente {

    private int saldoTotal;

    public Cliente(int saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public int getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(int saldoTotal) {
        this.saldoTotal = saldoTotal;
    }
}
