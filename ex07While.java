import static java.lang.System.out;
import java.util.Scanner;
public class ex07While {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        out.print("Digite o valor inicial: ");
        int inicial = tec.nextInt();
        out.print("Digite o valor final: ");
        int fim = tec.nextInt();
        out.print("Digite o incremento: ");
        int inc = tec.nextInt();
        while (fim < inicial || inicial > fim) {
            out.println("Inválido, digite novamente, inicial deve ser menor que final");
            out.println("Valor inicial: ");
            inicial = tec.nextInt();
            out.println("Valor final: ");
            fim = tec.nextInt();
        }

        while (inicial < fim ) {
            out.println(inicial);
            inicial = inicial + inc;
        }

        out.println("Acabou!");


        
    }
    
}
