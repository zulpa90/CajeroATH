package cajero;

public class DispensadorImpl implements IDispensador {
    @Override
    public Cliente dispensarDinero(int montoRetiro, Cliente cliente) {
        cliente.setSaldoTotal(cliente.getSaldoTotal() - montoRetiro);

        System.out.println("Retirando dinero del cliente...");
        System.out.println("Saldo final del cliente: " + cliente.getSaldoTotal());
        return cliente;
    }
}
