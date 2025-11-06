package Fundaments.Bucles;
import java.util.Random;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        do{
            System.out.print("Ingresa un numero del 1 al 5");
            n = sc.nextInt();
            if (n>0 && n<=5) {
                System.out.println("Lo lograste!");
            }else {
                System.out.println("Numero invalido, ingresa nuevamente");
            }

        } while (n<0 || n>5);

        //otro ejercicio
        Random random = new Random();
        int num = 0;
        int intentos = 0;
        int numAleat = random.nextInt(10)+1;
        System.out.println("Se generó un numero, adivinalo!");
        do {
            System.out.print("Ingresa el número generado");
            num = sc.nextInt();
            if(num < numAleat) {
                System.out.println("El numero aleatorio es mayor.");
            }else if (num > numAleat) {
                System.out.println("El numero aleatorio es menor");
            }else {
                System.out.println("Correcto!");
            }
            intentos++;
        }while(num != numAleat);

        System.out.println("Tu numero de intentos fue: " + intentos);



        }



    }

