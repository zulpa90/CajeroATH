package Cajero;


public class Main {
    public static void main(String[] args) {
        CajeroATM cajero = new CajeroATM();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad a retirar: ");
        int monto = scanner.nextInt();
        cajero.retirar(monto);
        scanner.close();
    }
}

    @Override
    public String toString() {
        return "Main []";
    }
