package TiposPrimitivos;

public class ClaseCharacters {
    public static void main(String[] args) {
        //char
        System.out.println("bits tipo char: " + Character.SIZE);
        System.out.println("bytes tipo char: " + Character.BYTES);
        System.out.println("Valor minimo char: " + Character.MIN_VALUE);
        System.out.println("Valor maximo char: " + Character.MAX_VALUE);
        System.out.println();

//        char c = '@';
//        c = '\u0021';
//        c = 9749; //'\u2615'
        var c = '\u2665';
        System.out.println("c = " + c);
    }
}
