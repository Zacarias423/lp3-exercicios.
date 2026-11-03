
import java.util.Scanner;
public class PerimetroAreaCircunferencia {
    public static void main(String[] args) {

        double raio, perimetro, area;
        // Leitura do valor do raio da Circunferência
        Scanner teclado =  new Scanner(System.in);
        System.out.println("Digite o raio da circunferência e cm: ");
        raio = teclado.nextDouble();
        // Cálculo do perimetro
        perimetro = 2 * raio * Math.PI;
        System.out.printf("O perimetro da circunferência é de %.2fcm.%n",perimetro);
        //Cálculo da área da circunferência
        area = Math.pow(raio, 2) * Math.PI;
        System.out.printf("A área da circunferência é de %.2fcm².%n",area);

    }

}