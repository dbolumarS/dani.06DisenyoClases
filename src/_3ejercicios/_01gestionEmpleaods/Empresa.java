package _3ejercicios._01gestionEmpleaods;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Empresa {

	// Atributos
	private String nombre;
	private ArrayList<Empleado> plantilla;

	// Costructor
	public Empresa(String nombre) {
		this.nombre = nombre;
		this.plantilla = new ArrayList<>();
	}

	public int getNumeroEmpleados() {
		return this.plantilla.size(); // size cuantas cosas tiene el array
	}

	// Getter
	public String getNombre() {
		return this.nombre;
	}

	public ArrayList<Empleado> getPlantilla() {
		return this.plantilla;
	}

	// Setter
	public void SetNombre(String nombre) {
		this.nombre = nombre;
	}

	// Otros metodos
	public void contratar(Empleado e) throws IllegalArgumentException {
		if (this.plantilla.contains(e)) {
			throw new IllegalArgumentException("No se puede contratar alguien que ya esta contratado");
		} else {
			this.plantilla.add(e);
		}
	}

	public void despedir(Empleado e) throws NoSuchElementException {

		if (this.plantilla.contains(e)) {
			this.plantilla.remove(e);
		} else {

			throw new NoSuchElementException("El empleado ya no está");
		}

	}

	public void despedir(String dni) throws NoSuchElementException {

		// Creo un empleado con el dni que quiero buscar
		Empleado e = new Empleado(dni, " ", 0, 0);

		// Busco/elimino el Empleado e
		if (this.plantilla.contains(e)) {
			this.plantilla.remove(e);
		} else {
			throw new NoSuchElementException("No se puede despedir a alguien que no existe");
		}

	}

	public void subirTrienio(double porcentaje) {

		for (int i = 0; i < this.plantilla.size(); i++) {
			if (this.plantilla.get(i).antiguedad() % 3 == 0) {
				this.plantilla.get(i).incrementarSueldo(porcentaje);
			}
		}
	}
	
	public void subirTrienioV2(double porcentaje) {

		for (Empleado e: this.plantilla) {
			if (e.antiguedad() % 3 == 0) {
				e.incrementarSueldo(porcentaje);
			}
		}
	}
	
	public String toString(){
		String result = "Empresa: " + nombre + "\n======\n";
		
		for (int i = 0; i < this.plantilla.size(); i++) {
			result = result + this.plantilla.get(i).toString() + "\n--------\n";
		}
		
		return result;
	}
	
}
