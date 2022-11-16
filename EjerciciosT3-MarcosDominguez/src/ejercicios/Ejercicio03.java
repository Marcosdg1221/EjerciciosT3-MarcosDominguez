package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int base; //Variable que calcula cuantos asteriscos hay de base
	int cont; //Variable para el contador
	int num=0; //Variable para los bucles y se fija a 0
	int espacio; //Variable para los espacios del triángulo
	int guardespacio; //Variable para guardar el valor inicial del espacio
	Scanner all = new Scanner(System.in);
	//Doy el scanner
	
	//Pido al usuario un número y se guarda ese valor
	
	System.out.println("Introduce cuantos * quiere que tenga de base y altura el triángulo");
	base= all.nextInt(); 
	
	//Contador y espacio se iguala a base, y guardespacio a espacio
	
	cont=base; 
	espacio=base;
	guardespacio=espacio;
	
	 //count = número introducido por el usuario, cada vez menos cada vuelta hasta que llegue a 0
	
		for (int count = cont; count > 0; count --) {
		base = 1; //base equivale 1
		espacio--; //Se resta uno al espacio
		
		//Por siempre si el espacio menos el numero es mayor que 0, se imprimirán espacios y 
		//se reduce en uno la variable espacio
		while ((espacio-num)>0) {
			System.out.print(" ");
			espacio--;
		}
		
		//guardespacio equivale a sí mismo menos 2, y espacio se iguala al resultado de ese número
		
		guardespacio=(guardespacio - 2);
		espacio=guardespacio;
		
		//Mientras base menos num es mayor a 0, se imprimen * y base se reduce a uno
		
		while ((base - num)>0) {
			System.out.print(" *");
			base--;
			}
		//Hago un espacio y num se reduce a uno
		System.out.println();
		num--;
		}
		// Cierro scanner

		all.close();	
	}
	
}