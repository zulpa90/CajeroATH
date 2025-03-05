import java.util.Scanner;

import cajero.CajeroATH;

public class App {
    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el monto a retirar: $");
        int montoRetiro = input.nextInt();

        CajeroATH cajero = new CajeroATH();
        cajero.realizarTransaccionRetiro(montoRetiro);
    }
}
