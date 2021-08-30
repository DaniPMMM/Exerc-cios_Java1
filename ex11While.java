import static java.lang.System.out;
import java.util.Scanner;

public class ex11While {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int cont = 1;
        int par = 0;
        int impar = 0;

        while (cont <= 3) {

            out.println("Digite um número inteiro: ");
            int num = teclado.nextInt();
            cont = cont + 1;

            if (num % 2 == 0) {
                par = par + 1;
            } else {
                impar = impar + 1;
            }

        }

        out.println("Número de pares: "+par);
        out.println("Número de ímpares: "+impar);
    }
    
}
