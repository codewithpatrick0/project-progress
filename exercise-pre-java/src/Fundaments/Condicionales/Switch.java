package Fundaments.Condicionales;

import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número de dia de la semana (1 a 7)");
        int dia = sc.nextInt();
        String nombreDia;

        switch (dia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
            case 3:
                nombreDia = "Miercoles";
                break;
            case 4:
                nombreDia = "Jueves";
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
            case 7:
                nombreDia = "Lunes";
                break;
            default:
                nombreDia = "Día Inválido";
        }

    }
}
