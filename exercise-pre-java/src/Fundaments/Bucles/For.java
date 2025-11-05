package Fundaments.Bucles;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = 12;
        System.out.print("Ingresa la cantidad de tickets que quieres");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingresa la letra de butaca");
        String letra = sc.nextLine();
        //proceso
        int pago = price*n;
        for(int i = 1; i<=n;i++){
            System.out.println("Tus butacas son: " + letra+i);

        }
        System.out.println("El total a pagar es: S/" + pago);
    }
}
