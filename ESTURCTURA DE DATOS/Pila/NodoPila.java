package Pila;
public class NodoPila<t> {
    private t valor;
    private NodoPila<t> siguiente;

    public NodoPila(t valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    public t getValor() {
        return valor;
    }

    public void setValor(t valor) {
        this.valor = valor;
    }

    public NodoPila<t> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPila<t> siguiente) {
        this.siguiente = siguiente;
    }
}
