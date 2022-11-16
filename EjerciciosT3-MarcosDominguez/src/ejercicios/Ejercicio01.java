package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creo tres variables int; una para el segundo, otra para el minuto y otra para
		// la hora.

		int segundo; //variable segundo
		int minuto; //variable minuto
		int hora; //variable hora
		int aumento; //el nº introducido para los segundos que aumentarán

		// Genero el scanner

		Scanner all = new Scanner(System.in);

		// Pido la hora, minuto y segundo, y sus variables respectivas guardarán ese
		// valor. Luego pido los segundos a aumentar

		System.out.print("Introduce la hora");
		hora = all.nextInt();
		System.out.print("Introduce el minuto");
		minuto = all.nextInt();
		System.out.print("Introduce los segundos");
		segundo = all.nextInt();
		System.out.print("Introduce los segundos a aumentar");
		aumento = all.nextInt();
		
		//Segundo será igual al número introducido y los segundos
		
		segundo = segundo + aumento;

		// si el segundo más el aumento es menor que 59, entonces simplemente se enseña
		// al usuario la hora más el aumento.

		if ((aumento + segundo) < 59) {
			segundo = segundo + aumento;
			System.out.println("La hora es " + hora + ":" + minuto + ":" + segundo);
		}
		
		//Mientras que el segundo es mayor que 59, por siempre se le suma uno al minuto y sesenta al segundo,
		//Si el minuto es mayor que 59, se le resta 60 al segundo y se suma uno a la hora, y si la 
		//hora es mayor que 23, se le resta la hora 24.

		while (segundo > 59) {
			minuto++;
			segundo = (segundo - 60);
			if (minuto > 59) {
				minuto = (segundo - 60);
				hora++;
			}
			if (hora > 23) {
				hora = (hora - 24);
			}
		}
		//Doy resultado
		System.out.println("La hora es " + hora + ":" + minuto + ":" + segundo);
		// Cierro scanner

		all.close();
	}

}
