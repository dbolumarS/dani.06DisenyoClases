package _3ejercicios._04pasajeros;

public class pasajero {

	private String dni;
	private String nombre;
	
	
	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public pasajero(String dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		pasajero other = (pasajero) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}
	
	public String toString(){
		String r = dni + " " + nombre; 
		
		return r;
	}
	
	
		
}
