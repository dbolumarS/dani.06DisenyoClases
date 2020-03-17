package _3ejercicios._01gestionEmpleaods;

import java.util.Scanner;

public class TestEmpleado {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
	
		
		String d,n;
		int a;
		double s;
		
		System.out.println("Dni: ");
		d = tec.nextLine();
		System.out.println("Nombre: ");
		n = tec.nextLine();
		System.out.println("Año ingreso: ");
		a = tec.nextInt();
		System.out.println("Sueldo: ");
		s = tec.nextDouble();
		Empleado e1 = new Empleado(d,n,a,s);

		System.out.println("Dni: ");
		d = tec.nextLine();
		System.out.println("Nombre: ");
		n = tec.nextLine();
		System.out.println("Año ingreso: ");
		a = tec.nextInt();
		System.out.println("Sueldo: ");
		s = tec.nextDouble();
		Empleado e2 = new Empleado(d,n,a,s);
		
		if (e1.getSueldoB() < e2.getSueldoB()){
			e1.incrementarSueldo(20);
		}else {
			e2.incrementarSueldo(20);
		}
		
		System.out.println(e1);
		System.out.println("-----------");
		System.out.println(e2);
		
		//Mostrar IRPF que corresponde a cada empleado
		System.out.println("IRPF para 2000€ " + Empleado.calcularIRPF(2000));
		System.out.println("IRPF de e1: " + Empleado.calcularIRPF(e1.getSueldoB()/12));
		System.out.println("IRPF de e2: " + Empleado.calcularIRPF(e2.getSueldoB()/12));
		
	}


}
