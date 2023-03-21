package Colas;
public class ColaDinamica<t> {
    private NodoCola<t> frente;
    private NodoCola<t> atras;
    private int tamano;

    public ColaDinamica() {
        this.frente = null;
        this.atras = null;
        this.tamano = 0;
    }

    public void enqueue(t elemento) {
        NodoCola<t> nuevoNodo = new NodoCola<>(elemento);
        if (atras == null) {
            frente = nuevoNodo;
            atras = nuevoNodo;
        } else {
            atras.siguiente = nuevoNodo;
            atras = nuevoNodo;
        }
        tamano++;
    }

    public t dequeue() {
        if (frente == null) {
            System.out.println("La cola está vacía");
            return null;
        } else {
            t elemento = frente.elemento;
            frente = frente.siguiente;
            if (frente == null) {
                atras = null;
            }
            tamano--;
            return elemento;
        }
    }

    public t peek() {
        if (frente == null) {
            System.out.println("La cola está vacía");
            return null;
        } else {
            t elemento = frente.elemento;
            return elemento;
        }
    }

    public boolean empty() {
        return frente == null;
    }

    public int search(t elemento) {
        int posicion = 1;
        NodoCola<t> actual = frente;
        while (actual != null) {
            if (actual.elemento == elemento) {
                return posicion;
            }
            actual = actual.siguiente;
            posicion++;
        }
        return -1;
    }

    public int size() {
        return tamano;
    }
}

