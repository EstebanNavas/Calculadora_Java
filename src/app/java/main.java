package app.java;

import java.util.Scanner;

public class main {
	

	public static  void main (String[] args) {
		System.out.println("hola desde calculadora");
		
		Scanner suma = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		System.out.println("Ingrese el primer número a sumar");
		numero1 = suma.nextInt();
		
		System.out.println("Ingrese el segundo número a sumar");
		numero2 = suma.nextInt();
		
		int resultadosuma = numero1 + numero2;
		System.out.println("El resultado de la suma es: " + resultadosuma);
	}
}
