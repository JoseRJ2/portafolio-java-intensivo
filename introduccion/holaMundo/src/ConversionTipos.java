public class ConversionTipos {
    public static void main(String[] args) {

        //STRING A PRIMITIVOS
        String numeroStr = "100";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "98283923.23e-6";
        double numeroDouble = Double.parseDouble(realStr);
        System.out.println("numeroDouble = " + numeroDouble);

        String booleanStr = "true";
        boolean valorBoolean = Boolean.parseBoolean(booleanStr);
        System.out.println("valorBoolean = " + valorBoolean + "\n");

        //PRIMITIVOS A STRING

        int otroNumeroInt = 200;
        //a traves de la clase del entero
        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr por la clase integer = " + otroNumeroStr);
        //a traves de la clase String
        otroNumeroStr = String.valueOf(otroNumeroInt);
        System.out.println("otroNumeroStr por la clase String = " + otroNumeroStr);

        float otroNumeroReal = 98.2893e2f;
        //a traves de la clase float
        otroNumeroStr = Float.toString(otroNumeroReal);
        System.out.println("otroNumeroStr por la clase float = " + otroNumeroStr);
        //a traves de la clase String
        otroNumeroStr = String.valueOf(otroNumeroReal);
        System.out.println("otroNumeroStr por la clase string = " + otroNumeroStr);

        double otroNumeroDouble = 98382939293939.2e-12;
        //a traves de la clase double
        otroNumeroStr = Double.toString(otroNumeroDouble);
        System.out.println("otroNumeroStr por la clase double = " + otroNumeroStr);
        //a traves de la clase String
        otroNumeroStr = String.valueOf(otroNumeroDouble);
        System.out.println("otroNumeroStr por la clase String = " + otroNumeroStr + "\n");

        //PRIMITIVOS A PRIMITIVOS
        int a = 10000;
        short numeroShort = (short) a;
        System.out.println("numeroShort = " + numeroShort);
        double numeroDou = (double) a;
        System.out.println("numeroDouble = " + numeroDou);
        char caracter = (char) a;
        System.out.println("caracter = " + caracter);
        long numeroLong = (long) a;
        System.out.println("numeroLong = " + numeroLong);
    }
}
