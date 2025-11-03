package Fundaments.EntradaSalida;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número A");

        int nA = sc.nextInt();

        System.out.println("Ingresa un número B");

        int nB = sc.nextInt();

        //SALIDA

        System.out.println("Suma = " + (nA+nB));
        System.out.println("Resta = " + (nA-nB));
        System.out.println("Producto = " + (nA*nB));
        System.out.println("División = " + (nA/nB));
        System.out.println("Resto = " + (nA%nB));

        sc.close();
    }
}
