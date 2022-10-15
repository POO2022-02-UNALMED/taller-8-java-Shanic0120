package futbol;

public class Portero extends Futbolista {
	public short golesRecibidos;
	public byte dorsal;

	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}

	@Override
	public boolean jugarConLasManos() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return Math.abs(this.golesRecibidos - ((Portero) o).golesRecibidos);
	}

	public String toString() {
		// TODO Auto-generated method stub
		return "El futbolista " + getNombre() + " tiene " + getEdad() + ", y juega de " + getPosicion()
				+ " con el dorsal " + this.dorsal + ". Le han marcado " + golesRecibidos;
	}
}