public class PrimitivosBoolean {
    public static void main(String[] args) {
        boolean datoLogico = false;
        System.out.println("datoLogico = " + datoLogico);
        
        double numero1 = 98342332.33e-6; //  98.34233233
        System.out.println("numero1 = " + numero1);
        
        float numero2 = 39239.4e-3f; // 39.2394
        System.out.println("numero2 = " + numero2);
        
        datoLogico = numero1 < numero2;
        System.out.println("datoLogico = " + datoLogico);
        
        boolean datoLogico2 = (3-2 == 1);
        System.out.println("datoLogico2 = " + datoLogico2);
    }
}
