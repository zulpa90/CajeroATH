package cajero;

public class CajeroATM {

    private final IVerificadorMultiploCinco verificadorMultiploCinco = new VerificadorMultiploCincoImpl();
    private final IConsultarSaldo consultarSaldo = new ConsultarSaldoImpl();
    private final IConsultarDenominacionBilletes denominacionBilletes = new ConsultarDenominacionBilletesImpl();
    private final IDispensador dispensador = new DispensadorImpl();

    private final Cliente cliente = new Cliente(500000);
    private final Billetes billetes = new Billetes(3, 2, 2, 2, 2);;

    public void realizarTransaccionRetiro(int montoRetiro){
        verificadorMultiploCinco.verificarMultiploDeCinco(montoRetiro);
        consultarSaldo.consultarSaldo(montoRetiro, cliente.getSaldoTotal());
        denominacionBilletes.consultarDenominacionBilletes(montoRetiro, billetes);
        dispensador.dispensarDinero(montoRetiro, cliente);
    }
}