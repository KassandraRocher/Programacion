import java.util.Scanner;

public class Ejercicio5_KR {
    public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);
    double euros;

    System.out.print("Introduce el número de euros que quieres convertir a pesetas: " );
    euros = scanner.nextDouble();
    
    System.out.print( "El resultado en pesetas sería: ");
    System.out.println (euros*1000/6);

    scanner.close();
    }
}
