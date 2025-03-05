package cajero;

import java.util.Map;

public class ConsultarDenominacionBilletesHandler implements RetiroHandler {

    private RetiroHandler nextHandler;

    @Override
    public void setNextHandler(RetiroHandler nextHandler) {
        this.nextHandler=nextHandler;
    }

    @Override
    public boolean manejar(RetiroRequest retiroRequest) {
        int monto = retiroRequest.getMonto();
        Map<Integer, Integer> billetes = retiroRequest.getBilletesDisponibles();
        int restante = monto;
        int[] denominaciones = {100000, 50000, 20000, 10000, 5000};

        for (int denom : denominaciones) {
            int billetesNecesarios = restante / denom;
            int disponibles = billetes.getOrDefault(denom, 0);

            if (billetesNecesarios > 0 && disponibles > 0) {
                int usados = Math.min(billetesNecesarios, disponibles);
                restante -= usados * denom;
                System.out.println("Cantidad de billetes de $" + denom + " entregados: " + usados + ". Saldo restante: $" + restante);
            }
        }

        if (restante > 0) {
            System.out.println("Error: No hay billetes suficientes para suplir el monto solicitado.");
            return false;
        }
        return nextHandler == null || nextHandler.manejar(retiroRequest);
    }
}
