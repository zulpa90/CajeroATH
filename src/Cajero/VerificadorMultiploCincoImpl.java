package cajero;

public class VerificadorMultiploCincoImpl implements IVerificadorMultiploCinco {

    @Override
    public boolean verificarMultiploDeCinco(int montoRetiro) {
        return montoRetiro % 5 == 0;
    }
}
