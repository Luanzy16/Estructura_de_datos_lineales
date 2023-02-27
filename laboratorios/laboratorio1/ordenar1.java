import java.util.ArrayList;

public class ordenar1 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);

        System.out.println("Lista sin ordenar: " + lista);
        System.out.println("Lista ordenada: ");

        invertir(lista, lista.size()-1);
    }

    public static Object invertir(ArrayList lista, int index){
        int ultimoE = lista.size()-1;
        int primeroE = lista.size()-lista.size();

        if(index<0){
            return 0;
        }
        else{
            lista.add(primeroE, lista.get(ultimoE));
            lista.remove(ultimoE+1);
            System.out.println(lista.get(primeroE));
            return invertir(lista, index-1);
        }

    }
}
