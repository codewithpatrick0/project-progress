package Fundaments.Bucles;
import java.util.Scanner;
import java.util.Random;

public class While {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random aleat = new Random();
    System.out.println("Se generará un numero aleatorio, adivinalo!");
        System.out.print("Adivina el numero del 1 al 10");
    int n = aleat.nextInt(10)+1;
    int ningresado = 0 ;
    int intentos = 0;

        while (ningresado != n) {

             ningresado = sc.nextInt();
            intentos++;
            if (ningresado==n){
                System.out.println("Correcto!, lo lograste en " + intentos + " intentos");
            } else {
                System.out.println("Vuelve a intentarlo");
            }
        }
    }
}

