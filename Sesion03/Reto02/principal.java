public class principal{
    public static void main(String[] args) {
        
        //RFC
        factura conRFC = new factura(2500.0,"Servicio de consultoria","ABCC010101XYZ");
        System.out.println("Factura mostrando RFC");
        System.out.println(conRFC.getResumen());

        //Sin RFC
        factura sinRFC = new factura(1800.0, "Reparación de equipo", null);
        System.out.println("Factura sin RFC");
        System.out.println(sinRFC.getResumen());
    }
}