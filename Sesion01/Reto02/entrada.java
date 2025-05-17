/*
 Registro básico de entradas

 Objetivo: Desarrollar un programa en Java que permita registrar la información básica de entradas para eventos, 
 aplicando los fundamentos de clases, objetos, atributos, métodos y el uso de constructores.

 Instrucciones:
 1. Crear una clase llamada "entrada"
 2. Declara los sig. atributos:
   - Nombre del evento (String)
   - Precio de la entrada (double)
 3. Crea un constructor que reciba ambos valores al momento de crear el objeto.
 4. Agrega un método público llamado mostrarInformacion() que imprima el siguiente formato:
   - Evento: Obra de Teatro | Precio: $450.0
 5. Crea una clase llamada Principal y dentro del método main():
   - Crea al menos dos objetos de tipo Entrada
   - Llama al método mostrarInformacion() para mostrar los datos en consola
Desafio adicional:
Como reto extra, convierte la clase Entrada en un record para ver una forma más compacta 
de declarar estructuras de datos en Java moderno, genera un nuevo archivo Entrada_Record 
y crea un registro extra.
 */

public class entrada{
    //Atributos
    String nomEvento;
    double precioEntrada;

    //Constructor
    public entrada (String nomEvento, double precioEntrada){
        this.nomEvento = nomEvento;
        this.precioEntrada = precioEntrada;
    }
 
    // Método para mostrar los datos de la entrada
    public void mostrarInformacion(){
        System.out.println("Nombre del evento: " + nomEvento + " | Precio de entrada: $ " + precioEntrada);
    }
}