package ejercicios;

import java.util.Scanner;

public class ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int numero; //número introducido por el usuario
			int contador=0; //Las veces que aumentarán en uno, se fijan en 0
			boolean primo; //Valor booleano para comprobar si un número es primo o no
			Scanner sc = new Scanner(System.in); //meto scanner
			//Pido al usuario un número y lo que ponga será su valor
			System.out.println("Escribe el numero para decir cuantos primos hay entre 1 y ese:");
			numero = sc.nextInt();
			
			//Abro un bucle creando una variable contador que se fije en 2, que se repita el bucle 
			//mientras el contador sea menor o igual al número introducido, y el contador se sumará uno cada vuelta
			
			for (int cont = 2; cont <= numero; cont++) {
				
				//Fijo primo a true.
				
				primo = true;
				
				//Creo un bucle con la variable x que se fije a 2, sigue el bucle hasta que cont sea igual o menor que x
				//y x se sumará uno con cada vuelta.
				
					for (int x = 2; x < cont; x++) {
						
						//Si el módulo de contador entre la x es 0, primo es falso y se saldrá del bucle.
						
						if (cont % x == 0) {
							primo=false;
							break;
							}
						
					}
					
					//Si primo es true, el contador sumará a uno
					
					if(primo) {
						contador++;
					}
			}
			//Muestro los primos por el contador.
			
					System.out.println(contador);
					
					// Cierro scanner

					sc.close();
	
	}
	
				}
