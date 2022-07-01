package Veterinaria.models;

import java.util.ArrayList;

public class Producto {
    String Nombre;
    int Precio;
    String Descripcion;

    int Cantidad;
    int idProducto;

    public static ArrayList<Producto> listaProdcuts = new ArrayList<Producto>();

    public Producto(String nombre, int precio, String descripcion, int cantidad) {
        Nombre = nombre;
        Precio = precio;
        Descripcion = descripcion;
        Cantidad = cantidad;
        idProducto=(int)(Math.random()*10000+1);
    }


    public int getIdProducto() {
        return idProducto;
    }


    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }


    public Producto() {}

    public int getCatidad() {
        return Cantidad;
    }

    public void setCatidad(int catidad) {
        this.Cantidad = catidad;
    }

    public ArrayList<Producto> getListaProdcuts() {
        return listaProdcuts;
    }

    public void setListaProdcuts(ArrayList<Producto> listaProdcuts) {
        this.listaProdcuts = listaProdcuts;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public void AddProduct(Producto producto) {
        listaProdcuts.add(producto);
        System.out.println("Producto Registrado");
    }

    public void showProducts() {
        for (int i = 0; i < listaProdcuts.size(); i++) {
            System.out.println("Nombre" + listaProdcuts.get(i).getNombre());
            System.out.println("Nombre" + listaProdcuts.get(i).getPrecio());
            System.out.println("Nombre" + listaProdcuts.get(i).getDescripcion());
        }
    }
}
