package Fundaments.Condicionales;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu nota final");
        double nota = sc.nextDouble();

        if (nota>=17) {
            System.out.println("Excelente, aprobaste!");
        } else if (nota>12.5) {
            System.out.println("Pudiste haberlo hecho mejor, aprobaste.");
        } else {
            System.out.println("Desaprobaste, nos vemos el otro ciclo.");
        }

        sc.close();

    }
}
