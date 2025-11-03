package Fundaments.Sintaxis;

import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu edad");
        int edad = sc.nextInt();

        sc.nextLine();

        System.out.print("Ingresa tu nombre");
        String name = sc.nextLine();
        System.out.print("Ingresa tu estatura");
        double est = sc.nextDouble();

        System.out.println("Edad: " + edad);
        System.out.println("Nombre: " + name);
        System.out.println("Estatura: " + est);

    }
}
