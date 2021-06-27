package BL;

public class Usuario {
	
	private int id;
	private String nombre; 
	private String rol;
	private int voto;
	
	public int votar() {
		
		return 0;
	}
	
	public void setNombre(String pNombre) {
	nombre = pNombre;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setRol(String pRol) {
		rol = pRol;
	}

	public String getRol() {
		return rol;
	}
	
	public void setVoto(int pVoto) {
		voto = pVoto;
	}

	public int getVoto() {
		return voto;
	}
}
