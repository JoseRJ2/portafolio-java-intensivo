import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroDecimal = 0;
        try{
            System.out.println("Ingresa un numero entero:");
            numeroDecimal = scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Error, el numero debe de ser entero");
            main(args);
            System.exit(0);
        }
        System.out.println("numeroDecimal = " + numeroDecimal);

        String mensaje1 = "El numero binario de " + numeroDecimal + " es = " + Integer.toBinaryString(numeroDecimal);
        System.out.println("El numero representado en binario como " + Integer.toBinaryString(numeroDecimal) + " es: " + numeroDecimal);

        String mensaje2 = "El numero octal de " + numeroDecimal + " es = " + Integer.toOctalString(numeroDecimal);
        System.out.println("El numero representado en octal como "+ Integer.toOctalString(numeroDecimal) + " es: " + numeroDecimal);

        String mensaje3 = "El numero hexadecimal de " + numeroDecimal + " es = " + Integer.toHexString(numeroDecimal);
        System.out.println("El numero representado en hexadecimal como "+ Integer.toHexString(numeroDecimal) + " es: " + numeroDecimal);

        String mensajeFinal = mensaje1;
        mensajeFinal += mensaje2 += "\n";
        mensajeFinal += mensaje3;
        System.out.println(mensajeFinal);
   }
}
