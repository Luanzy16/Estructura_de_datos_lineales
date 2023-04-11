import java.util.*;

public class Punto4 {
    public static boolean validaPila(String cadena) {
        Stack<Character> pila = new Stack<>();
        int longitud = cadena.length();
        int mitad = longitud / 2;
        
        for (int i = 0; i < mitad; i++) {
            pila.push(cadena.charAt(i));
        }
        
        for (int i = mitad; i < longitud; i++) {
            if (cadena.charAt(i) != pila.pop()) {
                return false;
            }
        }
        
        return true;
    }

    public static boolean validaCola(String cadena) {
        Queue<Character> cola = new LinkedList<>();
        int longitud = cadena.length();
        int mitad = longitud / 2;

        for (int i = longitud - 1; i >= mitad; i--) {
            cola.offer(cadena.charAt(i));
        }

        for (int i = 0; i < mitad; i++) {
            if (cadena.charAt(i) != cola.poll()) {
                return false;
            }
        }
        
        return true;
    }


    public static void main(String[] args) {
        System.out.println(validaCola("osos&osos"));
        System.out.println(validaPila("osos&osos"));
        ;
    }
    
    
    
}
