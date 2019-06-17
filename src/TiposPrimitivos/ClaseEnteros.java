package TiposPrimitivos;
import java.lang.*;
public class ClaseEnteros {


    public static void main(String[] args) {
        System.out.println("bits tipo byte: " + Byte.SIZE);
        System.out.println("bytes tipo byte: " + Byte.BYTES);
        System.out.println("Valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte: " + Byte.MAX_VALUE);
        System.out.println();
        System.out.println("bits tipo short: " + Short.SIZE);
        System.out.println("bytes tipo short: " + Short.BYTES);
        System.out.println("Valor minimo short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo short: " + Short.MAX_VALUE);
        System.out.println();
        System.out.println("bits tipo int: " + Integer.SIZE);
        System.out.println("bytes tipo int: " + Integer.BYTES);
        System.out.println("Valor minimo int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo int: " + Integer.MAX_VALUE);
        System.out.println();
        System.out.println("bits tipo long: " + Long.SIZE);
        System.out.println("bytes tipo long: " + Long.BYTES);
        System.out.println("Valor minimo long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo long: " + Long.MAX_VALUE);
        System.out.println();

        byte byteVar = 127;
        System.out.println("byteVar = " + byteVar);
        short shortVar = 100;
        System.out.println("shortVar = " + shortVar);
        int intVar = 500;
        System.out.println("intVar = " + intVar);
        long longVar = 1000;
        System.out.println("longVar = " + longVar);

        var numero = 10L;
        System.out.println("numero = " + numero);
    }
}
