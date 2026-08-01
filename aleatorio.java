import java.util.Random;
import java.util.Scanner;

public class aleatorio{
    public static void main(String[] Args){
        Scanner teclado= new Scanner(System.in);
        Random gerarnumero = new Random();
        int numero = 999, n_random = 999;

        n_random = gerarnumero.nextInt(0,10);
        
        System.out.print("Digite um numero entre 0 e 9: ");
        
        while(numero != n_random){

            while(!teclado.hasNextInt()){
                System.out.println("Use apenas inteiros");
                teclado.next();
                System.out.print("Tente outro numero: ");
            }

            numero = teclado.nextInt();

            if (numero != n_random){
                System.out.print("Tente outro numero: ");
            }
        }

        System.out.println("Parabéns, você acertou!!!");
        
        teclado.close();
    }
}