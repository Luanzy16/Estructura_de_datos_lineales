import java.util.*;


public class Punto5 {
    static Queue<Character> cola = new LinkedList<>();
    
    static void eliminarRepetidos() {
        Stack<Character> pila = new Stack<>();
        char anterior = '\0';

        while (!cola.isEmpty()) {
            char actual = cola.poll();
            if (actual != anterior) {
                pila.push(actual);
                anterior = actual;
            }
        }
        
        while (!pila.isEmpty()) {
            cola.offer(pila.pop());
        }
    }

    public static void main(String[] args) {
        String cadena = "AAABCDEFFFGHIJJJJKLMNNNNNOPQQQQRSTVWWWXXYYYZZZZZ";

        for (int i = 0; i < cadena.length(); i++) {
            cola.offer(cadena.charAt(i));
        }

        eliminarRepetidos();

        while (!cola.isEmpty()) {
            System.out.print(cola.poll());
        }
        System.out.println();
    }
}


