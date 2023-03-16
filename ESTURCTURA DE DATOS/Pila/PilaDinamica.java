package Pila;
public class PilaDinamica {
    private NodoPila tope;
    private int tamano;

    public PilaDinamica() {
        this.tope = null;
        this.tamano = 0;
    }

    public void push(int elemento) {
        NodoPila nuevoNodo = new NodoPila(elemento);
        if (tope == null) {
            tope = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(tope);
            tope = nuevoNodo;
        }
        tamano++;
    }

    public int pop() {
        if (tope == null) {
            System.out.println("La pila está vacía");
            return -1;
        } else {
            int elemento = tope.getValor();
            tope = tope.getSiguiente();
            tamano--;
            return elemento;
        }
    }

    public int peek() {
        if (tope == null) {
            System.out.println("La pila está vacía");
            return -1;
        } else {
            return tope.getValor();
        }
    }

    public boolean empty() {
        return tope == null;
    }

    public int search(int elemento) {
        int posicion = -1;
        NodoPila actual = tope;
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
        NodoPila aux = tope;
        while(aux != null){
        System.out.println(aux.getValor());
        aux = aux.getSiguiente();
        }
    }
        
}