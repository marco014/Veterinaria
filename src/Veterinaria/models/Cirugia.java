package Veterinaria.models;

import java.time.LocalDate;
import java.util.Date;

public class Cirugia extends Servicios{
    String nombreCirujano;
    LocalDate FechaInicio, FechaFin;

    public Cirugia(
            String nombreServicio,
            String descripcion,
            int precio,
            String nombreCirujano,
            LocalDate fechaInicio,
            LocalDate fechaFin
    ) {
        super(nombreServicio, descripcion, precio);
        this.nombreCirujano = nombreCirujano;
        FechaInicio = fechaInicio;
        FechaFin = fechaFin;
    }

    public Cirugia(
            String nombreCirujano,
            LocalDate fechaInicio,
            LocalDate fechaFin
    ) {
        this.nombreCirujano = nombreCirujano;
        FechaInicio = fechaInicio;
        FechaFin = fechaFin;
    }

    public String getNombreCirujano() {
        return nombreCirujano;
    }

    public void setNombreCirujano(String nombreCirujano) {
        this.nombreCirujano = nombreCirujano;
    }

    public LocalDate getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        FechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        FechaFin = fechaFin;
    }
}
