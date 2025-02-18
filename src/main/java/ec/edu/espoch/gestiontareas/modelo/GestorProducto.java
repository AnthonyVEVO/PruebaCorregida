/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.gestiontareas.modelo;

/**
 *
 * @author AnthonyVEVo
 */
public class GestorProducto {
    
    int tamanoVector = 5;
    Producto[] productos = new Producto[tamanoVector];
    int cont = 0;

    public String agregarProducto(Producto producto) {
        String msg = "Ingreso exitoso";
        if (productos.length != cont) {
            for (int i = 0; i < productos.length; i++) {
                if (productos[i] == null) {
                    //inicializar el objeto
                    productos[i] = new Producto();
                    productos[i].setId(i);
                    productos[i].setNombre(producto.getNombre());
                    productos[i].setPrecio(producto.getPrecio());
                    productos[i].setdisponible(producto.isDisponible());
                    cont++;
                    //con esto me aseguro que los datos solo se ingresen una vez en el vector. 
                    return msg;
                }
            }
        } else {
                msg = "Ingreso no permitido, el vector esta lleno";
        }
        return msg;
    }

    public Producto[] listarProductos() {

        Producto[] auxProductos = new Producto[tamanoVector];
        for (int i = 0; i < cont; i++) {

            //if (tareas[i].getEstado()) {
            auxProductos[i] = new Producto();
            auxProductos[i].setId(productos[i].getId());
            auxProductos[i].setNombre(productos[i].getNombre());
            auxProductos[i].setPrecio(productos[i].getPrecio());
            auxProductos[i].setdisponible(productos[i].isDisponible());
            System.out.println("Modelo-listarProducto" + auxProductos[i].isDisponible());
            // }
        }
        return auxProductos;
    }

}
