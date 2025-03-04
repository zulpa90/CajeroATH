import java.util.Scanner;

import cajero.CajeroATM;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.printf("Ingrese el monto a retirar: $");
        int montoRetiro = input.nextInt();

        CajeroATM cajero = new CajeroATM();
        cajero.realizarTransaccionRetiro( montoRetiro);
    }
}
