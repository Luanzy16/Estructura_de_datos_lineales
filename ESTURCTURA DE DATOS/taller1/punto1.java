package taller1;

import java.util.Scanner;
import Pila.PilaEstatica;
import listas.ListaDinamica;

public class punto1 {
    static ListaDinamica<Object> lista1 = new ListaDinamica<>();
    static PilaEstatica ida = new PilaEstatica(10);
    static PilaEstatica vuelta = new PilaEstatica(10);
    static Scanner leer = new Scanner(System.in);

    public static void llenarLista(){
        lista1.agregarFinal("Bogota");
        lista1.agregarFinal("cali");
        lista1.agregarFinal("medellin");
        lista1.agregarFinal("boyaca");
        lista1.agregarFinal("Valledupar");
    }

    public static void cuidades(){
        int opcion;
       for(int i=0; i<lista1.tamañoLista(); i++){
            System.out.println(lista1.getDato(i)+" Pasaste por esa cuidad: [1] si [2] no");
            opcion = leer.nextInt();
            if(opcion == 1){
                ida.push(lista1.getDato(i));
            }
        } 
        System.out.println("Ruta de vuelta: ");
       ida.mostrarPila();
       
       for(int i=0; i<ida.size()+2;i++){
            vuelta.push(ida.pop());
       }
       System.out.println("ruta de ida: ");
       vuelta.mostrarPila();
    }

    public static void main(String[] args) {
        llenarLista();
        cuidades();
        
    }


}
