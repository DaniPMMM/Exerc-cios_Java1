import static java.lang.System.out;
import java.util.Scanner;
public class ex10While {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        int cont = 1;
        int soma = 0;
        
        
        while (cont <= 7) {
            out.println ("Digite um número inteiro: ");
            int num = tc.nextInt();
            cont = cont + 1;
            soma = soma + num;
        }
        out.println("A soma de todos os números é igual a: "+soma);

        
    }
    
}
