import com.fasterxml.jackson.annotation.JsonProperty;

public class Bicicleta extends Vehiculo {
	@JsonProperty("tipoBicicleta")
	private String tipoBici;
	private String tipo;

	public Bicicleta(){}

	public Bicicleta(String marca, String modelo, int anio, int precio, String tipoBici){
		super(marca, modelo, anio, precio);
		this.tipoBici = tipoBici;
		this.tipoBici = "Bicicleta";
	}

	public String getTipo(){
		return "Bicicleta";
	}

	public String getTipoBici() {
		return this.tipoBici;
	}

	public void setTipoBici(String tipoBici) {
		this.tipoBici = tipoBici;
	}

	@Override
	public String toString() {
		return "Vehiculo = "+getTipo()+super.toString()+" | Tipo de bicicleta = "+this.tipoBici;
	}
}