import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GestorDeDatos {
	private Automotora automotora;

	private final ObjectMapper mapper = new ObjectMapper();

	public <T> void guardarJson(ArrayList<T> lista, String ubicacionArchivo) {
		try {
			mapper.writeValue(new File(ubicacionArchivo), lista);
			System.out.println("Lista guardada en "+ubicacionArchivo);
		} catch (Exception e) {
			System.out.println("Error al guardar la lista en "+ubicacionArchivo+": "+e.getMessage());
		}
	}

	public <T> ArrayList<T> leerJson(String ubicacionArchivo, Class<T> clase) {
		try {
			return mapper.readValue(new File(ubicacionArchivo), mapper.getTypeFactory().constructCollectionType(List.class, clase));
		} catch (Exception e) {
			System.out.println("Error al leer la lista de "+ubicacionArchivo+": "+e.getMessage());
			return null;
		}
	}
}