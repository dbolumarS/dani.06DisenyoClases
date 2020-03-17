package _02_ejemplos.tiempo;

import java.util.ArrayList;
import java.util.Scanner;

public class TestTiempo {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		Tiempo t = new Tiempo();
		System.out.println("Introduce hora min seg");
		t.setHora(tec.nextInt());
		t.setMinuto(tec.nextInt());
		t.setSegundo(tec.nextInt());
		
		System.out.println("Tiempp introducido: ");
		System.out.println(t.toString());
		
		ArrayList<Tiempo> lista = new ArrayList<>();
		lista.add(t);
		System.out.println(lista);
	}
}
