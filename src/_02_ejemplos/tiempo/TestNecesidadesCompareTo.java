package _02_ejemplos.tiempo;

import java.util.Arrays;

public class TestNecesidadesCompareTo {
	public static void main(String[] args) {
		
		//Si tengo un array de int ( o cualquier tipo primitivo)
		//se puede ordenar
		int[] numeros = {4,2,3,8,1,9};
		Arrays.sort(numeros); // .sort para ordenar
		System.out.println(Arrays.toString(numeros));
		
		//Un array de String tambien se puede ordenar
		String[] nombres = {"Luis", "Pablo", "Ana", "Rosa", "Jorge"};
		Arrays.sort(nombres); //Ordena segun el codigo asci
		System.out.println(Arrays.toString(nombres));
		
		//un array de tiempo que se ordena?
		//Solo si en la calse Tiempo indicamos que dos objetos
		//tiempo se pueden comparar entre si
		Tiempo[] tiempos = {new Tiempo (10,20,30),
							new Tiempo (22,12,5),
							new Tiempo (2,13,45),
							new Tiempo (1,12,50),
							new Tiempo (12,12,12)
			};
		Arrays.sort(tiempos);
		System.out.println(Arrays.toString(tiempos));
	}
}
