package _02_ejemplos.patronsigleton;

public class Jefe {
	static Obrero jefe = null;
	
	public static Obrero getJefe(Obrero o){
		if (jefe == null){
			jefe = o;
			return null;
		} else {
			return jefe;
		}
	}
}
