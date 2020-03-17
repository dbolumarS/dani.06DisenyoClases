package _3ejercicios._04pasajeros;


import _02_ejemplos.tiempo.Tiempo;

public class TestVuelo {
	public static void main(String[] args) {
		Vuelo v = new Vuelo("IB3487", "VAL", "MAD", new Tiempo(10, 0, 0), new Tiempo(12, 0, 0), 50);

		
		v.reservarAsiento("Andres", "38743938");
		v.reservarAsiento("Adrian", "38743937");
		v.reservarAsiento("Antonio", "38743936");
		v.reservarAsiento("Aurelio", "38743935");
		v.reservarAsiento("Amador", "38743934");
		v.reservarAsiento("Julian", "38743933");
		v.reservarAsiento("Esmeregildo", "38743932");
		
		v.reservarAsiento("Vicente", "17727277", 'V');
		v.reservarAsiento("Victor", "17727276", 'V');
		v.reservarAsiento("Victoria", "17727275", 'V');
		
		v.reservarAsiento("Paco", "17727274", 'P');
		v.reservarAsiento("Pilar", "17727273", 'P');
		
		System.out.println(v);
	
	
		
	}
}
