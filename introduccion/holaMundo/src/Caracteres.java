import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;

public class Caracteres {
    public static void main(String[] args) {
        char caracter = '>';
        char unicode = '\u003e';
        char decimal = 62;

        System.out.println("caracter impreso normal:" + caracter);
        System.out.println("caracter impreso con unicode:" + unicode);
        System.out.println("caracter impreso con decimal:" + decimal);

        System.out.println("¿En las 3 formas el caracter sigue siendo el mismo? " + (caracter == unicode && caracter == decimal && unicode ==decimal));

        System.out.println("un caracter contiene " + Character.BYTES + " bytes");
        System.out.println("un caracter contiene " + Character.SIZE + " bites");
        System.out.println("El valor minimo de un caracter es:" + Character.MIN_VALUE);
        System.out.println("El valor maximo de un caracter en windows es:" + Character.MAX_VALUE);
    }
}
