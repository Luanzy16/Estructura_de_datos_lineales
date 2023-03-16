package Colas;
public class ColaDinamica {
    private NodoCola frente;
    private NodoCola atras;
    private int tamano;

    public ColaDinamica() {
        this.frente = null;
        this.atras = null;
        this.tamano = 0;
    }

    public void enqueue(int elemento) {
        NodoCola nuevoNodo = new NodoCola(elemento);
        if (atras == null) {
            frente = nuevoNodo;
            atras = nuevoNodo;
        } else {
            atras.siguiente = nuevoNodo;
            atras = nuevoNodo;
        }
        tamano++;
    }

    public int dequeue() {
        if (frente == null) {
            System.out.println("La cola está vacía");
            return -1;
        } else {
            int elemento = frente.elemento;
            frente = frente.siguiente;
            if (frente == null) {
                atras = null;
            }
            tamano--;
            return elemento;
        }
    }

    public int peek() {
        if (frente == null) {
            System.out.println("La cola está vacía");
            return -1;
        } else {
            int elemento = frente.elemento;
            return elemento;
        }
    }

    public boolean empty() {
        return frente == null;
    }

    public int search(int elemento) {
        int posicion = 1;
        NodoCola actual = frente;
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

