package _02_ejemplos.nimeroobjetos;

import java.util.NoSuchElementException;

//Usando un atributo static vamos a controlar que no se puedan 
//crea mas de tres administradores
public class Administrador {
	
	private static int conAdministradores = 0;
	private String usr;
	private String pwd;
	
	public Administrador(String usr,String pwd){
		if(conAdministradores < 3){
		this.pwd = pwd;
		this.usr = usr;
		}else {
			throw new NoSuchElementException("Alcanzado numero maximo de admisitradores");
		}
	}
	
	public String toString(){
		return usr + " - " + pwd.replace(pwd,"*");
	}
}
