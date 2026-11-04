import java.util.Scanner;
public class ConversaoDeSegundosParaHoraMinutosSgundos {
    public static void main(String[] args) {
        int segundos,horas,minutos,segundos1;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digete o total de segundos:");
        segundos = entrada.nextInt();
        //Conversão para horas
        horas = segundos / 3600;
        //Conversão para minutos
        minutos = (segundos % 3600) / 60;
        //Conversão para segundos
        segundos1 = ((segundos % 3600) % 60);
        //A informação pedida
        System.out.println(horas+"h "+minutos+" min " +segundos1+" s");


    }

}
