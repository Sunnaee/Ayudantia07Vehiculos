public class Auto extends Vehiculo {
	private int numPuertas;

	public Auto(String marca, String modelo, int anio, int precio, int numPuertas){
		super(marca, modelo, anio, precio);
		this.numPuertas = numPuertas;
	}

	public int getNumPuertas() {
		return this.numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	@Override
	public String toString() {
		return "Vehiculo = Auto"+super.toString()+" | Número de puertas = "+this.numPuertas;
	}
}