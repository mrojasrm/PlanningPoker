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
		}
		return serie; 
	}
	
	

}
