package Veterinaria;

import Veterinaria.models.Mascota;
import Veterinaria.models.Producto;
import Veterinaria.models.Servicios;
import Veterinaria.models.Tienda;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner teclado = new Scanner(System.in);
    static ArrayList<Producto> listaCompraPro = new ArrayList<Producto>();
    static ArrayList<Servicios> listaCompraSer = new ArrayList<Servicios>();

    public static void main(String[] args) {
        System.out.println("Bienvenido ala Veterinaria El Piolin");
        boolean bandera = true;
        Tienda tienda = new Tienda();

        do {
            System.out.println("Que desea hacer?");
            System.out.println(
                    "1.- Registar Productos\n2.- Ingresar Mascota\n3.- Ver Expediente de Mascota\n4.- Inventario\n5.- Comprar\n6.- Agregar servicios\n7.- Ver mascotas\n8.- Pagar Y salir"
            );

            int opc = teclado.nextInt();
            //teclado.nextLine();

            switch (opc) {
                case 1:
                    tienda.datosAddProducts();
                    break;
                case 2:
                    tienda.datosAddPet();
                    break;
                case 3:
                    tienda.showExpediente();
                    break;
                case 4:
                    tienda.showInventario();
                    break;
                case 5:
                    comprar();
                    bandera = false;
                    break;
                case 6:
                    tienda.datosServicios();
                    break;
                case 7:
                    for (Mascota masco : Mascota.listaPets) {
                        System.out.println("Nombre " + masco.getNombre());
                        System.out.println("Edad " + masco.getEdad());
                        System.out.println("Especie " + masco.getEsprecie());
                    }

                    break;
                case 8:
                    int total = 0;
                    if (listaCompraPro.size() > 0 || listaCompraSer.size() > 0) {
                        System.out.println("Productos a pagar");
                        for (Producto pro : listaCompraPro) {
                            System.out.println("Nombre " + pro.getNombre());
                            System.out.println("Precio " + pro.getPrecio());

                            pro.setCatidad(pro.getCatidad() - 1);

                            total += pro.getPrecio();
                        }

                        for (Servicios ser : listaCompraSer) {
                            System.out.println("Nombre " + ser.getNombreServicio());
                            System.out.println("Precio " + ser.getPrecio());

                            total += ser.getPrecio();
                        }

                        System.out.println("Su total a Pagar es " + total);

                        System.out.println("Ingrese la cantidad con la que pagara: ");
                        int pago = teclado.nextInt();
                        if (pago < total) {
                            System.out.println(
                                    "La cantidad ingresada es menor al total a pagar"
                            );
                        } else {
                            total = pago - total;
                            System.out.println("Su cambio es " + total);
                            System.out.println("Gracias por su compra");
                        }
                    } else {
                        System.out.println("No compro nada aun");
                    }

                    bandera = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (bandera);
}

    public static void comprar() {
        System.out.println("Desea realizar una compra\n 1.-Productos \n2.-Servicios ");

        int opc = teclado.nextInt();
        switch (opc) {
            case 1:
                if (Producto.listaProdcuts.size() > 0) {
                    for (Producto pro : Producto.listaProdcuts) {
                        System.out.println("Codigo del Producto " + pro.getIdProducto());
                        System.out.println("Nombre del producto " + pro.getNombre());
                        System.out.println("Precio " + pro.getPrecio());
                    }

                    System.out.println("Ingrese el codigo del producto: ");
                    int codigo = teclado.nextInt();

                    for (int i = 0; i < Producto.listaProdcuts.size(); i++) {
                        if (Producto.listaProdcuts.get(i).getIdProducto() == codigo) {
                            listaCompraPro.add(Producto.listaProdcuts.get(i));
                        } else {
                            System.out.println("Codigo no Encontrado");
                        }
                    }
                }

                break;
            case 2:
                if (Servicios.listServicios.size() > 0) {
                    for (Servicios servi : Servicios.listServicios) {
                        System.out.println("Codigo del Servicio " + servi.getCodigo());
                        System.out.println( "Nombre del Servicio " + servi.getNombreServicio());
                        System.out.println("Precio " + servi.getPrecio());
                    }

                    System.out.println("Ingrese el codigo del producto: ");
                    int codigo = teclado.nextInt();

                    for (int i = 0; i < Servicios.listServicios.size(); i++) {
                        if (Servicios.listServicios.get(i).getCodigo() == codigo) {
                            listaCompraSer.add(Servicios.listServicios.get(i));
                        } else {
                            System.out.println("Codigo no Encontrado");
                        }
                    }
                }
                break;
            default:
                break;
        }
    }
}


