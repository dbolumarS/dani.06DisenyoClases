package _02_ejemplos.tiempo;

import java.util.ArrayList;

public class TestNecesidadEquals {
	public static void main(String[] args) {
		ArrayList<Tiempo> enPunto = new ArrayList<>();
		rellenar(enPunto);
		System.out.println(enPunto);
		
		Tiempo t = new Tiempo(1,0,0);
			if (enPunto.contains(t)){
				System.out.println("Esta en la lista");
			} else {
				System.out.println("No esta en la lista");
			}
			
		Tiempo t2 = new Tiempo(20,0,0);
		enPunto.add(t2);
		if(enPunto.contains(t2)){
			System.out.println("Esta en la lista");
		} else {
			System.out.println("Non esta en la lista");
		}
	}
	
	public static void rellenar (ArrayList<Tiempo> l){
		l.add(new Tiempo(1,0,0));
		l.add(new Tiempo(2,0,0));
		l.add(new Tiempo(3,0,0));
		l.add(new Tiempo(4,0,0));
		l.add(new Tiempo(5,0,0));
	}
}
