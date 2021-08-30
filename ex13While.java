import java.util.Scanner;
import static java.lang.System.out;
public class ex13While {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int cont = 0;
        int soma = 0;
        int mdezoito = 0;
        int mcinco = 0;
        int maior = 0;

        while (cont < 10) {
            out.println("Digite a idade: ");
            int idade = teclado.nextInt();
            soma = soma + idade;
            if (idade > 18) {
                mdezoito = mdezoito + 1;
            }
            if (idade < 5) {
                mcinco = mcinco + 1;
            }
            if (idade > maior) {
                maior = idade;
            }
            cont = cont + 1;



        }
        out.println ("A média das idades é: " + (soma/10));
        out.println ("Total maior que 18: "+mdezoito);
        out.println("Total menor que 5: "+mcinco);
        out.println("Maior idade: "+maior);
        
    }
}
