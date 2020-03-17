package _02_ejemplos.bloquestatic;

public class Persona {
	//Un bloque de codigo stati ese un fragmento de 
	//codigo que se ejecuta automaticamente la primera vez que se usa la clase
	static{
		System.out.println("HOla");
	}
	
	private String dni;
	private String nombre;
	
	public Persona(String dni, String nombre){
		this.dni = dni;
		this.nombre = nombre;
	}
	
	public String toString(){
		return dni + " - " + nombre;
	}
}

