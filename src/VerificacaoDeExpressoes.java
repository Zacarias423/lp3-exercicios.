
public class VerificacaoDeExpressoes {
    public static void main(String[] args) {
        /*Sem executar, preveja o resultado das expressões e depois confirme
        no IDE: 7 / 2, 7 / 2.0, 7 % 3, -7 % 3, (int) 3.99, (char) (65 + 2), 1 + 2 + "3", "1"
        + 2 + 3. Explique cada resultado.
        7 / 2: O resultado será 3, pois é uma divisão inteira de dois inteiros.
        7 /2.0:O resultado será 3,5, pois estamos diante de um operando decimal, resulta em um decimal.
        7 % 3: O resultado será 1, pois estamos a determinar o resto da divisão de 7 por 3.
        -7 % 3: O resultado será -1, semelhante ao caso acima, mas com um operando negativo.
        (int) 3.99:O resultado será 3, pois estamos a fazer a conversão ou casting de um tipo duble para um inteiro.
        (char) (65 + 2): O resultado será C, pois primeiro será feito 65+2=67, e 67 de acordo a tabela ASCII corresponde a C
        1 + 2 + "3": O resultado será 3 3, pois irá fazer a soma 1+2=3, mas o 3, será lido como um texto normal.
        "1" +2 + 3: O resultado será 123, pois irá fazer a concatenação dos caracteres.
         */
        System.out.println( 7 / 2);
        System.out.println(7 / 2.0);
        System.out.println(7 % 3);
        System.out.println(-7 % 3);
        System.out.println((int) 3.99);
        System.out.println((char) (65 + 2));
        System.out.println(1 + 2 + "3");
        System.out.println("1" + 2 + 3 );

    }

}
