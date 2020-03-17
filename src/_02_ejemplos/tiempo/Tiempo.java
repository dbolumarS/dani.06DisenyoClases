package _02_ejemplos.tiempo;

	//Con implements Comparable estamos indicando que un objeto Tiempo se puede comparar con otro objeto Tiempo

public class Tiempo implements Comparable<Tiempo> {
	//Atributos (Informacion que almacenan los objetos de la clase)
	
	private int hora; //private restringe el acceso
	private int minuto;
	private int segundo;
	
	
	//Metodos constructores: Son los que se udan para crear objetos de la clase.
	//Permiten que se pueda crear objetos de la clase con valores distinos a los valores por defecto

	//Metodo constructor sin el void
	public Tiempo (int hora, int minuto, int segundo){
		
		this.setHora(hora); //mejor this.hora = hora
		this.setMinuto(minuto); //mejor this.minuto = minuto
		this.setSegundo(segundo); //mejor this.segundo = segundo
	}
	
	//Constructor para crear as 00:00:00
	public Tiempo(){
		//this.hora = 0;
		//this.minuto = 0;
		//this.segundo = 0;
		this(0,0,0); //Esto ejecuta el otro constructor de arriba al poner los 3 digitos
	}
	
	//Constructor para crear Tiempo a partir de un String "hh:mm:ss"
	public Tiempo (String texto){
		int pos1 = texto.indexOf(":");
		int pos2 = texto.lastIndexOf(":");
		
		int h = Integer.parseInt(texto.substring(0,pos1));
		int m = Integer.parseInt(texto.substring(pos1+1,pos2));
		int s = Integer.parseInt(texto.substring(pos2+1));
		
		this.setHora(h);
		this.setMinuto(m);
		this.setSegundo(s);
	}
	
	//Constructor para crear Tiempo a partir de una cantidad de segundos
	public Tiempo (int num) {
		int h = num / 3600;
		int m = num % 3600/60;
		int s = num % 60;
		
		this.setHora(h);
		this.setMinuto(m);
		this.setSegundo(s);
	}
	
	//Metodos getter : Permiten consultar el valor de los atributos
	public int getHora(){
		return this.hora;
	}
	
	public int getMinuto(){
		return this.minuto;
	}
	
	public int getSegundo(){
		return this.segundo;
	}
	
	//Metodos setter: Permiten cambipublic static void main(String[] args)ar el valor de los atributos
	
	public void setHora(int hora){
	/*	if(hora < 0){
			hora = 0;
		} if (hora > 23){
			hora = 23;
		}*/
		
		if (hora < 0 || hora > 23){
			throw new IllegalArgumentException("Hora Incorrecta");
		}
		this.hora = hora;
		
	}
	
	public void setMinuto(int minuto){
	/*	if(minuto < 0){
			minuto = 0;
		} if (minuto > 59){
			minuto = 59;
		}*/
		
		if (minuto < 0 || minuto > 59){
			throw new IllegalArgumentException("minuto Incorrecta");
		}
		this.minuto = minuto;
	}
	
	public void setSegundo(int segundo){
	/*	if(segundo < 0){
			segundo = 0;
		} if (segundo > 59){
			segundo = 59;
		}*/
		
		if (segundo < 0 || segundo > 59){
			throw new IllegalArgumentException("Hora Incorrecta");
		}
		this.segundo = segundo;
	}
	
	/**
	 *Devuelve un String con la informacion
	 *del objeto, tal cual queremos que se represente
	 *en pantalla
	 */
	public String toString(){ 
		String result;
		result = this.hora + ":" + this.minuto + ":" + this.segundo;
		return result;
	}
	
	public boolean equals(Object o){
		if (this == o) return true;
		
		if (o == null) return false;
		
		if (!(o instanceof Tiempo)) return false;
		
		Tiempo t = (Tiempo) o;
		if(this.hora == t.hora && this.minuto == t.minuto && this.segundo == t.segundo){
			return true;
		} else {
			return false;
		}
	}
	
	public int compareTo(Tiempo t){
		if (this.hora < t.hora) return -1;
		if (this.hora > t.hora) return 1;
		
		if (this.minuto < t.minuto) return -1;
		if (this.minuto > t.minuto) return 1;
		
		if (this.segundo < t.segundo) return -1;
		if (this.segundo > t.segundo) return 1;
		
		else return 0;
	}
	
	public int compareTo2(Tiempo t){
		return (this.hora*3600 + this.minuto * 60 + this.segundo) - (t.hora * 3600 + t.minuto * 60 + t.segundo);
	}
}
