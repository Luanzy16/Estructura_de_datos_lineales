package Colas;
public class NodoCola<t> {
    t elemento;
    NodoCola<t> siguiente;

    public NodoCola(t elemento) {
        this.elemento = elemento;
        this.siguiente = null;
    }

    public t getElemento() {
        return elemento;
    }

    public void setElemento(t elemento) {
        this.elemento = elemento;
    }

    public NodoCola<t> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCola<t> siguiente) {
        this.siguiente = siguiente;
    }

    
}

