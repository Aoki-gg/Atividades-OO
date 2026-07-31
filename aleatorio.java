import java.util.Random;
import java.util.Scanner;

public class aleatorio{
    public static void main(String[] Args){
        Scanner teclado= new Scanner(System.in);
        Random gerarnumero = new Random();
        int numero=0, n_random=0;

        n_random=gerarnumero.nextInt(0,10);
        
        System.out.print("Digite um numero: ");

        numero=teclado.nextInt();
        
        while(numero != n_random){
            
            System.out.print("Tente outro numero: ");

            numero=teclado.nextInt();
        }

        System.out.println("Parabéns, você acertou!!!");
        
        teclado.close();
    }
}