package Pila;
public class PilaDinamica<t> {
    private NodoPila<t> tope;
    private int tamano;

    public PilaDinamica() {
        this.tope = null;
        this.tamano = 0;
    }

    public void push(t elemento) {
        NodoPila<t> nuevoNodo = new NodoPila<>(elemento);
        if (tope == null) {
            tope = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(tope);
            tope = nuevoNodo;
        }
        tamano++;
    }

    public t pop() {
        if (tope == null) {
            System.out.println("La pila está vacía");
            return null;
        } else {
            t elemento = tope.getValor();
            tope = tope.getSiguiente();
            tamano--;
            return elemento;
        }
    }

    public t peek() {
        if (tope == null) {
            System.out.println("La pila está vacía");
            return null;
        } else {
            return tope.getValor();
        }
    }

    public boolean empty() {
        return tope == null;
    }

    public int search(t elemento) {
        int posicion = -1;
        NodoPila<t> actual = tope;
        int distancia = 1;
        while (actual != null) {
            if (actual.getValor() == elemento) {
                posicion = distancia;
                break;
            }
            actual = actual.getSiguiente();
            distancia++;
        }
        return posicion;
    }

    public int size() {
        return tamano;
    }

    public void muestra(){
        NodoPila<t> aux = tope;
        while(aux != null){
        System.out.println(aux.getValor());
        aux = aux.getSiguiente();
        }
    }
        
}