package ejercicios;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero; //el nº a introducir
		int guardar; //guardará el valor del anterior
		int errores=0; //Los errores del usuario
		int numint=1; //los intentos del usuario
		
		Scanner all = new Scanner(System.in);
		//Doy el scanner
		
		//Pido al usuario un nº y lo que introduzca será el valor de numero
		
		System.out.println("Introduzca un número para empezar");
		
		numero=all.nextInt();
		
		//guardar se fija a numero
		
		guardar=numero;
		
		//Mientras que numero sea distinto a 0 se repite un bucle
		
		while(numero!=0) {
			
			//Si el número es menor a guardar, es menor, se avisará de que ha errado y se suma uno a los intentos y a los errores
			
			if (numero<guardar) {
				guardar=numero;
				System.out.println("Fallo, es menor; introduzca otro");
				numero=all.nextInt();
				numint++;
				errores++;
			}
			 
			//Si no, se pide otro, guardar equivale a nº y se suma uno a los intentos.
			
			else {
				guardar=numero;
				System.out.println("Introduzca otro número mayor al anterior");
				numero=all.nextInt();
				numint++;
			}
			
			//Muestro resultado cuando el usuario ponga 0.
			
		}
		System.out.println("Total de números introducidos; " + numint + " Número de fallos; " + errores);	
		// Cierro scanner

		all.close();
	}
}