import java.util.Scanner;

public class Ejercicio2_KR {
    public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);
    int A, B, C;
    System.out.print("Introduce el valor de A: ");
    A = scanner.nextInt();
    System.out.print("Introduce el valor de B: ");
    B = scanner.nextInt();
    System.out.println("Valores: A= " + A + " B= " + B);
    C = A;
    A = B;
    B = C;
    System.out.println("Valores intercambiados: A= " + A + " B=" + B);

    scanner.close();
    }
}
