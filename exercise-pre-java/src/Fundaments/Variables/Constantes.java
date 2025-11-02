package Fundaments.Variables;

public class Constantes {
    public static void main(String[] args) {
        //retribucion FINAL

        final double PI = 3.1416;
        final int d_semana = 7;
        final double R = 15.2;

        //ASI SE ESTABLECEN CONSTANTES

        double areacircle = PI * (Math.pow(R, 2));

        //salida

        System.out.println("Area del circulo: " + areacircle);
        System.out.println("Dias de semana: " + d_semana);

    }
}