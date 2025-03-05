package cajero;

public interface RetiroHandler {

    void setNextHandler (RetiroHandler nextHandler);
    boolean manejar (RetiroRequest  retiroRequest);
}
