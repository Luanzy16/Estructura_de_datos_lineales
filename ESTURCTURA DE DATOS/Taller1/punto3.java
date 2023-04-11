package Taller1;
import java.util.Random;

import Pila.PilaDinamica;
import listas.ListaDinamica;

public class punto3 {
    static ListaDinamica<Producto> listaP = new ListaDinamica<>();
    static PilaDinamica<Producto> pilaP = new PilaDinamica<>();
    static Random rand = new Random();

    public static void llenar(){
        int numProductos = rand.nextInt(21) + 10; 

        for (int i = 1; i <= numProductos; i++) {
            String nombre = "producto" + i;
            int cantidad = rand.nextInt(11) + 10; 
            double precio = rand.nextFloat() * 100; 
            Producto producto = new Producto(100 + i, nombre, cantidad, precio);
            listaP.agregarFinal(producto);
        }
    }

    public static void llenarPila(){
        for (int i = 0; i < 10; i++) {
            int codigoProducto = rand.nextInt(31) + 100; 
            for (int j=0; j<listaP.tamañoLista();j++) {
                if (listaP.getDato(j).getCodigo() == codigoProducto) {
                    pilaP.push(listaP.getDato(j));
                    listaP.eliminar(listaP.getDato(j));
                    break;
                }
            }
        }
    }

    public static void mostrarPila(){
        double totalAPagar = 0;
        while (!pilaP.empty()) {
            Producto producto = pilaP.pop();
            double valorAPagar = producto.getCantidad() * producto.getPrecio();
            totalAPagar += valorAPagar;
            System.out.println(producto.getNombre() + " - Valor a pagar: " + valorAPagar);
            System.out.println("Total a pagar por los productos en la pila: " + totalAPagar);
        }
    }

    public static void mostrarLista(){
        double precioTotal = 0;
        for (int i= 0; i<listaP.tamañoLista();i++) {
            precioTotal += listaP.getDato(i).getPrecio();
        }
        double precioMedio = precioTotal / listaP.tamañoLista();
        System.out.println("Precio medio de todos los productos: " + precioMedio);
        System.out.println("Cantidad de productos en la lista: " + listaP.tamañoLista());
    }
    public static void main(String[] args) {
        llenar();
        llenarPila();
        System.out.println("Productos de la pila");
        mostrarPila();
        System.out.println("productos de la lista");
        mostrarPila();
    }

}
