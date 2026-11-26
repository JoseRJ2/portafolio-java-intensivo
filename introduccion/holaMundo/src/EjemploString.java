public class EjemploString {
    public static void main(String[] args) {
        String cadena = "Programacion Java";
        String cadena2 = new String("Programacion Java");
        String cadena3 = "Programacion Java";
        String cadena4 = new String("programacion Java");

        boolean esIgual = cadena == cadena2;
        System.out.println("cadena == cadena2 " + esIgual);

        esIgual  = cadena.equals(cadena2);
        System.out.println("cadena.equals(cadena2) " + esIgual);

        //cuando son el mismo contenido y se crea en la literal se asigna la misma referencia
        esIgual = cadena == cadena3;
        System.out.println("cadena == cadena3 " + esIgual);

        esIgual = cadena2.equalsIgnoreCase(cadena4);
        System.out.println("cadena2.equalsIgnoreCase(cadena4) " + esIgual);
    }
}
