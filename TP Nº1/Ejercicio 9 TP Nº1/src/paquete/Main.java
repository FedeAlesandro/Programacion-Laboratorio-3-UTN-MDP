package paquete;

import java.util.Scanner;

public class Main {

	public static boolean revisarSiAņoBisiesto (int anio)
	{
		boolean control=false;
		if (anio % 4 == 0)
			control = true;
		return control;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Ingrese el aņo que quiere saber si es bisiesto o no: ");
		int anio = scan.nextInt();
		System.out.println("");
		if (revisarSiAņoBisiesto(anio))
			System.out.println("El aņo " + anio + " es bisiesto." );
		else
			System.out.println("El aņo " + anio + " no es bisiesto." );
		scan.close();
	}

}
