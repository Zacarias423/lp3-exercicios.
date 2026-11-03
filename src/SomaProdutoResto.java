public class SomaProdutoResto {
    public static void main(String[] args) {
        int numero1 = 17;
        int numero2 = 5;
        int soma = numero1 + numero2;
        int diferenca = numero1 - numero2;
        int produto = numero1 * numero2;
        // Quociente inteiro
        int quocienteInteiro = numero1 / numero2;
        // Quociente decimal
        double quocienteDecimal =  (double) numero1 / numero2;
        int resto = numero1 % numero2;
        System.out.println("");

        System.out.println("A soma entre os números 17 e 5 é "+soma+" e a difença entre eles é "+diferenca);

        System.out.println("O pruduto entre os valores 17 e 5 é "+produto+" e o resto da divisão resulta em "+resto);

        System.out.println("O quociente inteiro é "+quocienteInteiro+" e o quociente decimal é "+quocienteDecimal);
    }
}