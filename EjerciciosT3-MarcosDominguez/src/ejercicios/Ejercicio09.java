package ejercicios;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int numero; //Para el nº a introducir
	int cifra=2; //Para el nº de dígitos o cifras que se fija a 2
	Scanner all = new Scanner(System.in);
	//Doy el scanner
	
	//Se pide un valor para numero
	
	System.out.println("Introduzca un número mayor a 0");
	
	numero=all.nextInt();
	
	//Mientras número sea menor a 0 se vuelve a pedir al usuario que ponga un nº mayor a 0
	
	while (numero<0) {
		System.out.println("Tiene que ser mayor a 0");
		numero=all.nextInt();
	}
	
	//Si el nº es menor a 10, entonces tiene un dígito, lo muestro.
	
	if (numero<10) {
		System.out.println("Tiene un dígito");
	}
	
	//Si no, se repite un bucle que suma 10 al numero y se divide entre diez y si eso es mayor a 10, el numero se fija a sí mismo entre diez
    //y se suma uno a la cifra.
	
	else {
			while((numero+10)/10 > 10) {
				numero = numero /10;
				cifra++;
			}
			
			//Muestro resultado
			
			System.out.println("Tiene " + cifra + " dígitos");
		}
	// Cierro scanner

	all.close();
	}
}
