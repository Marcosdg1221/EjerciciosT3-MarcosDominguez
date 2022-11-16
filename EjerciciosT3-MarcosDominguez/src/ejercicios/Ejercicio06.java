package ejercicios;

import java.util.Scanner;

public class Ejercicio06 {

public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	int num; //Para el número a introducir
	int veces=1; //Para las veces que se irá sumando
	int repetir=0; //Cuántas veces tenfo que repetir un nº
	Scanner all = new Scanner(System.in); //Abro scanner
	
	//Pido un nº del uno al 20 y lo que ponga el usuario será el valor de num
	
	System.out.println("Introduzca un número de uno al 20 ");
	
	num=all.nextInt();
	
	//Mientras que el número sea mayor que 20 y menor que 1, se volverá a preguntar al
	//usuario lo mismo para que ponga un nº del uno al veinte.
	
	while (num>20 | num < 1) {
		System.out.println("Introduzca un número sólo del uno al 20");
		num=all.nextInt();
	}
	
	//Creo un bucle donde se repite si veces es mayor igual que nº y se suma a uno las veces con cada vuelta
	
	for(;veces<=num;veces++) {
	//Creo otro que se repite siempre que repetir sea menor a veces
	while(repetir<veces) {
		//repetir se suma uno
		repetir++;
		//Se muestran las veces
		System.out.print(veces);
	}
	//Repetir se fija a 0
	repetir=0;
	//Para los saltos de líneas
	System.out.println();
	}
	// Cierro scanner

	all.close();
}
	}
