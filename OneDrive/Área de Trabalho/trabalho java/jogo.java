import java.util.Random;
import java.util.Scanner;

public class jogo {
    public static void main(String[] args) {
        Random Aleatorio = new Random();
        int numero = Aleatorio.nextInt(101);
        Scanner lerTeclado = new Scanner(System.in);
        int tentativa = 1;
        System.out.println("tente advinhar o numero de 1 a 100!");

        while(tentativa <=10){
            System.out.println("Digite seu palpite: ");
            int palpite = lerTeclado.nextInt();
            lerTeclado.nextLine();
            if (palpite == numero) {
                System.out.println("Parabens, voce acertou!");
                break;
            }
            if(palpite > numero){
                System.out.println("errou! seu palpite e maior que o numero");
            } 
            else{
                System.out.println("errou, seu palpite e menor que o numero");
            }
            if (tentativa ==10){System.out.println("Fim de jogo! o numero era: "+numero);}
            tentativa++;
        }
    }
}