package ejercicios;

import java.util.Scanner;

public class Ejercicio05 {

public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	int num; //para el nº primero a introducir
	int num1; //para el nº segundo a introducir
	
	//de c1num a cnum7, son variables para los múltiplos de los dos números introducidos;
	//2,3,5 y 7 son las necesarias.
	
	int c1num=0;
	int c1num3=0;
	int c1num5=0;
	int c1num7=0;
	int cnum=0;
	int cnum3=0;
	int cnum5=0;
	int cnum7=0;
	int mcm; //para el mínimo común múltiplo
	
	Scanner all = new Scanner(System.in);

	//Pido al usuario los dos nº y lo que introduzca serán sus valores.
	
	System.out.println("Introduce un número para ver el mínimo común múltiplo entre ese y el siguiente");
	num = all.nextInt();
	System.out.println("Introduce el otro número");
	num1 = all.nextInt();
	
	//Divide entre 2,3,5 y 7 hasta que no sea divisible entre esos y va aumentando sus múliplos hasta que los restos de todos sean igual a 0
	
	while (num > 1) {	
		while(num%2==0) {
			num=num/2;
			cnum++;
		}
		while (num%3==0) {
			num=num/3;
			cnum3++;	
			}
		while (num%5==0) {
			num=num/5;
			cnum5++;
		}
		while (num%7==0) {
			num=num/7;
			cnum7++;
		}
	}
	
	//Lo mismo que el anterior, solo que para el segundo número
	
	while (num1>1) {
		while(num1%2==0) {
			num1=num1/2;
			c1num++;
		}
		while (num1%3==0) {
			num1=num1/3;
			c1num3++;	
			}
		while (num1%5==0) {
			num1=num1/5;
			c1num5++;
		}
		while (num1%7==0) {
			num1=num1/7;
			c1num7++;
		}
		
		//Se coge el número más alto de los resultados de la anterior operación de los respectivos divisores de los dos números
	}
	if (cnum<c1num) {
		cnum=c1num;
	}
	if(cnum3<c1num3) {
		cnum3=c1num3;
	}
	if(cnum5<c1num5) {
		cnum5=c1num5;
	}
	if(cnum7<c1num7) {
		cnum7=c1num7;
	}
	
	//Se hace el cálculo del mínimo común múltiplo, Math.pow se usa para las potencias; cuando tenga el resultado, lo muestro.
	mcm=(((int)Math.pow(2, cnum))*((int)Math.pow(3, cnum3))*((int)Math.pow(5,cnum5))*((int)Math.pow(7,cnum7)))*num;
	System.out.println("El mínimo común múltiplo es " + mcm);		
	// Cierro scanner

	all.close();
	}
}
	