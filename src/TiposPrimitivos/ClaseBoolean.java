package TiposPrimitivos;

public class ClaseBoolean {
    public static void main(String[] args) {
        //boolean
//        System.out.println("bits tipo boolean: " + Boolean.SIZE);
//        System.out.println("bytes tipo boolean: " + Boolean.BYTES);
        System.out.println("Valor minimo boolean: " + Boolean.TRUE);
        System.out.println("Valor maximo boolean: " + Boolean.FALSE);
        System.out.println();

        boolean booleanVar = false;

        if(booleanVar)
            System.out.println("La variable contiene un valor verdadero");
        else
            System.out.println("La variable contiene un valor falso");

        System.out.println();

        var edad = 23;
        var adulto = edad >=18;
        if (adulto)
            System.out.println("Eres mayor de edad");
        else
            System.out.println("Eres menor de edad");


    }
}
