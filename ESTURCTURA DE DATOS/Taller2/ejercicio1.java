package Taller2;

import java.util.Scanner;
import Pila.PilaEstatica;
import listas.ListaDinamica;

public class ejercicio1 {
    static ListaDinamica<Object> lista1 = new ListaDinamica<>();
    static PilaEstatica ida = new PilaEstatica(10);
    static PilaEstatica vuelta = new PilaEstatica(10);
    static Scanner leer = new Scanner(System.in);

    public static void llenarLista(){
        for(int i=0; i<5; i++){
            Ruta pueblo = new Ruta();
            pueblo.setPueblo(leer.nextLine());
            pueblo.setRuta(leer.nextInt());
            lista1.agregarFinal(pueblo);
        }
    }

    public static void ida(){
        
        for(int i=0; i<5; i++){
            lista1.mostrarLista();
        }
    }

    public static void main(String[] args) {
        llenarLista();
        ida();
    }

}
