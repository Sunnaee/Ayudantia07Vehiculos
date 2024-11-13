import com.fasterxml.jackson.annotation.JsonProperty;

public class Camion extends Vehiculo {
	@JsonProperty("capacidadCargaToneladas")
	private int capCarga;
	private String tipo;

	public Camion(){}

	public Camion(String marca, String modelo, int anio, int precio, int capCarga){
		super(marca, modelo, anio, precio);
		this.capCarga = capCarga;
		this.tipo = "Camion";
	}

	public String getTipo(){
		return "Camion";
	}

	public int getCapCarga() {
		return this.capCarga;
	}

	public void setCapCarga(int capCarga) {
		this.capCarga = capCarga;
	}

	@Override
	public String toString() {
		return "Vehiculo = "+getTipo()+super.toString()+" | Capacidad de Carga = "+this.capCarga;
	}
}