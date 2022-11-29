package prototype;

import entidades.Persona;
import entidades.Prototipo;

public class Main {

	public static void main(String[] args) {
		Prototipo p = new Prototipo(20);
		p.setPersona(new Persona("Marco"));

		System.out.println(p.getPersona().getNombre() + ", " + p.getEdad());
		System.out.println("-------------");

		Prototipo p2 = (Prototipo) p.clone();
		System.out.println(p2.getPersona().getNombre() + ", " + p2.getEdad());

	}

}
