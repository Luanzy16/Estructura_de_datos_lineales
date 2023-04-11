package Taller2;

import java.util.ArrayList;

public class arreglo {
    public static void main(String[] args) {
        ArrayList<Character> arreglo = new ArrayList<Character>();
        arreglo.add('f');
        arreglo.add('m');
        arreglo.add('m');
        arreglo.add('f');
        arreglo.add('f');
        arreglo.add('m');

        System.out.println("Lista sin organizar"+arreglo);
        System.out.println("lista organizada"+ organizar(arreglo));
       
    }

    public static ArrayList<Character> organizar(ArrayList<Character> arreglo) {
        int indexF = 0;
        int indexM = 0;

        for (int i = 0; i < arreglo.size(); i++) {
            if (arreglo.get(i).equals('f')) {
                arreglo.add(indexF, 'f');
                indexF += 2;
            } else if (arreglo.get(i).equals('m')) {
                arreglo.add(indexM, 'm');
                indexM += 2;
            }
        }

        return arreglo;
    }
}
