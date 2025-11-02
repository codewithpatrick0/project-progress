package Variables;

public class Primitivos {
    public static void main(String[] Args){
        //Enteros
        byte edad = 15; //-128 a 127
        short año = 2025; //-32,768 a 32,767
        int poblacion = 100000; //-2mil millones a 2mil millones
        long distancia = 9999999999L; // Número muy grande

        //Decimales
        float myfloat = 12.897654321f; //IMPRECISO
        double mydouble = 12.897654321; //MAS PRECISO

        //Otros
        char letra = 'A';
        boolean esEstudiante = true; //true or false

        System.out.println("Edad: " + edad);
        System.out.println("Año: " + año);
        System.out.println("Población: " + poblacion);
        System.out.println("Distancia: " + distancia);
        System.out.println("MyFloat: " + myfloat);
        System.out.println("MyDouble: " + mydouble);
        System.out.println("Letra: " + letra);
        System.out.println("Es estudiante: " + esEstudiante);
    }
}
