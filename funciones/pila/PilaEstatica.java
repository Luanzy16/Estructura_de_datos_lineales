public class PilaEstatica {
    private int[] elementos;
    private int tope;
    private int capacidad;

    public PilaEstatica(int capacidad) {
        this.capacidad = capacidad;
        this.elementos = new int[capacidad];
        this.tope = -1;
    }

    public void push(int elemento) {
        if (tope == capacidad - 1) {
            System.out.println("La pila está llena");
        } else {
            elementos[++tope] = elemento;
        }
    }

    public int pop() {
        if (tope == -1) {
            System.out.println("La pila está vacía");
            return -1;
        } else {
            return elementos[tope--];
        }
    }

    public int peek() {
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

    public int search(int elemento) {
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
}

