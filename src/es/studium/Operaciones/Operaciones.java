package es.studium.Operaciones;

import java.util.Scanner;

public class Operaciones
{

	public static void main(String[] args)
	{
		int num1, num2, suma, resta, producto;
		float cociente;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el primer numero:");
		num1 = teclado.nextInt();
		System.out.println("Introduce el segundo numero:");
		num2 = teclado.nextInt();
		teclado.close();
		suma = num1 + num2;
		resta = num1 - num2;
		producto = num1 * num2;
		System.out.println("La suma vale " + suma);
		System.out.println("El numero1 menos el numero2 es: " + resta);
		System.out.println("La multiplicacion de los numeros es: " + producto);
		if (num2 != 0)
		{
			cociente = (float) num1 / (float) num2;
			System.out.println("El cociente del numero1 divivido por el numero2 es: " + cociente);
		} else
		{
			System.out.println("La division no es posible. El numero2 no puede tener valor cero");
		}

	}

}
