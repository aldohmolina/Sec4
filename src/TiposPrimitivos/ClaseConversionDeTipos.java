package TiposPrimitivos;

import java.util.Scanner;

public class ClaseConversionDeTipos {
    public static void main(String[] args) {
        //String -> Double
        int edad = Integer.parseInt("20");
        System.out.println("edad = " + edad);
        System.out.println();
        //String -> Double
        double valorPI = Double.parseDouble("3.141592");
        System.out.println("valorPI = " + valorPI);
        System.out.println();
        //String -> Char
        char c = "Hola".charAt(0);
        System.out.println("c = " + c);
        System.out.println();

        //Scanner
        Scanner scannerEdad = new Scanner(System.in);
        edad = Integer.parseInt(scannerEdad.nextLine());
        edad++;
        System.out.println("Tu Edad es de " + edad);
        System.out.println();

        //Scanner.nextLine().CharAt(n)
        c = scannerEdad.nextLine().charAt(0);
        System.out.println("c = " + c);
    }
}
