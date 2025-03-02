package Cajero;

class ManejadorBillete extends IManejador {
    private int denominacion;
    
    public ManejadorBillete(int denominacion) {
        this.denominacion = denominacion;
    }
    
    @Override
    public void dispensar(int cantidad) {
        if (cantidad >= denominacion) {
            int numBilletes = cantidad / denominacion;
            int restante = cantidad % denominacion;
            System.out.println("Dispensando " + numBilletes + " billetes de $" + denominacion);
            
            if (restante > 0 && siguiente != null) {
                siguiente.dispensar(restante);
            } else if (restante > 0) {
                System.out.println("No se puede dispensar $" + restante + " con las denominaciones disponibles.");
            }
        } else if (siguiente != null) {
            siguiente.dispensar(cantidad);
        }
    }

    public void setm100(ManejadorBillete m50) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setm100'");
    }

    public void setnext(ManejadorBillete m50) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setnext'");
    }
}
