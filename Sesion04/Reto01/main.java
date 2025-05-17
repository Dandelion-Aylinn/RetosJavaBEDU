public class main{
    public static void main(String[]args){

        //Crear dos facturas
        Factura fac1 = new Factura("f0001","Andy F",1450);
        Factura fac2 = new Factura("f0001","Ale F",1451);

        //toString
        System.out.println("Facturas");
        System.out.println(fac1);
        System.out.println(fac2);

        //equals
        System.out.println("¿Son iguales?");
        System.out.println(fac1.equals(fac2));
    }
}