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
    }

    public static void mostrarArreglo(int array[]) {
		for (int j = 0; j < array.length; j++) {
	    	System.out.print(array[j]+" ");
		}
	}

    public static int llenarArreglo3(int array1[], int array2[]){
        int cantidad = array1.length + array2.length;
        int[] arreglo3 = new int[cantidad];

        for(int i=0; i<arreglo3.length;i++){
            
        }
        return cantidad;
    }
}
