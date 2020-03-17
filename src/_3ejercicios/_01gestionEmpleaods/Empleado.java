package _3ejercicios._01gestionEmpleaods;

import java.util.Calendar;

public class Empleado implements Comparable<Empleado> {
	private String DNI;
	private String Nombre;
	
	private int AingresaE;
	private double SueldoB;

	public Empleado( String DNI,String Nombre, int AingresaE, double SueldoB) {
		this.DNI = DNI;
		this.Nombre = Nombre;

		//this.setAingresaE(AingresaE);
		//this.setSueldoB(SueldoB);
		this.AingresaE = AingresaE;
		 this.SueldoB = SueldoB;
	}

	public String getnombre() {
		return Nombre;
	}

	public String getdni() {
		return DNI;
	}

	public int getAingresaE() {
		return AingresaE;
	}

	public double getSueldoB() {
		return SueldoB;
	}

	public void setnombre(String nombre) {
		this.Nombre = Nombre;
	}

	public void setdni() {
		this.DNI = DNI;
	}

	public void setAingresaE(int anyo) {
		if (AingresaE < 0) {
			throw new IllegalArgumentException("Anyo negativo");
		}
		this.AingresaE = AingresaE;
	}

	public void setSueldoB(double sueldo) {
		if (SueldoB < 0) {
			throw new IllegalArgumentException("sueldo negativo");
		}
		this.SueldoB = SueldoB;
	}

	public int antiguedad() {
		int anyoActual = Calendar.getInstance().get(Calendar.YEAR);
		int antig = 0;

		if (anyoActual > AingresaE) {
			antig = antig - anyoActual;
			return antig;
		} else {
			return antig;
		}

	}

	public void incrementarSueldo(double porcentaje) {
		SueldoB = SueldoB + SueldoB * porcentaje / 100;
	}

	public String toString() {
		String result;
		result = "Nombre " + this.Nombre + " DNI " + this.DNI + " Antiguedad: " + this.AingresaE + " Sueldo: "
				+ this.SueldoB;
		return result;
	}

	public boolean equals(Object o) {
		if (this == o)
			return true;

		if (o == null)
			return false;

		if (!(o instanceof Empleado))
			return false;

		Empleado E = (Empleado) o;
		if (this.DNI.equals(E.DNI)) {
			return true;
		} else {
			return false;
		}
	}
	
	public int compareTo (Empleado e){
		/*if (this.DNI.compareTo(e.DNI) < 0) return -1;
		if (this.DNI.compareTo(e.DNI) > 0) return 1;	
		else return 0;*/
		return this.DNI.compareTo(e.DNI);
	}
	
	public static double calcularIRPF(double SueldoB){
		double irpf = 0;
		
			if (SueldoB < 800) irpf = 3;
			else if (SueldoB < 1000) irpf = 10;
			else if (SueldoB < 1500) irpf = 15;
			else if (SueldoB < 2100) irpf = 20;
	
		return irpf;
	}
}
