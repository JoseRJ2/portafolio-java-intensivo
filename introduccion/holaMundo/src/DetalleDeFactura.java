import java.util.InputMismatchException;
import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa nombre de la factura:");
        String factura = scanner.nextLine();

        System.out.println("Ingresa el precio del producto 1:");
        double precio1 = 0;
        try{
            precio1 = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Ingresa un monto valido");
            main(args);
        }


        System.out.println("Ingresa el precio del producto 2:");
        double precio2 = 0;
        try{
            precio2 = scanner.nextDouble();
        }catch (InputMismatchException e){
            System.out.println("Ingresa un monto valido");
            main(args);
        }

        double suma = precio1 + precio2;
        System.out.println("La factura producto de oficina tiene un total bruto de " + suma +
        ", con un impuesto de " + (suma * 0.19) + " y el monto despues del impuesto: "+ (suma + suma * 0.19));
    }
}
