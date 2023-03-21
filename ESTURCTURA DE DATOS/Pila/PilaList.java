package Pila;

import java.util.ArrayList;

public class PilaList<t> {
   private ArrayList<t> elementos;
   
   public PilaList(){
    elementos = new ArrayList<t>();
   }

   public void push(t dato){
    elementos.add(dato);
   }

   public t pop(){
    if(estaVacia()){
        return null;
    }
    else{
        return elementos.remove(elementos.size()-1);
    }
   }

   public t peek(){
    if(estaVacia()){
        return null;
    }
    else{
        return elementos.get(elementos.size()-1);
    }
   }

   public boolean estaVacia(){
    return elementos.isEmpty();
   }

   public void muestra(){
    for (int i = elementos.size() - 1; i >= 0; i--) {
        System.out.println(elementos.get(i));
    }
   }


}
