public class Camion extends Vehiculo {
	private int capCarga;

	public Camion(String marca, String modelo, int anio, int precio, int capCarga){
		super(marca, modelo, anio, precio);
		this.capCarga = capCarga;
	}

	public int getCapCarga() {
		return this.capCarga;
	}

	public void setCapCarga(int capCarga) {
		this.capCarga = capCarga;
	}

	@Override
	public String toString() {
		return "Vehiculo = Camión"+super.toString()+" | Capacidad de Carga = "+this.capCarga;
	}
}