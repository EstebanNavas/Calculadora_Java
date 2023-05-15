package app.java;

import java.util.Scanner;

public class main {
	

	public static  void main (String[] args) {
		System.out.println("hola desde calculadora");
		
		// SUMA
		Scanner suma = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		System.out.println("Ingrese el primer número a sumar");
		numero1 = suma.nextInt();
		
		System.out.println("Ingrese el segundo número a sumar");
		numero2 = suma.nextInt();
		
		int resultadosuma = numero1 + numero2;
		System.out.println("El resultado de la suma es: " + resultadosuma);
		
		//RESTA
		
		Scanner resta = new Scanner(System.in);
		
		System.out.println("Ingrese el primer número a restar");
		numero1 = resta.nextInt();
		
		System.out.println("Ingresa el segundo núnmero a restar");
		numero2 = resta.nextInt();
		
		int resultadoResta = numero1 - numero2;
		System.out.println("El resultado de la resta es: " + resultadoResta);
		
		
		//MULTIPLICACIÓN
		
		Scanner multiplicación = new Scanner(System.in);
		
		System.out.println("ingresa el primer numero a multiplicar");
		numero1 = multiplicación.nextInt();
		
		System.out.println("Ingresa el segundo número a multiplicar");
		numero2 = multiplicación.nextInt();
		
		int resultadoMultiplicación = numero1 * numero2;
		System.out.println("El resultado de la multiplicación es: " + resultadoMultiplicación);
		
		
		//DIVISION
		
		Scanner division = new Scanner(System.in);
		
		System.out.println("Ingresa el primer número a dividir");
		numero1 = division.nextInt();

		System.out.println("Ingresa el segundo número a dividir");
		numero2 = division.nextInt();
		
		int resultadoDivision = numero1 / numero2;
		System.out.println("El resultado de la división es: " + resultadoDivision);
		
		
		
		
		
		
		//** OTRA FORMA DE HACERLO, PARA QUE DEN TODOS LOS RESULTADOS AL TIEMPO 
		
		
		Scanner operaciones = new Scanner (System.in);
		
		float num1, num2, sumar, restar, multiplicar, dividir, residuo;
		
		System.out.println("Ingresa dos números por favor");
		
		num1 = operaciones.nextFloat();
		num2 = operaciones.nextFloat();
		
		sumar = num1 +num2;
		restar = num1 - num2;
		multiplicar = num1 * num2;
		dividir = num1 / num2;
		residuo = num1 % num2;
		
		System.out.println("sumar " + sumar );
		System.out.println("restar " + restar );
		System.out.println("multiplicar " + multiplicar );
		System.out.println("dividir " + dividir );
		System.out.println("residuo " + residuo );
		
		
		
	}
}
