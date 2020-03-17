package _02_ejemplos.patronsigleton;

public class Obrero {
	private String dni;
	private String nombre;
	private Obrero jefe;
	
	public Obrero(String dni, String nombre){
		this.dni = dni;
		this.nombre = nombre;
		this.jefe = Jefe.getJefe(this);
	}
	
	public String toString(){
		if(jefe == null){
			return dni + " - " + nombre + "- JEFE ";
		} else {
			return dni + " - " + nombre + "- Su jefe es: " + jefe;
		}
	}
}
