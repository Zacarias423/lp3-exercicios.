import java.util.Scanner;

public class CelsiusParaFahrenheit {
    public static void main(String[] args) {
        double celsius;
        System.out.println("");
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o temperatura em Celsius: ");
        celsius = entrada.nextDouble();
        double fahrenheit =  (celsius * 9/5 + 32);
        System.out.print("A Temperatura "+celsius+"°C equivale a "+fahrenheit+"°F");


    }
}
