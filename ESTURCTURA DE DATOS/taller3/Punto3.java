import java.util.*;


public class Punto3 {
    static ArrayList<Integer> lista = new ArrayList<>();
    static Stack<Integer> pila = new Stack<>();
    static LinkedList<Integer> cola = new LinkedList<>();

    static void llenar(){
        System.out.println("numeros en la lista ");
        for(int i=0; i<10;i++){
            int num = (int)(Math.random()*8+1);
            System.out.println(num); 
            lista.add(num);
        }
    }

    static void comparar(int dato){
        System.out.println("numeros en la pila");
        for(int i = 0; i<10; i++){
            if(lista.get(i)==dato){
                pila.push(lista.get(i));
                System.out.println(pila.peek());
            }
        }
    }
    
    static void llenarCola(){
        int cont = 0;
        System.out.println("numeros en la cola");
        while(!pila.isEmpty()){
            cola.add(pila.pop());
            System.out.println(cola.peek());
            cont++;
        }
        System.out.println("la cantidad del numero indicado es: "+ cont);
    }
    public static void main(String[] args) {
        llenar();
        comparar(8);
        llenarCola();
    }
}
