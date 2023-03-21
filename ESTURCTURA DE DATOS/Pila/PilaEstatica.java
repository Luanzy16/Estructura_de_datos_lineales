package Pila;

public class PilaEstatica {
    private Object[] elementos;
    private int tope;
    private int capacidad;

    public PilaEstatica(int capacidad) {
        this.capacidad = capacidad;
        this.elementos = new Object[capacidad];
        this.tope = -1;
    }

    public void push(Object elemento) {
        if (tope == capacidad - 1) {
            System.out.println("La pila está llena");
        } else {
            elementos[++tope] = elemento;
        }
    }

    public Object pop() {
        if (tope == -1) {
            System.out.println("La pila está vacía");
            return null;
        } else {
            return elementos[tope--];
        }
    }

    public Object peek() {
        if (tope == -1) {
            System.out.println("La pila está vacía");
            return -1;
        } else {
            return elementos[tope];
        }
    }

    public boolean empty() {
        return tope == -1;
    }

    public Object search(Object elemento) {
        int posicion = -1;
        for (int i = 0; i <= tope; i++) {
            if (elementos[i] == elemento) {
                posicion = tope - i + 1;
                break;
            }
        }
        return posicion;
    }

    public int size() {
        return tope + 1;
    }

    public void mostrarPila() {
        for (int i = tope; i >= 0; i--) {
            System.out.print(elementos[i] + "\n");
        }
        System.out.println();
    }
    
}

