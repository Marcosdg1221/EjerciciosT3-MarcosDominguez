package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creo las variables necesarias, todas serán int y cada una representa una cifra.
		
		//Doy el scanner
		
		int numero; //El nº a pedir
		int salva; //Guarda el numero 
		int reves=0; //Comprobación de su nº invertido
		int resto; //Comprobación del resto para módulos

		Scanner all = new Scanner(System.in); //Pongo scanner
		
		//Pregunto por el valor del numero
		
		System.out.println("Introduzca un número y se comprobará si es capicúa");
		numero=all.nextInt();

		//Salva se fija a numero/10, resto al modulo de salva/10 y reves al resto.
		
		  salva=(numero/10);
		  resto= salva%10;
		  reves=resto;
		
		  //Mientras salva sea diferente a 0 resto se fija a salva%10, reves a resto*10+resto y salva a sí misma/10
		  while(salva!=0) {
		   resto= salva%10;
		   reves=reves*10+resto;
		   salva= salva/10;
		  }
		  //Si reves es = a numero es capicua, si no, no; muestro scanner en ambos casos.
		  if(reves==numero) {
			  System.out.println("El numero es capicua");
			  }
			 else {
			  System.out.println("El numero no es capicua");
			 }
		
	//Cierro scanner
	
	all.close();
	}
}
