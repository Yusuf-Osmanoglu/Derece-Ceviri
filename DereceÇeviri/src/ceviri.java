import java.util.Scanner;

public class ceviri {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Sıcaklık değerini Celsius cinsinden giriniz: ");
        double celsius = scanner.nextDouble();
        
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.8 + 32;
        double reamur = celsius * 0.8;
        
        System.out.println(celsius + " Celsius = " + kelvin + " Kelvin");
        System.out.println(celsius + " Celsius = " + fahrenheit + " Fahrenheit");
        System.out.println(celsius + " Celsius = " + reamur + " Reamur");
        
        scanner.close();
    }

}