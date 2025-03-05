package cajero;

public class VerificadorMultiploCincoHandler implements RetiroHandler {

    private RetiroHandler nextHandler;

    @Override
    public void setNextHandler(RetiroHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public boolean manejar(RetiroRequest retiroRequest) {
        if (retiroRequest.getMonto() % 5000 != 0) {
            System.out.println("Error: El monto debe ser múltiplo de 5.000.");
            return false;
        }
        return nextHandler == null || nextHandler.manejar(retiroRequest);
    }
}