package TiposPrimitivos;

public class ClaseFlotantes {
    public static void main(String[] args) {
        System.out.println("bits tipo float: " + Float.SIZE);
        System.out.println("bytes tipo float: " + Float.BYTES);
        System.out.println("Valor minimo float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo float: " + Float.MAX_VALUE);
        System.out.println();
        System.out.println("bits tipo douuble: " + Double.SIZE);
        System.out.println("bytes tipo douuble: " + Double.BYTES);
        System.out.println("Valor minimo douuble: " + Double.MIN_VALUE);
        System.out.println("Valor maximo douuble: " + Double.MAX_VALUE);
        System.out.println();

        float floatVar = 1.0f;
        double doubleVar = 1.0D;

        var floatVar2 = 10.0F;
        var doubleVar2 = 10.15D;

    }
}
