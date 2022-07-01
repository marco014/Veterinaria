package Veterinaria.models;

public class Aves extends Mascota{
    float largoAlas;

    String Color;

    String RegionVivienda;

    public Aves(float largoAlas, String color, String regionVivienda) {
        this.largoAlas = largoAlas;
        Color = color;
        RegionVivienda = regionVivienda;
    }

    public Aves(
            String esprecie,
            String nombre,
            int edad,
            String indicaciones,
            float largoAlas,
            String color,
            String regionVivienda
    ) {
        super(esprecie, nombre, edad, indicaciones);
        this.largoAlas = largoAlas;
        Color = color;
        RegionVivienda = regionVivienda;
    }

    public float getLargoAlas() {
        return largoAlas;
    }

    public void setLargoAlas(float largoAlas) {
        this.largoAlas = largoAlas;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getRegionVivienda() {
        return RegionVivienda;
    }

    public void setRegionVivienda(String regionVivienda) {
        RegionVivienda = regionVivienda;
    }
}
