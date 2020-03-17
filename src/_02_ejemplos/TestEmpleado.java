package _02_ejemplos;

import _02_ejemplos.tiempo.Tiempo;
import _3ejercicios._01gestionEmpleaods.Empleado;

public class TestEmpleado {
	public static void main(String[] args) {
		Empleadoejemplostatic e1 = new Empleadoejemplostatic ("11111111A", "Luis", 2010, 15000);
		Empleadoejemplostatic e2 = new Empleadoejemplostatic ("22222222B", "Aurora", 2011,16000);
		
		//Todos los empleados comparten la horaEntrada y horaSalida
		e1.horaEntrada = new Tiempo(8,0,0);
		e1.horaSalida = new Tiempo(16,0,0);
		
		//Si modificamos la hora de entrada o salida de e1,e2 estoy
		//modificando la de e2(porque es la misma)
		System.out.println("entrada: " + e2.horaEntrada);
		System.out.println("Salida: " + e2.horaSalida);
		
		
		//No es del todo correcto accerder a un atributo de la clase(static)
		//como si fuera un atributo objeto (poniendo delante objeto.)
		//La forma correcta seria la siguiente:,,
		Empleadoejemplostatic.horaEntrada = new Tiempo (8,15,0);
		Empleadoejemplostatic.horaSalida = new Tiempo(16,15,0);
		System.out.println("Entrada: " + Empleadoejemplostatic.horaEntrada);
		System.out.println("Salida: " + Empleadoejemplostatic.horaSalida);
	}
}
