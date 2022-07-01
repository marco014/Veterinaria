package Veterinaria.models;

public class Peces extends Mascota{
    String SalinidadVivienda;
    String Region;

    public Peces(String salinidadVivienda, String region) {
        SalinidadVivienda = salinidadVivienda;
        Region = region;
    }

    public Peces(
            String esprecie,
            String nombre,
            int edad,
            String indicaciones,
            String salinidadVivienda,
            String region
    ) {
        super(esprecie, nombre, edad, indicaciones);
        SalinidadVivienda = salinidadVivienda;
        Region = region;
    }

    public String getSalinidadVivienda() {
        return SalinidadVivienda;
    }

    public void setSalinidadVivienda(String salinidadVivienda) {
        SalinidadVivienda = salinidadVivienda;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }
}
