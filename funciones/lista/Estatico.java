package listas;

public class Estatico{
    private int[] dato = new int[10]; 
    private int[] siguiente = new int[10];
    private int size = 0;
   

    //metodo para agreagar al final
    public void agregarFinalE(int valor){
        if(size == 0){
            dato[0] = valor;
            siguiente[0] = 1;
            size++;
        }else{
            int i = siguiente[0];
            while(siguiente[i] != 0){
                i = siguiente[i];
            }
            dato[i] = valor;
            siguiente[i] = i+1;
            size++;
        }
    }

    // metodo que muestra el arreglo
    public void mostrarListaE(){
        int i = 0;
        while(siguiente[i] != 0){
            System.out.println("["+dato[i]+"]"+" ");
            i = siguiente[i];
        }
    }

    //tamaño de la lista 
    public int tamañoListaE(){
        return size;
    }

    //retorna el dato con su indice
    public int getDatoE(int index){
        int i = 0; 
        int contador = 0;
        while(siguiente[i] != 0 && contador<index){
            siguiente[i] = siguiente[i]+1;
            contador++;
        }
        if(siguiente[i] != 0){
            return dato[index];
        }
        else{
            throw new IndexOutOfBoundsException("El indice esta fuera del rango del arrreglo");
        }
    }

    public int indexDeE(int valor){
        int i = 0;
        int actual = siguiente[i];
        while (actual != 0 && dato[i] != valor){
            actual = siguiente[i]+1;
            i++;
        }
        if(actual != 0){
            return i;
        }else{
            return -1;
        }
    }

    public boolean buscarElementoE(int valor){
        int i = 0;
        int temporal = siguiente[i];
        while(temporal != size && temporal != valor){
            temporal = siguiente[i]+1;
        }
        return temporal != 0;
    }

    public int borrarFinalE(){
        int i=0;
        int valor = dato[size];
        int temporal = siguiente[i];

        while(temporal+1 != siguiente[size-1]){
            temporal = temporal+1;
        }
        siguiente[size-1] = 0;
        return valor;
    }
}