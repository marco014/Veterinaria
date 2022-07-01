package Veterinaria.models;

public class Inventario {
    public Producto producto;

    public void showInventario() {
        //producto = new Producto();
        if (Producto.listaProdcuts.size() > 0) {
            for (Producto producto : Producto.listaProdcuts) {
                if (producto.getCatidad() > 0) {
                    System.out.println("Nombre dek Produco " + producto.getNombre());
                    System.out.println("Cantidad " + producto.getCatidad());
                    System.out.println("Precio $ " + producto.getPrecio());
                } else {
                    System.out.println(
                            "El producto " + producto.getNombre() + "no tiene existencia"
                    );
                }
            }
        }
    }
}
