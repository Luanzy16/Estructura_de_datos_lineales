package Colas;
import java.util.ArrayList;

public class ColaList {
    public ArrayList<Object> cola = new ArrayList<>();
    

    public boolean isEmpty(){
        return cola.isEmpty();
    }

    public Object peekf(){
        if(!isEmpty()){
            return cola.get(0);
        }
        else{
            return null;
        }
        
    }

    public Object peekB(){
        if(!isEmpty()){
            return cola.get(cola.size()-1);
        }
        else{
            return null;
        }
    }

    public int size(){
        return cola.size();
    }

    public void enQueue(Object date){
        cola.add(date);
    }

    public Object deQueue(){
        if(!isEmpty()){
            return cola.remove(0);
        } 
        else{
            return null;
        }       
    }
}
