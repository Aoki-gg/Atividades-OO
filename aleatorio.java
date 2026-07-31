import java.util.Scanner;
import java.util.Random;

public class aleatorio{
    public static void main(String[] Args){
        Scanner teclado= new Scanner(System.in);
        Random gerarnumero = new Random();
        int numero=0, n_random=9;
        
        while(numero!=n_random){
            n_random=gerarnumero.nextInt(0,10);
            
            System.out.print("Digite um numero: ");
            
            numero = teclado.nextInt();

            System.out.printf("O numero do computador foi %d e o seu foi %d \n", n_random, numero);
            
            if (numero==n_random){
                System.out.println("Parabéns, você acertou o numero");
            }
        }
        teclado.close();
    }
}