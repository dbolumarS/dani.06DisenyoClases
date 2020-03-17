package _02_ejemplos.tiempo;

public class TestTiempo3 {

		public static void main(String[] args) {
			Tiempo t = new Tiempo(10,20,30);
			System.out.println(t);
			
			Tiempo t2 = new Tiempo(18,0,0);
			System.out.println(t2);
			
			Tiempo t3 = new Tiempo("20:10:3");
			System.out.println(t3);
			
			Tiempo t4 = new Tiempo(1000);
			System.out.println(t4);
		}
}
