package Fundaments.Variables;

public class ConversionTipos {
    public static void main(String[] args){
        //conversion
        int n = 100;
        double decimal = n; //int a double
        System.out.println("Entero a decimal: " + decimal);

        double price = 15.75;
        int pricewhole = (int) price; // double a decimal (pierde decimales)
        System.out.println("Decimal a entero: " + price + " a " + pricewhole);

        //string a int
        String text = "123";
        int num_text = Integer.parseInt(text);
        System.out.println("Número desde texto es: " + num_text);
    }
}
