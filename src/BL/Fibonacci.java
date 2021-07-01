package BL;

public class Fibonacci {
	
	private int secuencia;
	
	
	
	public int  generarSerieFibonacci () {
		
		int x = 0;
		int y = 1;
		int limite = 10;
		int serie = 0; 
		
		for(int i = 1; i <= limite; i++) 
		{
			System.out.print(" " + x);
			x = x + y;
			y= x - y; 
			serie = x;

		}
			return serie; 
	}
	
	public boolean validarVoto(int pVoto) {
		
		int x = 0;
		int y = 1;
		int limite = 10;
		int serie = 0; 
		
		for(int i = 1; i <= limite; i++) 
		{
			x = x + y;
			y= x - y; 
			serie = x;
			
			if (serie == pVoto) {
				
				return true; 
			}
		}
				
		return false;
	}
	
	
	
	public int metodoEjemplo(String nombre, String apellido, int edad) {
		System.out.println("Este es el nombre: " + nombre);
		System.out.println("Este es el apellido: " + apellido);
		System.out.println("Este es el edad: " + edad);
		
		return 5;
	}
	

}
