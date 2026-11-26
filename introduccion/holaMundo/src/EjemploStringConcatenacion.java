public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String cadena = "Programacion Java";
        String cadena2 = new String("Alumno Jose Guadalupe");

        String concatenacion = cadena + " y el " + cadena2;
        System.out.println("concatenacion = " + concatenacion);

        int numero1 = 12;
        int numero2 = 12;

        //precedencia de operadores
        System.out.println(concatenacion + " " +  (numero1 + numero2) + "\n");

        System.out.println(numero1 + numero2 + " " + concatenacion);

        //otra forma de concatenar
        System.out.println(cadena.concat(" y el ").concat(cadena2));
    }
}
