import java.util.Scanner;
public class SomaDeAlgarismo {
    public static void main(String[] args) {
        int numero, primeiroAlgarismo, segundoAlgarismo, terceiroAlgarismo, somaAlgarismo;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número com três algarismos: ");
        numero = input.nextInt();
        //Buscando primeiro algarismo
        primeiroAlgarismo = numero /100;
        //Determinando o segundo algarismo
        segundoAlgarismo = (numero % 100) / 10;
        //Determinando o terceiro algarismo
        terceiroAlgarismo = (numero % 100) % 10;
        //Calcular e mostrar a soma dos algarismos
        somaAlgarismo = primeiroAlgarismo + segundoAlgarismo + terceiroAlgarismo;
        System.out.printf("A soma dos algarismos %d, %d e %d é: %d  ",primeiroAlgarismo,segundoAlgarismo,terceiroAlgarismo, somaAlgarismo);
    }
}
