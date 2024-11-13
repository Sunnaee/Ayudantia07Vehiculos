import com.fasterxml.jackson.annotation.JsonProperty;

public class Auto extends Vehiculo {
	@JsonProperty("numeroPuertas")
	private int numPuertas;
	private String tipo;

	public Auto(){}

	public Auto(String marca, String modelo, int anio, int precio, int numPuertas){
		super(marca, modelo, anio, precio);
		this.numPuertas = numPuertas;
		this.tipo = "Auto";
	}

	public String getTipo(){
		return "Auto";
	}

	public int getNumPuertas() {
		return this.numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	@Override
	public String toString() {
		return "Vehiculo = "+getTipo()+super.toString()+" | Número de puertas = "+this.numPuertas;
	}
}