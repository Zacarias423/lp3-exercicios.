import java.util.Scanner;

public class CalculoMaior {
    public static void main(String[] args) {
        int numero1,numero2,numero3, maior;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        numero1 = entrada.nextInt();
        System.out.println("Digite o segundo número:");
        numero2 = entrada.nextInt();
        System.out.println("Digite o terceiro número:");
        numero3 = entrada.nextInt();
        maior = Math.max(numero1,Math.max(numero2,numero3));
        System.out.println("O maior número digitado foi: "+maior);

    }
}
