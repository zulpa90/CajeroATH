package cajero;

public class DispensadorHandler implements RetiroHandler {

    private RetiroHandler nextHandler;

    @Override
    public void setNextHandler(RetiroHandler nextHandler) {}

    @Override
    public boolean manejar(RetiroRequest retiroRequest) {

        System.out.println("Retiro exitoso de dinero...");
        System.out.println("Monto retirado: $" + retiroRequest.getMonto());
        System.out.println("Saldo final del cliente: " + (retiroRequest.getSaldoDisponible() - retiroRequest.getMonto()));
        return true;
    }
}
