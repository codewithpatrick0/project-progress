package Fundaments.Operadores;

public class OperadoresLogicos {
    public static void main(String[] args){
        boolean tieneEdad = true;
        boolean tieneLicencia = false;

        System.out.println("¿Puede conducir?: " + (tieneEdad && tieneLicencia)); //(AND) && - Ambos son true
        System.out.println("¿Puede entrar al cine?: " + (tieneEdad || tieneLicencia)); //(OR) || - Cualquiera de los 2 true
        System.out.println("No tiene licencia: " + (!tieneLicencia)); // (NOT) ! - Invierte el boolean respuesta

        int edad = 20;
        boolean tuvoSex = false;
        System.out.println("¿Ya es un hombre?: " + (edad>18 && tuvoSex));
        System.out.println("¿Es una wawa?" + (edad<18 || !tuvoSex));

    }
}
