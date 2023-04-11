import java.util.ArrayList;
import java.util.Stack;

public class Punto2 {
    static ArrayList<Contenedor> lista = new ArrayList<>();
    static ArrayList<Stack<Contenedor>> bodega = new ArrayList<>();

    static void llenar( Stack<Contenedor> pila){   
        for(int i=0; i<10; i++){
            int numero = (int)(Math.random()*10+1);
            int numero2 = (int)(Math.random()*40+1);
            pila.push(new Contenedor(numero2, "empresa "+numero));
            System.out.println(pila.elementAt(i).getNumeroC());  
        }
        System.out.println("\n");
    }

    static void buscar(int numero, Stack<Contenedor> pila){
        while(!pila.isEmpty()){
            if(pila.peek().getNumeroC() != numero){
                Contenedor e = pila.pop();
                lista.add(e);
            }
            else{
                System.out.println("El contenedor solicitado: "+ pila.pop().getNumeroC()+" De la empresa: "+ pila.pop().getNombreEmpresa());
                break;
            }
        }
        apilar(pila);
    }

    static void apilar( Stack<Contenedor> pila){
        while(!lista.isEmpty()){
            Contenedor p = lista.remove(lista.size()-1);
            pila.push(p);
            
        
        }
    }

    static void llenarBodega(){
        for(int i=0;i<10;i++){
            bodega.add(new Stack<>());
            System.out.println("pila"+i+": ");
            llenar(bodega.get(i));
        }
    }

    static void buscarBodega(int numero){
        for(int i=0; i<10; i++){
            buscar(numero, bodega.get(i));
        }
    }

        
    

    public static void main(String[] args) {
        llenarBodega();
        buscarBodega(7);
       
    }
}
