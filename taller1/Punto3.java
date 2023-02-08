import java.util.Arrays;
import java.util.Scanner;

public class Punto3 {
    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de números que desea en el arreglo");
		Scanner entrada =new Scanner(System.in);
		
		int cantidad = entrada.nextInt();
		int arreglo1[]= new int[cantidad];
		int arreglo2[]= new int[cantidad];
        entrada.close();

        for(int i=0;i<arreglo1.length;i++) {
	    	arreglo1[i]= (int)(Math.random() * (10 - 1) + 1);
	    	arreglo2[i]= (int)(Math.random() * (10 - 1) + 1);
	    }
        // demostracion iterativa
        System.out.println("Primer Arreglo: ");
		mostrarArreglo(arreglo1);
		System.out.println("\nSegundo Arreglo: ");
		mostrarArreglo(arreglo2);
        System.out.println("\nTercer arreglo:");
        mostrarArreglo(llenarArreglo3(arreglo1, arreglo2));

        //demostracion recursiva
        System.out.println("\nnumeros ordenados (recursion): ");
        llenarArregloR(arreglo1, arreglo2, cantidad-1);
    }

    //funciones iterativas
    public static void mostrarArreglo(int array[]) {
		for (int j = 0; j < array.length; j++) {
	    	System.out.print(array[j]+" ");
		}
	}

    public static int[] llenarArreglo3(int array1[], int array2[]){
        int cantidad = array1.length + array2.length;
        int[] arreglo3 = new int[cantidad];

        for(int i=0; i<arreglo3.length;i++){
            if(i<array1.length){
                arreglo3[i] = array1[i];
            }
            else{
                arreglo3[i] = array2[i-array1.length];
            }  
        }
        Arrays.sort(arreglo3);
        return arreglo3;
    }

    //funciones recursivas

    public static int llenarArregloR(int array1[], int array2[], int index){
        if(index < 0){
            return 0;
        }
        else{
            System.out.println(array1[index]);
            System.out.println(array2[index]);
            return llenarArregloR(array1, array2, index-1);
        }
    }
}
