import java.util.Random;
import java.util.Scanner;

public class aleatorio{
    public static void main(String[] Args){
        Scanner teclado= new Scanner(System.in);
        Random gerarnumero = new Random();
        int numero = 999, n_random = 999, tentativas=0;

        n_random = gerarnumero.nextInt(0,10);
        
        System.out.print("Digite um numero entre 0 e 9: ");
        
        while(numero != n_random){
            tentativas++;

            while(!teclado.hasNextInt()){
                System.out.print("Use apenas inteiros: ");
                teclado.next();
            }

            numero = teclado.nextInt();

            if (numero > n_random){
                System.out.print("Palpite menor: ");
            }
            
            else if(numero < n_random){
                System.out.print("Palpite maior:  ");
            }
        }
        System.out.printf("Acertou em %d tentativas", tentativas);
        
        teclado.close();
    }
}
