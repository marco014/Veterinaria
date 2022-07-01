package Veterinaria.models;

import java.util.ArrayList;

public class Servicios {
    String nombreServicio, Descripcion;
    int Precio;

    int codigo;

    public static ArrayList<Servicios> listServicios = new ArrayList<Servicios>();

    public Servicios(String nombreServicio, String descripcion, int precio) {
        this.nombreServicio = nombreServicio;
        Descripcion = descripcion;
        Precio = precio;
        codigo = (int) (Math.random() * 10000 + 1);
    }

    public Servicios() {}

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Servicios> getListServicios() {
        return listServicios;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }

    public void addService(Servicios servicios) {
        listServicios.add(servicios);
        System.out.println("Servicio Completado");
    }
}
