package entidades;

public class Persona implements Cloneable {

	private String nombre;
	
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	protected Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
