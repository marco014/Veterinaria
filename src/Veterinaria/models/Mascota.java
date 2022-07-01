package Veterinaria.models;

import java.util.ArrayList;

public class Mascota {
    String Esprecie;
    String Nombre;
    int Edad;
    String Indicaciones;

    public static ArrayList<Mascota> listaPets = new ArrayList<Mascota>();

    public ArrayList<Mascota> getListaPets() {
        return listaPets;
    }

    public Mascota() {}

    public Mascota(
            String esprecie,
            String nombre,
            int edad,
            String indicaciones
    ) {
        Esprecie = esprecie;
        Nombre = nombre;
        Edad = edad;
        Indicaciones = indicaciones;
    }

    public String getEsprecie() {
        return Esprecie;
    }

    public void setEsprecie(String esprecie) {
        Esprecie = esprecie;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getIndicaciones() {
        return Indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        Indicaciones = indicaciones;
    }

    public void addPet(Mascota pet) {
        listaPets.add(pet);
        System.out.println("Mascota Registrada");
    }
}
