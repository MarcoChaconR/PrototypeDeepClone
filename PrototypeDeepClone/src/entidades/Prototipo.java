package entidades;

public class Prototipo implements Cloneable {
	
	private int edad;
	private Persona persona;

	public Prototipo(int edad) {
		super();
		this.edad = edad;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public Object clone() {
		Prototipo p = null;
		try {
			p =(Prototipo) super.clone();
			if(persona !=null) {
				Object obj = persona.clone();
				p.persona = (Persona) obj;
			}
		}catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}
}
