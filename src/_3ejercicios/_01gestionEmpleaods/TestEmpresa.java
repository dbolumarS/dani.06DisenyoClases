package _3ejercicios._01gestionEmpleaods;

public class TestEmpresa {
	public static void main(String[] args) {
		//Creamos empresa
		Empresa emp = new Empresa("1º DAM Softw");
		
		
		//Contratar a algunos empleados
		emp.contratar(new Empleado("39350139M", "Luis Gonzalez ", 2010,12000));
		emp.contratar(new Empleado("39350139K", "Luisa Perales ", 2011,12000));
		emp.contratar(new Empleado("39350139L", "Luis Gomez ", 2012,12000));
		emp.contratar(new Empleado("33333333H", "Jose Ruiz ", 2013,12000));
		emp.contratar(new Empleado("55555555G", "Ruben Garcia ", 2014,12000));
		emp.contratar(new Empleado("44444444M", "Carlos Lopez ", 2015,12000));
		System.out.println("\n\nSe ha contatado a empleados");
		System.out.println(emp);
		
		//Despedir a alguien 
		emp.despedir("33333333H");
		//Despedir a alguien
		emp.despedir(new Empleado("44444444M","",0,0));
		System.out.println("\n\n se ha despedido a empleados");
		System.out.println(emp);
		
	}
}
