import java.util.Scanner;

public class Ejercicio6_KR {
    public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);
    double nota1, nota2, notatrimestre;

        System.out.print("Introduce la nota del primer examen: " );
        nota1 = scanner.nextDouble();

        System.out.print("¿Qué nota quieres sacar en el trimestre? " );
        notatrimestre = scanner.nextInt();

        nota2 = ((notatrimestre * 100) - (nota1 * 40)) / 60;
    
        if (notatrimestre>10 || notatrimestre<0){
            System.out.println ("No es posible sacar esta nota. ");
        }else{
        
        System.out.print ("Para tener un " + notatrimestre + " en el trimestre necesitas sacar un " + nota2 + " en el segundo examen.");
        }

        scanner.close();
    }
}
