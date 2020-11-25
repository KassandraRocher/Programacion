import java.util.Scanner;

public class Ejercicio3B_KR {
    public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Introduce el primer número: " );
    int x = scanner.nextInt();
    System.out.print("Introduce el segundo número: " );
    int y = scanner.nextInt();

    System.out.print( "Su suma es: " );
    System.out.println( x+y );

    System.out.print( "Su resta es: " );
    System.out.println( x-y );

    System.out.print( "Su multiplicación es: " );
    System.out.println( x*y );

    System.out.print( "Su división es: " );
    System.out.println( x/y );

    scanner.close();
    }
}
