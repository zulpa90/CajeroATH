package cajero;

public class Billetes {

    private int cienMil, cicuentaMil, veinteMil, diezMil, cincoMil;

    public Billetes(int cienMil, int cicuentaMil, int veinteMil, int diezMil, int cincoMil) {
        this.cienMil = cienMil;
        this.cicuentaMil = cicuentaMil;
        this.veinteMil = veinteMil;
        this.diezMil = diezMil;
        this.cincoMil = cincoMil;
    }

    public int getCienMil() {
        return cienMil;
    }

    public void setCienMil(int cienMil) {
        this.cienMil = cienMil;
    }

    public int getCicuentaMil() {
        return cicuentaMil;
    }

    public void setCicuentaMil(int cicuentaMil) {
        this.cicuentaMil = cicuentaMil;
    }

    public int getVeinteMil() {
        return veinteMil;
    }

    public void setVeinteMil(int veinteMil) {
        this.veinteMil = veinteMil;
    }

    public int getDiezMil() {
        return diezMil;
    }

    public void setDiezMil(int diezMil) {
        this.diezMil = diezMil;
    }

    public int getCincoMil() {
        return cincoMil;
    }

    public void setCincoMil(int cincoMil) {
        this.cincoMil = cincoMil;
    }
}
