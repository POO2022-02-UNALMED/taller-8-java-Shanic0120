package futbol;

public class Jugador extends Futbolista {
	public short golesMarcados;
	public byte dorsal;

	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}

	public Jugador() {
		super();
		this.golesMarcados = 289;
		this.dorsal = 7;
	}

	@Override
	public int compareTo(Futbolista o) {
		// TODO Auto-generated method stub
		return Math.abs(this.getEdad() - o.getEdad());
	}

	@Override
	public boolean jugarConLasManos() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "El futbolista " + getNombre() + " tiene " + getEdad() + ", y juega de " + getPosicion()
				+ " con el dorsal " + this.dorsal + ". Ha marcado " + golesMarcados;
	}

}
