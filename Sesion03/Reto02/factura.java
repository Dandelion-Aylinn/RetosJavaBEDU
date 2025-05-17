
import java.util.Optional;

/*
 Factura con RFC opcional

 Objetivo:
Diseñar una clase Factura aplicando los principios de encapsulación con modificadores de acceso 
y utilizando la clase Optional para manejar valores que pueden ser nulos, como el RFC del cliente.

Instrucciones
  1. Crear la clase factura
    Atributos
        - double monto: cantidad total de la factura 
        - String descripcion: breve concepto de lo facturado
        - Optional<String> rfc: RFC del cliente (puede estar presente o no)
    Métodos publicos 
        - Factura(double monto, String descripcion, String rfc)
            - Si el RFC es null, debe almacenarse usando Optional.empty()
        - String getResumen() → Devuelve una cadena con los datos de la factura
            - Si el RFC está presente, se muestra
            - Si no, se muestra "RFC: [No proporcionado]"
  2. En la clase principal
    Actividades 
        - Crear al menos 2 facturas:
            - Una con RFC
            - Otra sin RFC (null)
        - Imprimir el resumen de ambas facturas usando el método getResumen()
 */ 

public class factura{

    //Atributos
    private double monto;
    private String descripcion;
    private Optional<String> rfc;

    //Constructor
    public factura(double monto, String descripcion,String rfc){
        this.monto = monto;
        this.descripcion = descripcion;
        //Se puede generar empty
        this.rfc = Optional.ofNullable(rfc);
    }
    
    public String getResumen(){
        String resumen = "Factura: ";
        resumen += "Mostrar descripción" + descripcion;
        resumen += "Monto total: " + monto;

        resumen +="Mostrar RFC:" + rfc.orElse("[No fue proporcionado]");
        return resumen;
    }

}