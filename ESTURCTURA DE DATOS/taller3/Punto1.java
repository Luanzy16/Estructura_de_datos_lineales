import java.util.LinkedList;

public class Punto1 {
    static LinkedList<Estudiante> cola = new LinkedList<>();

    static void addTicket() {
        System.out.println("cola inical");
        for (int i = 0; i < 5; i++) {
            int numero = (int) (Math.random() * 5);
            cola.add(new Estudiante("estudinate" + (i+1), numero));
            System.out.println(cola.get(i).getTicket());
        }
    }

    static void removeall(){
        System.out.println("Los retirados son: ");
        for(int i=0; i<cola.size();i++){
            if(cola.get(i).getTicket()==0){    
                System.out.println(cola.remove(i).getNombre());
            }
        }
    }

    static void remove(){
        for(int i=5; i<0;i--){
            cola.get(i-1).setTicket(0);;
           System.out.println(cola.remove(cola.get(i-1)));  
        }
    }


    public static void main(String[] args) {
        addTicket();
        removeall();
        remove();
    }
}
