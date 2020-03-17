package _3ejercicios._02reservaslibreria;

import java.util.Scanner;

public class TestReservas {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		String ni,no,t;
		int c,e;
		
		
		
		System.out.println("Introduce el nif: ");
		 ni = tec.nextLine();
		System.out.println("Introduce nombre: ");
		 no = tec.nextLine();
		System.out.println("Introduce telefono: ");
		 t = tec.nextLine();
		System.out.println("Codigo del libro: ");
		 c = tec.nextInt();
		System.out.println("Ejemplares: ");
		 e = tec.nextInt(); 
		Reserva r1 = new Reserva(ni,no,t,c,e);
		
		System.out.println("Introduce el nif: ");
		 ni = tec.nextLine();
		System.out.println("Introduce nombre: ");
		 no = tec.nextLine();
		System.out.println("Introduce telefono: ");
		 t = tec.nextLine();
		System.out.println("Codigo del libro: ");
		 c = tec.nextInt();
		System.out.println("Ejemplares: ");
		 e = tec.nextInt(); 
		Reserva r2 = new Reserva(ni,no,t,c,e);
		
		while(r2.compareTo(r1) == 0){
			System.out.println("Introduce el nif: ");
			 ni = tec.nextLine();
			System.out.println("Introduce nombre: ");
			 no = tec.nextLine();
			System.out.println("Introduce telefono: ");
			 t = tec.nextLine();
			System.out.println("Codigo del libro: ");
			 c = tec.nextInt();
			System.out.println("Ejemplares: ");
			 e = tec.nextInt(); 
			 r2 = new Reserva(ni,no,t,c,e);
		}
		
		r1.setEjemplares(r1.getejemplares() + 1);
		r2.setEjemplares(r2.getejemplares() + 1);
		
	}
}
