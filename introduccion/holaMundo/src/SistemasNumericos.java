import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog(null, "Ingresa un numero entero");
        int numeroDecimal = 0;
        try{
            numeroDecimal = Integer.parseInt(numeroStr);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error, el numero debe de ser entero");
            main(args);
            System.exit(0);
        }
        System.out.println("numeroDecimal = " + numeroDecimal);

        String mensaje1 = "El numero binario de " + numeroDecimal + " es = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(mensaje1);
        System.out.println("El numero representado en binario como " + Integer.toBinaryString(numeroDecimal) + " es: " + numeroDecimal);

        String mensaje2 = "El numero octal de " + numeroDecimal + " es = " + Integer.toOctalString(numeroDecimal);
        System.out.println(mensaje2);
        System.out.println("El numero representado en octal como "+ Integer.toOctalString(numeroDecimal) + " es: " + numeroDecimal);

        String mensaje3 = "El numero hexadecimal de " + numeroDecimal + " es = " + Integer.toHexString(numeroDecimal);
        System.out.println(mensaje3);
        System.out.println("El numero representado en hexadecimal como "+ Integer.toHexString(numeroDecimal) + " es: " + numeroDecimal);

        String mensajeFinal = mensaje1 + "\n" + mensaje2 + "\n" + mensaje3;
        JOptionPane.showMessageDialog(null,mensajeFinal);
   }
}
