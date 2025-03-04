package cajero;

public class ConsultarSaldoImpl implements IConsultarSaldo {
    @Override
    public boolean consultarSaldo(int montoRetiro, int saldoCliente) {
        return montoRetiro<=saldoCliente;
    }
}
