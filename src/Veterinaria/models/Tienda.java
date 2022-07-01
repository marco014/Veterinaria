package Veterinaria.models;

import java.time.LocalDate;
import java.util.Scanner;

public class Tienda {

    public Scanner teclado = new Scanner(System.in);

    public void datosAddProducts() {
        String descripcion, nombre;
        int precio, cantidad;
        teclado.nextLine();
        System.out.println("Registro de Productos");
        System.out.println("Ingrese el Nombre");

        nombre = teclado.nextLine();

        System.out.println("Ingrese el Precio");
        precio = teclado.nextInt();
        System.out.println("Ingrese la Descripcion");
        descripcion = teclado.nextLine();
        teclado.nextLine();
        System.out.println("Cantidad de Producto");
        cantidad = teclado.nextInt();
        if (cantidad > 0) {
            Producto producto = new Producto(nombre, precio, descripcion, cantidad);
            producto.AddProduct(producto);
            for (Producto p : Producto.listaProdcuts) {
                System.out.println(p.getNombre());
            }
        } else {
            System.out.println("La cantidad debe ser mayor a 0");
        }
    }

    public void datosAddPet() {
        int opc = 0, edad;

        String especie, nombre, indicaciones;

        System.out.println("Registro de Mascota");
        System.out.println(
                "Tipo de Mascota a Registar\n1.- Perro\n2.- Gato\n3.- Peces\n4.- Aves"
        );
        opc = teclado.nextInt();
        System.out.println("Especie: ");
        teclado.nextLine();
        especie = teclado.nextLine();

        System.out.println("Nombre: ");
        nombre = teclado.nextLine();

        System.out.println("Edad: ");
        edad = teclado.nextInt();

        System.out.println("Indicaciones: ");
        indicaciones = teclado.nextLine();

        switch (opc) {
            case 1:
                String raza;
                int estatura;
                System.out.println("Raza: ");
                raza = teclado.nextLine();
                teclado.nextLine();
                System.out.println("Estatura en cm: ");
                estatura = teclado.nextInt();
                Perro perro = new Perro(
                        especie,
                        nombre,
                        edad,
                        indicaciones,
                        raza,
                        estatura
                );
                perro.addPet(perro);

                break;
            case 2:
                String alimentacion, razaGto;
                System.out.println("Tipo Alimetacion: ");
                alimentacion = teclado.nextLine();
                System.out.println("Raza: ");
                razaGto = teclado.nextLine();
                Gato gato = new Gato(
                        especie,
                        nombre,
                        edad,
                        indicaciones,
                        razaGto,
                        alimentacion
                );
                gato.addPet(gato);
                break;
            case 3:
                String salinidad, region;
                System.out.println("Salinidad vivienda (porcentaje %): ");
                salinidad = teclado.nextLine();
                System.out.println("Region: ");
                region = teclado.nextLine();
                Peces peces = new Peces(
                        especie,
                        nombre,
                        edad,
                        indicaciones,
                        salinidad,
                        region
                );
                peces.addPet(peces);
                break;
            case 4:
                String regionVi, color;
                float largoAlas;
                System.out.println("Region Vivienda: ");
                regionVi = teclado.nextLine();
                System.out.println("Estatura del animal: ");
                largoAlas = teclado.nextFloat();
                System.out.println("Color: ");
                color = teclado.nextLine();
                Aves aves = new Aves(
                        especie,
                        nombre,
                        edad,
                        indicaciones,
                        largoAlas,
                        color,
                        regionVi
                );
                aves.addPet(aves);

                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }

    public void datosServicios() {
        System.out.println("Registro de Servicio");

        System.out.println("1.- Cirugia\n2.- Consulta\n3.- Estetica");
        int opc = teclado.nextInt();
        switch (opc) {
            case 1:
                String nomCiru;
                LocalDate fechaFin, fechaInicio;
                teclado.nextLine();
                System.out.println("Nombre del Cirujano: ");
                nomCiru = teclado.nextLine();
                fechaInicio = LocalDate.now();
                fechaFin = LocalDate.now().plusDays(1);
                Cirugia cirugia = new Cirugia(
                        "Cirugia",
                        "Operacion de algun Problema",
                        1500,
                        nomCiru,
                        fechaInicio,
                        fechaFin
                );
                cirugia.addService(cirugia);
                break;
            case 2:
                String nombreVeterinario;
                System.out.println("Nombre veterinario");
                nombreVeterinario = teclado.nextLine();
                System.out.println("Cuantos medicamentos Agregara para la receta");
                int medica = teclado.nextInt();
                Consulta consulta = new Consulta("Consulta", "Receta de la consulta", 400, nombreVeterinario, "en la lista");
                for (int i = 0; i < medica; i++) {
                    System.out.println("Digite el medicamento");
                    String nombremedicamento = teclado.nextLine();
                    consulta.ListaMedicamento.add(nombremedicamento);
                }
                consulta =
                        new Consulta(
                                "Consulta",
                                "Receta de la consulta",
                                300,
                                nombreVeterinario,
                                "En la lista"
                        );
                consulta.addService(consulta);
                break;
            case 3:
                System.out.println("Nombre del corte para la mascota");
                String nombreCorte = teclado.nextLine();
                Estetica estetica = new Estetica(
                        "Estetica",
                        "Corte de Estilo",
                        800,
                        nombreCorte
                );
                estetica.addService(estetica);
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }

    public void showExpediente() {
        Expediente expediente = new Expediente();

        expediente.validarServi();
    }

    public void showInventario() {
        Inventario inventario = new Inventario();

        inventario.showInventario();
    }
}