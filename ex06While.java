import static java.lang.System.out;
public class ex06While {
    public static void main(String[] args) {
        
        int numero = 30;
        while (numero > 1) {
            numero = numero - 1;
            if (numero % 4 == 0){
                out.println(numero);
            }
        }
        out.println("Acabou!");
        
    }
}
