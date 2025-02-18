package ec.edu.espoch.gestiontareas.controlador;

import ec.edu.espoch.gestiontareas.modelo.GestorProducto;
import ec.edu.espoch.gestiontareas.modelo.Producto;
import ec.edu.espoch.gestiontareas.tester.TesterControlador;
import ec.edu.espoch.gestionproductos.vista.ListarIU;
import ec.edu.espoch.gestionproductos.vista.Principal;

/**
 *
 * @author User
 */
public class Controlador {

    private Principal principal;
    private GestorProducto gestorProducto;
    private ListarIU listarIU;
    //Cuando hagas conexion con el modelo --> quita los /// de la linea 17
    //private GestorTarea gestorTarea;

    public Controlador(Principal principal, ListarIU listarIU) {
        this.principal = principal;
        this.listarIU= listarIU;
        //Cambia el constructor de la clase modelo
        this.gestorProducto = new GestorProducto();
    }

    public void registraProducto() {

        try {
            if (this.principal != null) {
                Producto objProducto = new Producto ();
                objProducto.setNombre(this.principal.getNombre());
                objProducto.setPrecio(this.principal.getPrecio());
                objProducto.setdisponible(this.principal.isDisponible());
                String msm = gestorProducto.agregarProducto(objProducto);

                principal.error(msm);
                     

            } else {
                principal.error("Completa los datos!");
            }
        } catch (Exception e) {
            principal.error("Error controlado:" + e);
        }
    }

    public void listarProducto() {

        try {
            String msm = "";
            Producto[] productos = new Producto[5];
            productos  = gestorProducto.listarProductos();
            if (productos  != null) {
                String lista = "";
                for (int i = 0; i < productos .length; i++) {
                    if (productos [i] != null) {
                        lista = lista + "id:" + productos [i].getId()+ "\n"
                                + "Nombre:" + productos [i].getNombre()+ "\n"
                                + "Precio:" + productos [i].getPrecio()+ "\n"
                                + "Disponible:" + productos [i].isDisponible()+ "\n";
                    }
                }
                msm = lista;
            } else {
                msm = "No hay datos que mostrar";
            }
            listarIU.mostrarDatos(msm);

        } catch (Exception e) {
            System.out.println("Error Controlador-listarProducto: " + e);
        }
    }
}
