package Veterinaria.models;

public class Expediente {
    public Servicios servicios;


    public void validarServi(){

        if(Servicios.listServicios.size()>0){
            for (Servicios servi : Servicios.listServicios) {
                System.out.println("Sercio:"+servi.getNombreServicio());

            }
        }

    }
}
