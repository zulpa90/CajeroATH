package Cajero;

public class CajeroATM {

    private void IManejador (m100, m50, m20, m10, m5){

    public CajeroATM() {

        ManejadorBillete m100 = new ManejadorBillete(100000);
        ManejadorBillete m50 = new ManejadorBillete(50000);
        ManejadorBillete m20 = new ManejadorBillete(20000);
        ManejadorBillete m10 = new ManejadorBillete(10000);
        ManejadorBillete m5 = new ManejadorBillete(5000);

        m100.setnext(m50);
        m50.setnext(m20);
        m20.setnext(m10);
        m10.setnext(m5);

    }

    }

    

    public void dispensar(int monto, int cantidad) {

        if (cantidad % 5000 == 0) {
            System.out.println("Error, ingrese en múltiplos de 5000");
        } else {
            ManejadorBillete m100;

        }
}

}