import java.util.function.LongBinaryOperator;

public class Primitivos {

    public static void main(String[] args){
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("el tipo Byte corresponde en byte a " + Byte.BYTES);
        System.out.println("el tipo Byte corresponde en bites a " + Byte.SIZE);
        System.out.println("el tipo Byte tiene como valor minimo " + Byte.MIN_VALUE);
        System.out.println("el tipo Byte tiene como valot maximo " + Byte.MAX_VALUE);

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("el tipo Short corresponde en byte a " + Short.BYTES);
        System.out.println("el tipo Short corresponde en bites a " + Short.SIZE);
        System.out.println("el tipo Short tiene como valor minimo " + Short.MIN_VALUE);
        System.out.println("el tipo Short tiene como valot maximo " + Short.MAX_VALUE);

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("el tipo Int corresponde en byte a " + Integer.BYTES);
        System.out.println("el tipo Int corresponde en bites a " + Integer.SIZE);
        System.out.println("el tipo Int tiene como valor minimo " + Integer.MIN_VALUE);
        System.out.println("el tipo Int tiene como valot maximo " + Integer.MAX_VALUE);

        long numeroLong = 2147483647L;
        System.out.println("numeroByte = " + numeroLong);
        System.out.println("el tipo Long corresponde en byte a " + Long.BYTES);
        System.out.println("el tipo Long corresponde en bites a " + Long.SIZE);
        System.out.println("el tipo Long tiene como valor minimo " + Long.MIN_VALUE);
        System.out.println("el tipo Long tiene como valot maximo " + Long.MAX_VALUE);
    }
}
