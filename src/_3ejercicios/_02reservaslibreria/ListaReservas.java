package _3ejercicios._02reservaslibreria;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ListaReservas {

	private ArrayList<Reserva> lista;
	
	public ListaReservas(){
		lista = new ArrayList<>();
	}
	
	public void reservar(String nif, String nombre, String tel, int codigo, int ejemplares) throws IllegalArgumentException{
		Reserva r = new Reserva (nif,nombre,tel,codigo,ejemplares);
		
		
		if(lista.contains(r)){
			throw new IllegalArgumentException("Reserva duplicada ");
		} else {
			lista.add(r);
		}
	}
	
	public void cancelar (String nif, int codigo) throws NoSuchElementException{
		Reserva r = new Reserva (nif,"","",codigo,0);
		if (lista.contains(r)){
			lista.remove(r);
		} else {
			throw new NoSuchElementException("la reserva no existe");
		}
	}
	
	public String toString(){
		String result = "";
		for (int i = 0; i < lista.size(); i++) {
			result = result + lista.get(i).toString() +"\n-------\n";
		}
		return result;
	}
	
	public int numEjemplaresReservados(int codigo){
		int cont = 0;
		for (int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getcodigo() == codigo){
				cont += lista.get(i).getejemplares();
			}
		}
		return cont;
		
	}
	
	public void reservasLibro(int codigo){
		for(Reserva r: lista){
			if(r.getcodigo() == codigo){
				System.out.println(r.getnombre() + " - " + r.gettel());
			}
		}
	}
	
}
