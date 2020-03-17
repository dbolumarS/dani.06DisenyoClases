package _02_ejemplos.tiempo;

import java.util.Scanner;

public class TestUsoCompareTo {
	
	static Scanner tec = new Scanner (System.in);
	public static void main(String[] args) {
		
		//Leemos dos Tiempos obligando
		//a que el segundo sea posterior al primero
		System.out.println("Inicio: ");
		Tiempo tInicio = leerTiempo();
		Tiempo tFin;
		do{
			
			System.out.println("Fin:");
			tFin = leerTiempo();
		} while (tInicio.compareTo(tFin) >=0);
	}
	
	public static Tiempo leerTiempo(){
		System.out.println("Introduce hh:mm:ss");
		String hms = tec.next();
		Tiempo t = new Tiempo(hms);
		return t;
	}
}
