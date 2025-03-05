package cajero;

import java.util.HashMap;
import java.util.Map;

public class CajeroATH {

    public void realizarTransaccionRetiro(int montoRetiro) {
        RetiroHandler multiploHandler = new VerificadorMultiploCincoHandler();
        RetiroHandler saldoHandler = new ConsultarSaldoHandler();
        RetiroHandler billetesHandler = new ConsultarDenominacionBilletesHandler();
        RetiroHandler procesarHandler = new DispensadorHandler();

        multiploHandler.setNextHandler(billetesHandler);
        saldoHandler.setNextHandler(multiploHandler);
        billetesHandler.setNextHandler(procesarHandler);

        Map<Integer, Integer> billetesDisponibles = new HashMap<>();
        billetesDisponibles.put(100000, 3);
        billetesDisponibles.put(50000, 2);
        billetesDisponibles.put(20000, 2);
        billetesDisponibles.put(10000, 2);
        billetesDisponibles.put(5000, 2);

        RetiroRequest request = new RetiroRequest(montoRetiro, 285000, billetesDisponibles);

        boolean exito = saldoHandler.manejar(request);
        if (exito) {
            System.out.println("Operación completada.");
        } else {
            System.out.println("Operación fallida.");
        }
    }
}