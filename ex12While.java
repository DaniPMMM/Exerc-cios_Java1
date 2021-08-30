import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;
public class ex12While {
    
    public static void main(String[] args) {
        
        Random random = new Random();

        int cont = 1;
        int contMaiorque5 = 0;
        int div3 = 0;

        while (cont <= 10) {
            int num = random.nextInt(10);
            out.println(num);
            
            if (num > 5) {

                contMaiorque5 = contMaiorque5 + 1;
                
            }

            if (num % 3 == 0) {

                div3 = div3 + 1;
            }
            cont = cont + 1;

        }

        out.println("Números maiores que 5: "+contMaiorque5);
        out.println("Números divisíveis por 3: "+div3);
    }
    
}
