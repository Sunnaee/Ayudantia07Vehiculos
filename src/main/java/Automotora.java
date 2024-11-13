import java.util.ArrayList;

public class Automotora {
	private GestorDeDatos gestor;
	private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

	public Automotora(){
		this.vehiculos = new ArrayList<Vehiculo>();
	}

	public boolean existeVehiculo(Vehiculo vehiculo) {
		for (Vehiculo vehiculoEnLista : this.vehiculos){
			if (vehiculoEnLista == vehiculo) {
				return true;
			}
		}
		return false;
	}

	public boolean agregarVehiculo(Vehiculo vehiculo) {
		if (!existeVehiculo(vehiculo)) {
			vehiculos.add(vehiculo);
			return true;
		}
		return false;
	}

	public void mostrarVehiculo(Vehiculo vehiculo) {
		System.out.println(vehiculo.toString());
	}

	public void listarVehiculos() {
		for (Vehiculo vehiculoEnLista : this.vehiculos) {
			mostrarVehiculo(vehiculoEnLista);
		}
	}

	public void guardarDatos() {
		gestor.guardarJson(this.vehiculos,"vehiculos.json");
	}

	public void cargarDatos() {
		this.vehiculos = gestor.leerJson("vehiculos.json", Vehiculo.class);
	}
}