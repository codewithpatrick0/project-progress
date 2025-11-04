package Fundaments.Condicionales;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu edad");
        int edad = sc.nextInt();
        String result = (edad>=18) ? "Mayor de edad":"Menor de edad";
        System.out.println("Tu eres " + result);

        //otro caso
        System.out.print("Ingresa tu nota final");
        double nota = sc.nextDouble();

        String resultado = (nota>=16.5) ? "Excelente" :
                (nota>13) ? "Aprobado":"Desaprobado";
        System.out.println(resultado);

    }
}
