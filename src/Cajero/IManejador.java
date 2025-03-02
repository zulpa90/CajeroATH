package Cajero;

abstract class IManejador {
    protected IManejador siguiente;
    
    public void setSiguiente(IManejador manejador) {
        this.siguiente = manejador;
    }
    
    public abstract void dispensar(int cantidad);
}
