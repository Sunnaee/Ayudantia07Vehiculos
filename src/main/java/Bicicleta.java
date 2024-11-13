public class Bicicleta extends Vehiculo {
	private String tipo;

	public Bicicleta(String marca, String modelo, int anio, int precio, String tipo){
		super(marca, modelo, anio, precio);
		this.tipo = tipo;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Vehiculo = Bicicleta"+super.toString()+" | Tipo de bicicleta = "+this.tipo;
	}
}