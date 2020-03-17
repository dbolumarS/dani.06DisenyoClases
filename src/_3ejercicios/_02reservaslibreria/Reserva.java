package _3ejercicios._02reservaslibreria;

public class Reserva implements Comparable<Reserva> {

	private String nif;
	private String nombre;
	private String tel;
	private int codigo;
	private int ejemplares;

	public Reserva(String nif, String nombre, String tel, int codigo, int ejemplares) {
		this.nif = nif;
		this.nombre = nombre;
		this.tel = tel;
		this.codigo = codigo;
		this.ejemplares = ejemplares;
	}

	public Reserva(String nif, String nombre, String tel, int codigo) {
		this(nif, nombre, tel, codigo, 1);
	}

	public String getnif() {
		return this.nif;
	}

	public String getnombre() {
		return this.nombre;
	}

	public String gettel() {
		return this.tel;
	}

	public int getcodigo() {
		return this.codigo;
	}

	public int getejemplares() {
		return this.ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}


	public boolean equals(Object o) {

		if (this == o)
			return true;

		if (o == null)
			return false;

		if (!(o instanceof Reserva))
			return false;

		Reserva r = (Reserva) o;
		if (this.nif.equals(r.nif) && this.codigo == r.codigo) {
			return true;
		} else
			return false;

	}

	public int compareTo(Reserva r) {
		if (this.codigo > r.codigo)
			return -1;
		else if (this.codigo < r.codigo)
			return 1;

		else return this.nif.compareTo(r.nif);
	}
	
	public String toString() {
		
		return String.format("Nif: %s \nNombre: %s \nTelefono: %s \nCodigo: %d \nEjemplares: %d");
	}
}
