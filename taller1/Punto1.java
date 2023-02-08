
import java.util.Scanner;

public class Punto1 {
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
		System.out.println("\nLa suma de arreglos: ");
		mostrarArreglo(sumaArreglos(arreglo1,arreglo2));
		System.out.println("\nLa suma del arreglo 1 es: " + sumaArreglo(arreglo1) );

		// demostracion recursivas
		System.out.println("\nsuma de arreglos (recursivo): ");
		sumaArreglosR(arreglo1, arreglo2, cantidad-1);
		System.out.println("\nsuma del arreglo1 (recursivo): ");
		System.out.println(sumaArregloR(arreglo1, cantidad-1)); 
	}
	public static void mostrarArreglo(int array[]) {
		for (int j = 0; j < array.length; j++) {
	    	System.out.print(array[j]+" ");
		}
	}

	// funciones iterativas
	public static int[] sumaArreglos(int array1[],int array2[]) {
		int array3[] = new int[array1.length];
		for (int i = 0; i < array3.length; i++) {
			array3[i]=array1[i]+array2[i];
		}
		return array3;
	}
	
	public static int sumaArreglo(int array[]) {
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		return suma;
    }

	//funciones recursivas
	public static int sumaArreglosR(int array1[], int array2[], int index){
		if(index < 0){
			return 0;
		}
		else{
			System.out.println(array1[index]+ array2[index]);
			return sumaArreglosR(array1, array2, index-1);
			 
		}
	}

	public static int sumaArregloR(int array1[], int index){
		if(index < 0){
			return 0;
		}
		else{
			return array1[index] + sumaArregloR(array1, index-1);
		}
	}

}
