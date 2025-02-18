package ec.edu.espoch.gestiontareas.tester;

import ec.edu.espoch.gestionproductos.vista.Principal;

public class TesterVista {

    private Principal principal;

    public TesterVista(Principal principal) {
        this.principal = principal;
    }

    public void prueba() {
        //Principal principal=new Principal();
        try {
            System.out.println("Nombre: " + principal.getNombre());
            System.out.println("Precio: " + principal.getPrecio());
            System.out.println("Disponible: " + principal.getDisponible());

        } catch (NumberFormatException e) {
            //vista.mostrarError("Error cambiate a ambiental");
        }

    }
}
