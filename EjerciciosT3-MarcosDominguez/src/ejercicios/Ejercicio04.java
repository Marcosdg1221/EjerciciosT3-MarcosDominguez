package ejercicios;

import java.util.Scanner;

public class Ejercicio04 {

public static void main(String[] args) {
		// TODO Auto-generated method stub

	int resultado=0; //una variable que se irá sumando, se fija de momento a 0
	int numero; //variable para el número a introducir del usuario
	
	
	//pongo escáner
	Scanner all = new Scanner(System.in);

	//Pido al usuario un número y lo que introduzca será el valor de num
	
	System.out.print("Introduce un número para ver cuántos números múltiplos de tres hay");
	numero = all.nextInt();
	
	//Creo un bucle donde se fija una variable contador a uno, que el bucle parará cuando
	//número sea mayor a contador y este se sumará a uno con cada vuelta.
	
	for (int cont=1;cont<=numero; cont++) {
		
		//Si el módulo de tres del contador es 0, resultado se suma a uno
		
		if (cont%3==0) {
			resultado++;
		}
	}
	
	//Si resultado es igual a uno, se muestra que hay uno, si no, se muestra resultado.
	
	if (resultado==1) {
		System.out.print("Hay un múltiplo de tres en ese número");
	}
	else {
	System.out.print("Hay " + resultado + " múltiplos de tres en ese número");
	}
	// Cierro scanner

		all.close();
}
}