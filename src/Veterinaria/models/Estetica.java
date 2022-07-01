package Veterinaria.models;

public class Estetica extends Servicios{

    String nombreEstetico;

    public Estetica(
            String nombreServicio,
            String descripcion,
            int precio,
            String nombreEstetico
    ) {
        super(nombreServicio, descripcion, precio);
        this.nombreEstetico = nombreEstetico;
    }

    public Estetica(String nombreEstetico) {
        this.nombreEstetico = nombreEstetico;
    }

    public String getNombreEstetico() {
        return nombreEstetico;
    }

    public void setNombreEstetico(String nombreEstetico) {
        this.nombreEstetico = nombreEstetico;
    }

}
