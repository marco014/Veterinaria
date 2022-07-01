package Veterinaria.models;

import java.util.ArrayList;

public class Consulta extends Servicios {

    String NombreVeterinario;
    String Medicamentos;

    ArrayList<String> ListaMedicamento = new ArrayList<String>();

    public Consulta(){}

    public Consulta(
            String nombreServicio,
            String descripcion,
            int precio,
            String nombreVeterinario,
            String medicamentos
    ) {
        super(nombreServicio, descripcion, precio);
        NombreVeterinario = nombreVeterinario;
        Medicamentos = medicamentos;
    }

    public Consulta(String nombreVeterinario, String medicamentos) {
        NombreVeterinario = nombreVeterinario;
        Medicamentos = medicamentos;
    }

    public String getNombreVeterinario() {
        return NombreVeterinario;
    }

    public void setNombreVeterinario(String nombreVeterinario) {
        NombreVeterinario = nombreVeterinario;
    }

    public String getMedicamentos() {
        return Medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        Medicamentos = medicamentos;
    }
}
