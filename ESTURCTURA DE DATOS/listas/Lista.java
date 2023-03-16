package listas;

public class Lista<T> {
    protected Nodo<T> inicio, fin; // Punteros para saber donde esta el inicio y el fin

    public Lista() {
        inicio = null;
        fin = null;
    }

    // Metodo para Agregar un Nodo al incio
    public void agregarInicio(T elemento) {
        // Creando nodo
        inicio = new Nodo<T>(elemento, inicio);
        if (fin == null) {
            fin = inicio;
        }
    }

    // Metodo para agredar un Nodo al final
    public void agregarFinal(T elemento) {
        if (!estaVacia()) {
            fin.siguiente = new Nodo<T>(elemento);
            fin = fin.siguiente;
        } else {
            inicio = fin = new Nodo<T>(elemento);
        }
    }

    // metodo para agregar un nodo entre otros dos
    public void agregarEntre(Nodo<T> nodo, int posicion) {
        Nodo<T> temporal = inicio;
        int i = 0;

        while (i < posicion && temporal.siguiente != null) {
            i++;
            temporal = temporal.siguiente;
        }
        nodo.siguiente = temporal.siguiente;
        temporal.siguiente = nodo;

    }

    // metodo para eliminar un nodo al inicio
    public T borrarInicio() {
        T elemento = inicio.dato;
        if (inicio == fin) {
            inicio = null;
            fin = null;
        } else {
            inicio = inicio.siguiente;
        }
        return elemento;
    }

    // metodo para eliminar un nodo al final
    public T borrarFinal() {
        T elemento = fin.dato;
        if (inicio == fin) {
            inicio = fin = null;
        } else {
            Nodo<T> temporal = inicio;
            while (temporal.siguiente != fin) {
                temporal = temporal.siguiente;
            }
            fin = temporal;
            fin.siguiente = null;
        }
        return elemento;
    }

    // metodo para eliminar un nodo en especifico
    public void eliminar(T elemento) {
        if (!estaVacia()) {
            if (inicio == fin && elemento == inicio.dato) {
                inicio = fin = null;
            } else if (elemento == inicio.dato) {
                inicio = inicio.siguiente;
            } else {
                Nodo<T> anterior, temporal;
                anterior = inicio;
                temporal = inicio.siguiente;
                while (temporal != null && temporal.dato != elemento) {
                    anterior = anterior.siguiente;
                    temporal = temporal.siguiente;
                }
                if (temporal != null) {
                    anterior.siguiente = temporal.siguiente;
                    if (temporal == fin) {
                        fin = anterior;
                    }
                }
            }
        }
    }

    // metodo para buscar un elemento
    public boolean buscarElemento(T elemento) {
        Nodo<T> temporal = inicio;
        while (temporal != null && temporal.dato != elemento) {
            temporal = temporal.siguiente;
        }
        return temporal != null;
    }

    // Metodo para mostrar los datos
    public void mostrarLista() {
        Nodo<T> recorrer = inicio;
        while (recorrer != null) {
            System.out.println("[" + recorrer.dato + "]");
            recorrer = recorrer.siguiente;
        }
    }

    // Metodo para ver si la lista esta vacia
    public boolean estaVacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    // metodo que retorna el dato con ayuda de su indice
    public T getDato(int index){
        Nodo<T> actual = inicio;
        int contador = 0;
        while (actual != null && contador < index) {
        actual = actual.siguiente;
        contador++;
        }
        if (actual != null) {
            return actual.dato;
        } else {
            throw new IndexOutOfBoundsException("El índice está fuera de los límites de la lista");
        }
    }

    // metodo que retorna el tamaño del arreglo
    public int tamañoLista() {
        int tamaño = 0;
        Nodo<T> actual = inicio;
        while (actual != null) {
            tamaño++;
            actual = actual.siguiente;
        }
        return tamaño;

    }

    // Devuelve la posición del elemento puesto como parámetro
    public int indexDe(T elemento) {
        Nodo<T> actual = inicio;
        int index = 0;
        while (actual != null && actual.dato != elemento) {
            actual = actual.siguiente;
            index++;
        }
        if (actual != null) {
            return index;
        } else {
         return -1;
        }

    }
}
