import java.util.Scanner;
public class MediaDeNotas {
    public static void main(String[] args) {
        double Nota1, Nota2, mediaDenotas;
        boolean resultadoMedia;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nos informe duas notas, mas têm de estar no intervalo  de 0 a 20");
        System.out.println("");
        System.out.println("Informe a primeira nota:");
        Nota1 = teclado.nextDouble();
        System.out.println("Informe a segunda nota:");
        Nota2 = teclado.nextDouble();
        mediaDenotas = (Nota1 + Nota2) / 2;
        System.out.println("Media das notas é: " + mediaDenotas);
        resultadoMedia = mediaDenotas >= 10;
        System.out.println(resultadoMedia);
    }
}
