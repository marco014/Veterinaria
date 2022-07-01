package Veterinaria.models;

public class Gato extends Mascota{
    String Raza;
    String tipoAlimentacion;


    public Gato(String raza, String tipoAlimentacion) {
        Raza = raza;
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public Gato(String esprecie, String nombre, int edad, String indicaciones, String raza, String tipoAlimentacion) {
        super(esprecie, nombre, edad, indicaciones);
        Raza = raza;
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String raza) {
        Raza = raza;
    }

    public String getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    public void setTipoAlimentacion(String tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }

}
