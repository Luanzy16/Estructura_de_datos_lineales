package listas;
public class NodoLista<T> {
    public T dato;
    public NodoLista<T> siguiente; //Puntero enlace

    //Constructor para insertar al final
    public NodoLista (T d){
        this.dato=d;
        this.siguiente = null;
    }

    //Contructor para insertar en el inicio
    public NodoLista(T d, NodoLista<T> n){
        dato = d;
        siguiente = n;
    }
}
