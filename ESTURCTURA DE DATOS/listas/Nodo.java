package listas;
public class Nodo<T> {
    public T dato;
    public Nodo<T> siguiente; //Puntero enlace

    //Constructor para insertar al final
    public Nodo (T d){
        this.dato=d;
        this.siguiente = null;
    }

    //Contructor para insertar en el inicio
    public Nodo(T d, Nodo<T> n){
        dato = d;
        siguiente = n;
    }
}
