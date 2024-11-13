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
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void existeVehiculo() {
        Vehiculo vehiculo1 = new Auto("Toyota","Corolla",2018,15000,4);
        Vehiculo vehiculo2 = new Bicicleta("Bicicleta1","modelo1",2020,123456,"Ciudad");
        assertTrue(automotora.existeVehiculo(vehiculo1));
        assertFalse(automotora.existeVehiculo(vehiculo2));
    }

    @Test
    void agregarVehiculo() {
        Vehiculo vehiculo1 = new Auto("Toyota","Corolla",2018,15000,4);
        Vehiculo vehiculo2 = new Bicicleta("Bicicleta1","modelo1",2020,123456,"Ciudad");
        assertFalse(automotora.agregarVehiculo(vehiculo1));
        assertTrue(automotora.agregarVehiculo(vehiculo2));
    }
}