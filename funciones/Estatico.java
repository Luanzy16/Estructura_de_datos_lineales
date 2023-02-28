package listas;
//System.arraycopy: Método que copia desde la posición origen de un array a un array destino en una posición específica. El número de elementos copiados también se identifica como parámetro.

public class Estatico {
    private static final int MAX_ESPACIO = 0;

    //  FUNCIONES PARA INSERTAR ELEMENTOS;

    public static void agregarAlFinal(int[] arreglo, int elemento) {
        // Comprobar si el arreglo está lleno
        if (arreglo.length == MAX_ESPACIO) {
            System.out.println("No se puede agregar el elemento. El arreglo está lleno.");
            return;
        }
    
        // Agregar el elemento al final del arreglo
        arreglo[arreglo.length - 1] = elemento;
    }    

    public static void insertarEntreElementos(int[] arreglo, int elemento, int indice1, int indice2) {
        // Comprobar si el arreglo está lleno
        if (arreglo.length == MAX_ESPACIO) {
            System.out.println("No se puede insertar el elemento. El arreglo está lleno.");
            return;
        }

        // Comprobar si los índices son válidos
        if (indice1 < 0 || indice2 >= arreglo.length || indice1 >= indice2) {
            System.out.println("Los índices de inserción no son válidos.");
            return;
        }
    
        // Desplazar los elementos hacia la derecha
        for (int i = arreglo.length - 1; i > indice2; i--) {
            arreglo[i] = arreglo[i - 1];
        }
    
        // Insertar el elemento entre los dos índices
        arreglo[indice1 + 1] = elemento;
    }
    
    public static void insertarAlInicio(int[] arreglo, int elemento) {
        int[] nuevoArreglo = new int[arreglo.length + 1];
        nuevoArreglo[0] = elemento;
        System.arraycopy(arreglo, 0, nuevoArreglo, 1, arreglo.length);
        System.arraycopy(nuevoArreglo, 0, arreglo, 0, nuevoArreglo.length);
    }

    public static void insertarAlFinal(int[] arreglo, int elemento) {
        int[] nuevoArreglo = new int[arreglo.length + 1];
        System.arraycopy(arreglo, 0, nuevoArreglo, 0, arreglo.length);
        nuevoArreglo[arreglo.length] = elemento;
        System.arraycopy(nuevoArreglo, 0, arreglo, 0, nuevoArreglo.length);
    }
    

    //FUNCIONES PARA ELIMINAR ELEMENTOS
    
    public static void eliminarElemento(int[] arreglo, int posicion) {
        int[] nuevoArreglo = new int[arreglo.length - 1];
        System.arraycopy(arreglo, 0, nuevoArreglo, 0, posicion);
        System.arraycopy(arreglo, posicion + 1, nuevoArreglo, posicion, arreglo.length - posicion - 1);
        System.arraycopy(nuevoArreglo, 0, arreglo, 0, nuevoArreglo.length);
    }

    public static void eliminarAlInicio(int[] arreglo) {
        int[] nuevoArreglo = new int[arreglo.length - 1];
        System.arraycopy(arreglo, 1, nuevoArreglo, 0, arreglo.length - 1);
        System.arraycopy(nuevoArreglo, 0, arreglo, 0, nuevoArreglo.length);
    }
    
    public static void eliminarAlFinal(int[] arreglo) {
        int[] nuevoArreglo = new int[arreglo.length - 1];
        System.arraycopy(arreglo, 0, nuevoArreglo, 0, arreglo.length - 1);
        System.arraycopy(nuevoArreglo, 0, arreglo, 0, nuevoArreglo.length);
    }
    
    //FUNCION PARA BUSCAR UN ELEMENTO
   
    public static void buscarElemento(int[] arreglo, int elemento) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == elemento) {
                if (i != -1) {
                    System.out.println("El elemento " + elemento + " se encuentra en la posición " + i);
                } else {
                    System.out.println("El elemento " + elemento + " no se encuentra en el arreglo");
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5};
        int elemento = 3;
         buscarElemento(arreglo, elemento);
    }
}
