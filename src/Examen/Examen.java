package Examen;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Examen {
    public static void main(String[] args) {

        String nombre;
        int id ;
        double precio;
        char simbolo;
        boolean envioGratuito;
        Scanner getDatos = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("#.00");

        //Get Nombre
        System.out.print("Proporciona el nombre: ");
        nombre = getDatos.nextLine();
        //Get Id
        System.out.print("Proporciona el id:");
        id = Integer.parseInt(getDatos.nextLine());
        //Get Precio
        System.out.print("Proporciona el precio: ");
        precio = Double.parseDouble(getDatos.nextLine());
        //Get Simbolo
        System.out.print("Proporciona el simbolo: ");
        simbolo = getDatos.nextLine().charAt(0);
        //Get EnvioGratuito
        System.out.print("Proporciona el envio gratuito: ");
        envioGratuito = Boolean.parseBoolean(getDatos.nextLine());

        //Impresion Mensaje
        System.out.println(nombre + " " + "#" + id);
        System.out.println("Precio: " +  simbolo + formato.format(precio));
        System.out.println("Envio Gratuito: "+envioGratuito);

    }
}
