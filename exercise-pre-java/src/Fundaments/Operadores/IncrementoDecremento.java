package Fundaments.Operadores;

public class IncrementoDecremento {
    public static void main(String[] args) {

        int cont = 7;
        System.out.println("Contador inicial: " + cont);

        cont++; // cont = cont + 1
        System.out.println(cont);

        cont--; //cont = cont - 1
        System.out.println(cont);

        //preincremento y post incremento

        int x= 17;
        int y = ++x; //preincremento(primero incrementa, luego asigna)
        System.out.println("Preincremento: " + y ); //y valdrá 18

        y = x++; //postincremento(primero asigna, luego incrementa)
        System.out.println("Preincremento: " + y ); //seguira valiendo 18
        System.out.println(x); //y x valdrá 19

        //Para PRE Y POST decremento es tecnicamente lo mismo

        int a = 5;
        int b = a--;
        System.out.println("PreDecremento: " + b); //primero esta asignando, por lo tanto b=5

        b=--a;
        System.out.println("PostDecremento: " +  b); //aca b=3 porque con el anterior b ya disminuto a 4

        //operaciones combinadas

        int c = 17;
        int d = c++; //d=17, c=18

        d=c--; // d=18 c=17
        d=--c; //d=16 c=16
        d=++c; //d=17, c=17
        d=c++;//d=17, c=18

        System.out.println("Valor final de d: " +  d); //valor final d=17
        System.out.println("Valor final de c: " + c); //valor final c=18
    }
}
