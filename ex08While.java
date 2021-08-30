import static java.lang.System.out;
public class ex08While {
    public static void main(String[] args) {
        
        int numero = 4;
        int soma = 0;
        

        while (numero <= 100) {
            out.println (numero);
            soma = soma + numero;
            numero = numero + 2;
        }
        out.println ("O resultado da soma de todos os números é: "+ soma);
    }

    
}
