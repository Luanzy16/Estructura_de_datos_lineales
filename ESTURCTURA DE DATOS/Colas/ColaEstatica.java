package Colas;
public class ColaEstatica {
    private int[] elementos;
    private int frente;
    private int atras;
    private int capacidad;

    public ColaEstatica(int capacidad) {
        this.capacidad = capacidad;
        this.elementos = new int[capacidad];
        this.frente = 0;
        this.atras = -1;
    }

    public void encola(int elemento) {
        if (atras == capacidad - 1) {
            System.out.println("La cola está llena");
        } else {
            elementos[++atras] = elemento;
        }
    }

    public int decola() {
        if (frente > atras) {
            System.out.println("La cola está vacía");
            return -1;
        } else {
            int elemento = elementos[frente++];
            return elemento;
        }
    }

    public int peek() {
        if (frente > atras) {
            System.out.println("La cola está vacía");
            return -1;
        } else {
            int elemento = elementos[frente];
            return elemento;
        }
    }

    public boolean empty() {
        return frente > atras;
    }

    public int search(int elemento) {
        int posicion = -1;
        for (int i = frente; i <= atras; i++) {
            if (elementos[i] == elemento) {
                posicion = i - frente + 1;
                break;
            }
        }
        return posicion;
    }

    public int size() {
        return atras - frente + 1;
    }
}
