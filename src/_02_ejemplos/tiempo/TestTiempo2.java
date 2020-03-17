package _02_ejemplos.tiempo;

public class TestTiempo2 {
	
	public static void main(String[] args) {
		//Podemos crear varios objetos de tipo Tiempo.
		//Cada uno de ellos tendra sus propios valores
		//en los atributos
		Tiempo inicio = new Tiempo();
		inicio.setHora(10);
		inicio.setMinuto(0);
		inicio.setSegundo(0);
		
		Tiempo fin = new Tiempo();
		fin.setHora(14);
		fin.setMinuto(50);
		fin.setSegundo(45);
		
		System.out.println(inicio);
		System.out.println(fin);
	}
}
