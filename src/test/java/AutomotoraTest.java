import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutomotoraTest {

    Automotora automotora = new Automotora();

    @BeforeEach
    void setUp() {
        automotora.cargarDatos();
        automotora.listarVehiculos();
        automotora.guardarDatos();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void existeVehiculo() {
        Vehiculo vehiculo1 = new Bicicleta("Bicicleta1","modelo1",2020,123456,"Ciudad");
        assertFalse(automotora.existeVehiculo(vehiculo1));
    }

    @Test
    void agregarVehiculo() {
        Vehiculo vehiculo1 = new Bicicleta("Bicicleta1","modelo1",2020,123456,"Ciudad");
        assertTrue(automotora.agregarVehiculo(vehiculo1));
    }
}