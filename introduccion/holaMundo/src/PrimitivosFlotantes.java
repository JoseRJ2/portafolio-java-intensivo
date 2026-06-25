import java.sql.SQLOutput;

public class PrimitivosFlotantes {

    public static void main(String[] args) {
        float realFloat = 0.00000000015f;
        double realFloat2 = 1.5e4;

        System.out.println("numero decimal:" + realFloat);
        System.out.println("Float corresponde en bytes a: " + Float.BYTES);
        System.out.println("Float corresponde en bites a: " + Float.SIZE);
        System.out.println("El valor minimo para el tipo float es: " + Float.MIN_VALUE);
        System.out.println("El valor maximo para el tipo float es: " + Float.MAX_VALUE);

        System.out.println("numero decimal 2:" + realFloat2);
        System.out.println("Double corresponde en bytes a: " + Double.BYTES);
        System.out.println("Double corresponde en bites a: " + Double.SIZE);
        System.out.println("El valor minimo para el tipo double es: " + Double.MIN_VALUE);
        System.out.println("El valor maximo para el tipo double es: " + Double.MAX_VALUE);

        var numero = 12;
        System.out.println("El tamaño que toma por defecto el tipo var cuando le asignamos un numero es el de un int " + numero);
    }
}
