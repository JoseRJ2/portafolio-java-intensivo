public class EjemploStringInmutable {
    public static void main(String[] args) {
        String cadena = "Programacion Java";
        String cadena2 = new String(" Alumno Jose Guadalupe");

        String resultado = cadena.concat(cadena2);
        System.out.println("resultado = " + resultado);
        System.out.println(cadena == resultado);

        String resultado2 = cadena.transform(c -> {
            return cadena.concat(cadena2);
        });
        System.out.println("resultado2 = " + resultado2);

        String resultado3 = resultado.replace("a", "A");
        System.out.println("resultado3 = " + resultado3);

        String resultado4 = resultado.transform(c ->{
           return resultado.toUpperCase();
        });
        System.out.println("resultado4 = " + resultado4);
    }
}
