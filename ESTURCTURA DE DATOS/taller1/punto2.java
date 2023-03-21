package taller1;

import Pila.PilaDinamica;
import listas.ListaDinamica;

public class punto2 {
    static ListaDinamica<Integer> bodega0 = new ListaDinamica<>();
    static PilaDinamica<Integer> bodega1 = new PilaDinamica<>();
    static PilaDinamica<Integer> bodega2 = new PilaDinamica<>();

    public static void llenarBodegas(){
       
        for (int i = 0; i < 20 ; i++){
            int numero = (int) (Math.random() * 2820 + 2009);
            bodega0.agregarFinal(numero);
        }
    }

    public static void pasar(){
        for (int i=0; i<bodega0.tamañoLista(); i++) {
            if (bodega0.getDato(i) >=  2010 && bodega0.getDato(i) <= 2500){
                bodega1.push(bodega0.getDato(i));
                bodega0.eliminar(bodega0.getDato(i));
            }else if (bodega0.getDato(i) >=  2501 && bodega0.getDato(i) <= 2820){
                bodega2.push(bodega0.getDato(i));
                bodega0.eliminar(bodega0.getDato(i));
            }

        }

    }

    public static void mostrarDatos(){
        System.out.println("bodega 1:");
        bodega1.muestra();
        System.out.println("bodega 2: ");
        bodega2.muestra();
    }

    public static void main(String[] args) {
        llenarBodegas();
        pasar();
        mostrarDatos();
    }

}

