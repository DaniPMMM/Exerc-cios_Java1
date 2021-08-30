import static java.lang.System.out;
public class ex09While {

    public static void main(String[] args) {
        
        int numero = 500;
        int soma = 0;
        while (numero >=  0) {
            out.println(numero);
            soma = soma + numero;
            numero = numero - 50;
        }
        out.println(soma);
    }
    
}
