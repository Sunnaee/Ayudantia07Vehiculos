import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;

public class GestorDeDatos {
	private Automotora automotora;

	private final ObjectMapper mapper = new ObjectMapper();

	public <T> void guardarJson(ArrayList<T> lista, String ubicacionArchivo) {
		throw new UnsupportedOperationException();
	}

	public <T> ArrayList<T> leerJson(String ubicacionArchivo, Class<T> clase) {
		throw new UnsupportedOperationException();
	}
}