import java.util.Scanner;
public class CalculoPreco {
    public static void main(String[] args) {
        double precoIVA,valorIVA,precoNormal;
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o preço, com IVA incluído de 23%:");
        precoIVA = ler.nextDouble();
        precoNormal = precoIVA/1.23;
        valorIVA = precoIVA - precoNormal;
        System.out.printf("O preço com IVA é %.2f, o preço sem IVA é %.2f e o valor do imposto é %.2f %n",precoIVA,precoNormal,valorIVA);

    }
}
