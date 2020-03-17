package _3ejercicios._04pasajeros;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import _02_ejemplos.tiempo.Tiempo;

public class Vuelo {

	private String id;
	private String origen;
	private String destino;
	private Tiempo horaS;
	private Tiempo horaL;
	private int capacidad;
	private int numReservas;
	pasajero[] pasaje;

	public Vuelo(String id, String origen, String destino, Tiempo horaS, Tiempo horaL, int capacidad) {

		this.id = id;
		this.origen = origen;
		this.destino = destino;
		this.horaS = horaS;
		this.horaL = horaL;
		this.capacidad = 20;
		this.numReservas = 0;
		pasaje = new pasajero[capacidad + 1];

	}
	
	

	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getOrigen() {
		return origen;
	}



	public void setOrigen(String origen) {
		this.origen = origen;
	}



	public String getDestino() {
		return destino;
	}



	public void setDestino(String destino) {
		this.destino = destino;
	}



	public Tiempo getHoraS() {
		return horaS;
	}



	public void setHoraS(Tiempo horaS) {
		this.horaS = horaS;
	}



	public Tiempo getHoraL() {
		return horaL;
	}



	public void setHoraL(Tiempo horaL) {
		this.horaL = horaL;
	}



	public int getCapacidad() {
		return capacidad;
	}



	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}



	public int getNumReservas() {
		return numReservas;
	}



	public void setNumReservas(int numReservas) {
		this.numReservas = numReservas;
	}



	public pasajero[] getPasaje() {
		return pasaje;
	}



	public void setPasaje(pasajero[] pasaje) {
		this.pasaje = pasaje;
	}



	public boolean hayLibres() {
		boolean libre = false;

		if (numReservas < capacidad) {
			libre = true;
		}
		return libre;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		return this.id.equals(((Vuelo) obj).id);
		// Vuelo v = (Vuelo)obj;
		// return this.id.equals(v.id);
	}

	public int reservarAsiento(String nombrePasajero, String dni) {
		if (!hayLibres())
			return 0;

		// Comprobar si el pasajero ua tiene otra reserva
		pasajero p = new pasajero(dni, nombrePasajero);

		boolean enc = false;
		for (int i = 1; i < pasaje.length && !enc; i++) {
			if (pasaje[i] != null && pasaje[i].equals(p)) {
				enc = true;
			}
		}
		if (enc)
			throw new IllegalArgumentException("El pasajero ya tiene reservado uno");

		// Asignarle un asiento al azar
		int asiento;
		do {
			asiento = (int) (Math.random() * capacidad) + 1;
		} while (pasaje[asiento] != null);
		pasaje[asiento] = p;
		numReservas++;

		return asiento;
	}

	public int reservarAsiento(String nombrePasajero, String nifPasajero, char preferencia) {
		if (!hayLibres())
			return 0;

		// Comprobar si el pasajero ua tiene otra reserva
		pasajero p = new pasajero(nifPasajero, nombrePasajero);

		boolean enc = false;
		for (int i = 1; i < pasaje.length && !enc; i++) {
			if (pasaje[i] != null && pasaje[i].equals(p)) {
				enc = true;
			}
		}
		if (enc)
			throw new IllegalArgumentException("El pasajero ya tiene reservado uno");

		// Asignarle un asiento al azar
		int ini = 1;
		if (preferencia == 'P' || preferencia == 'p') {
			ini = 2;
		}

		// Busca asiento de preferencia
		int asiento = 0;
		enc = false;
		for (int i = ini; i < pasaje.length && !enc; i = i + 2) {
			if (pasaje[i] == null) {
				asiento = i;
				enc = true;
			}
		}

		// Busca cualquier asiento
		if (!enc) {
			for (int i = 1; i < pasaje.length && !enc; i++) {
				if (pasaje[i] == null) {
					asiento = i;
					enc = true;
				}
			}
		}
		pasaje[asiento] = p;
		numReservas ++;

		return asiento;
	}

	public int reservarAsiento2(String nombrePasajero, String nifPasajero, char preferencia) {
		if (!hayLibres())
			return 0;

		// Comprobar si el pasajero ua tiene otra reserva
		pasajero p = new pasajero(nifPasajero, nombrePasajero);

		boolean enc = false;
		for (int i = 1; i < pasaje.length && !enc; i++) {
			if (pasaje[i] != null && pasaje[i].equals(p)) {
				enc = true;
			}
		}
		if (enc)
			throw new IllegalArgumentException("El pasajero ya tiene reservado uno");
		
		//Asignarle un asiento de su preferencia
		int primeroPasillo = 0, primeroVentanilla = 0;
		for (int i = 0; i < pasaje.length; i++) {
			if(primeroPasillo == 0 && pasaje[i] == null && i%2 == 0){
				primeroPasillo = i;
			} else if(primeroVentanilla == 0 && pasaje[i] == null && i%2 == 0){
				primeroVentanilla = i;
			}
		}
		int asiento = 0;
		if(preferencia == 'P'){
			if(primeroPasillo != 0) asiento = primeroPasillo;
			else asiento = primeroVentanilla;
		} else {
			if(primeroVentanilla !=0) asiento = primeroVentanilla;
			else asiento = primeroPasillo;
		}
		pasaje[asiento] = p;
		numReservas++;
		return asiento;

	}
	
	public void cancelarREserva(int asiento, int numReserva){
		if(pasaje[asiento] == null) throw new IllegalArgumentException("No tienes de eso");
		
		//quito reserva
		pasaje[asiento] = null;
		numReserva--;
	}
	
	public String toString(){
		String res = id + " " + origen + " " + destino + " " + horaS + " " + horaL + " " + capacidad + " " + numReservas;
		res = res + "\npasajeros+\n";
		
		for (int i = 1; i < pasaje.length; i++) {
			if(pasaje[i] != null){
				res += "Asiento " + i + ": " + pasaje[i].toString() + "\n";
			}
		}
		return res;
	}
}
