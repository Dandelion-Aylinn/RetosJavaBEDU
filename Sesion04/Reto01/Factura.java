/*
 Registro y comparación de facturas

 Objetivo:
 Modelar facturas emitidas para un sistema contable, reforzando el uso de constructores, 
 equals(), hashCode() y toString().

 Instrucciones: 
 1. Crea una clase llamada Factura.
 2. Declara los siguientes atributos:
    - String folio
    - String cliente
    - double total
 3. Implementa lo siguiente:
    - Un constructor con parámetros para inicializar todos los atributos.
    - El método toString() para mostrar la información de la factura con este formato:
        Factura [folio=..., cliente=..., total=$...]
    - El método equals() para que dos facturas se consideren iguales si tienen el mismo folio.
    - El método hashCode() basado en el atributo folio.
 4. En la clase Main:
    - Crea dos facturas con el mismo folio pero diferentes clientes o totales.
    - Muestra ambas con toString(). 
    - Compara si son iguales con equals().
 */

public class Factura{
    //Atributos
    String folio;
    String cliente;
    double total;
    //Constructor con parámetros 
    public Factura (String folio, String cliente, double total){
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }
    //toString
    @Override
    public String toString(){
        return "Factura [Folio: " + folio + ", Cliente: " + cliente + ", Total: $" + total + "]";
    }
    //equals()
    @Override
    public boolean equals(Object obj){
        if(this == obj)return true;
        if(obj == null || getClass() != obj.getClass())return false;

        Factura factura1 = (Factura)obj;
        return folio != null && folio.equals(factura1.folio);
    }

    //hashCode
    @Override
    public int hashCode(){
        return folio != null ? folio.hashCode() : 0;
    }


}