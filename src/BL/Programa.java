package BL;
import java.util.Scanner;

public class Programa {
	
		private Fibonacci metodoFibonacci; 
		private Usuario usuario1;
		private Usuario usuario2;
		private Usuario usuario3;
		private Sala sala1;
		Scanner teclado = new Scanner(System.in);
	
		public void iniciar() {
			
			System.out.println("Mi Programa Plannig Poker");
			metodoFibonacci = new Fibonacci();
			usuario1 = new Usuario();
			usuario2 = new Usuario();
			usuario3 = new Usuario();
			sala1 = new Sala();
			
			metodoFibonacci.generarSerieFibonacci();
			
			String nombreString = "German";
			String apellidoString = "Rojas";
			int edad = 30;
			
		
			/*retorno = metodoFibonacci.metodoEjemplo(nombreString, apellidoString, edad);	
			System.out.println("retorno del metodo"+retorno);*/
						
			leerDatos(usuario1);
			leerDatos(usuario2);
			leerDatos(usuario3);
			
						
			System.out.println("El usuario 1 es : \n" + "Nombre : " + usuario1.getNombre() + " Rol : " +usuario1.getRol() + " Voto: " + usuario1.getVoto());
			System.out.println("El usuario 2 es : \n" + "Nombre : " + usuario2.getNombre() + " Rol :" +usuario2.getRol() + " Voto: " + usuario2.getVoto());
			System.out.println("El usuario 3 es : \n" + "Nombre : " +usuario3.getNombre() + " Rol : " +usuario3.getRol() + " Voto :  " + usuario3.getVoto());
			sala1.calcularPromedioVotos(usuario1, usuario2, usuario3);
		}
		
		private void leerDatos(Usuario u) {
						
			String pNombre;
			String pRol; 
			int pVoto = 0;
			boolean esSerie = true;
			
			
			System.out.println(" \n Ingrese su nombre de usuario : ");
			pNombre = teclado.next();
			
			System.out.println("Ingrese su Rol : ");
			pRol = teclado.next();
			
			
			do  {
				esSerie = true;
				System.out.println("Ingrese su votacion: ");
				try {
					pVoto = teclado.nextInt();	
				} catch(Exception e) {
					esSerie = false;
					teclado.nextLine();
				}
				
				if (esSerie==true)
					esSerie = metodoFibonacci.validarVoto(pVoto);	
				
				if (esSerie==false) {
					System.out.println("El numero no es valido Respuesta : "+ esSerie);
				}			
			} while (esSerie==false);
			
							
			
							
			u.setNombre(pNombre);
			u.setRol(pRol);
			u.setVoto(pVoto);
		}
		
		
		
}


