package cajero;

public class ConsultarSaldoHandler implements RetiroHandler {

    private RetiroHandler nextHandler;

    @Override
    public void setNextHandler(RetiroHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public boolean manejar(RetiroRequest retiroRequest) {
        if (retiroRequest.getMonto() > retiroRequest.getSaldoDisponible()) {
            System.out.println("Error: Saldo insuficiente.");
            return false;
        }
        return nextHandler == null || nextHandler.manejar(retiroRequest);
    }

}

