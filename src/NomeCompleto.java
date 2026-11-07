import java.util.Scanner;
public class NomeCompleto {
    public static void main(String[] args) {
        String nomeCompleto;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome completo: ");
        nomeCompleto = teclado.nextLine();
        System.out.println("Nome em maiúsculo: "+nomeCompleto.toUpperCase());
        System.out.println("Nome em minúsculo: "+nomeCompleto.toLowerCase());
        System.out.println("O número de caracteres é: "+nomeCompleto.length());
        System.out.println("A primeira letra é: "+nomeCompleto.charAt(0));



    }
}
