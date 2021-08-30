import static java.lang.System.out;

public class ex02While {

    public static void main(String args[]) {
        int numero = 11;

        while (numero > 3) {
            numero = numero - 1;
            out.println (numero);
        }

        out.println ("Acabou!");
    }

}
