import java.util.Objects;

public class main{
    public static void main(String[]args){
    //Declaracion de impuestos
    DeclaracionImpuestos declaracion = new DeclaracionImpuestos ("XAXX010101000", 8700.0);

    //Cuenta fiscal
    CuentaFiscal cuenta = new CuentaFiscal ("XAXX010101000", 9500.0);

    //Mostrar información de ambos
    System.out.println ("Declaración enviada por RFC: " + declaracion.rfcContribuyente() + 
    "Cuenta fiscal registrada con RFC: " + declaracion.montoDeclarado());

    //¿RFC coincide?
    boolean rfcTrue = cuenta.validarRFC(declaracion);
    System.out.println("¿RFC válido para esta cuenta?: " + rfcTrue);
}
}