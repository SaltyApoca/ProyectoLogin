package datos;

public class Usuario {

	private String nombre;
	public String passw;
	
	public Usuario(String nombre, String passw) {
		
		this.nombre = nombre;
		this.passw = passw;
		
	}
	
	public String getNombre() {return nombre;}
	public String getPassw() {return passw;}
	
}
