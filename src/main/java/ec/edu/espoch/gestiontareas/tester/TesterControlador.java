package ec.edu.espoch.gestiontareas.tester;

import ec.edu.espoch.gestiontareas.controlador.Controlador;
import ec.edu.espoch.gestiontareas.modelo.Producto;

/**
 *
 * @author User
 */
public class TesterControlador {

    public void prueba(Producto objProducto) {
        System.out.println("Nombre: " + objProducto.getNombre());
        System.out.println("Precio: " + objProducto.getPrecio());
        System.out.println("Disponible: " + objProducto.getDisponible());
    }

}
