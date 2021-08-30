import static java.lang.System.out;
import java.util.Scanner;
public class ex05While {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        out.print("Digite um número: ");
        int num = sc.nextInt();

        int num2 = 0;

        while (num2 < num) {
            num2 = num2 +1;
            out.println(num2);
        }
        out.println("Acabou!");
        
        
    }
    
}
