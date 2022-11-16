package ejercicios;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			int num; //el número a pedir
			int veces=1; //Las veces que se repite
			int guardar=0; //el valor a guardar y empezar con un número
			int repetir=0; //Cuantas veces hay que repetir cifras
			Scanner all = new Scanner(System.in); //pongo scanner
			
			//Pregunto un valor para num
			
			System.out.println("Introduzca un número");
			
			num=all.nextInt();
			
			//Bucle que se repite mientras las veces sea menor igual al num/2, y se
			//suma con cada vuelta +2 a las veces.
			
			for(;veces<=(num*2);veces=veces+2) {
				
			//Mientras repetir sea menor igual a las veces/2, repite y guardar suman uno y imprime guardar
				
			while(repetir<=(veces/2)) {
				repetir++;
				guardar++;
				System.out.print(guardar);
			}
			
			//Mientras repetir sea menor igual a las veces, repite y guardar suman uno y imprime guardar
			
			while(repetir<veces) {
				repetir++;
				guardar--;
				System.out.print(guardar);
			}
			//Repetir y guardar se fija a 0
			
			repetir=0;
			guardar=0;
			
			//Para los salto de línea.
			
			System.out.println();
			}
			// Cierro scanner

			all.close();
}
}
