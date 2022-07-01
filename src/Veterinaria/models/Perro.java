package Veterinaria.models;

public class Perro extends Mascota{
    String Raza;
    float Estatura;

    public Perro(String raza, float estatura) {
        Raza = raza;
        Estatura = estatura;
    }

    public Perro(String esprecie, String nombre, int edad, String indicaciones, String raza, float estatura) {
        super(esprecie, nombre, edad, indicaciones);
        Raza = raza;
        Estatura = estatura;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String raza) {
        Raza = raza;
    }

    public float getEstatura() {
        return Estatura;
    }

    public void setEstatura(float estatura) {
        Estatura = estatura;
    }
}
