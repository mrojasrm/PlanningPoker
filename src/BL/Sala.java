package BL;



public class Sala {
	
	private int id;
	private String nombre;
	private int cantidad;
	
	public float calcularPromedioVotos(Usuario pUsuario1, Usuario pUsuario2, Usuario pUsuario3) {
		int promedio = 0;
		int cantidad = 3; 
		promedio = pUsuario1.getVoto() + pUsuario2.getVoto() + pUsuario3.getVoto() / cantidad;
		System.out.println("El promedio de la votacion es : " + promedio);
		return promedio;
	}

}
