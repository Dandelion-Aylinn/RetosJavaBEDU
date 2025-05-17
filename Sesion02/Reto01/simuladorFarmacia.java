
import java.util.Scanner;

/*
 Simulador de farmacia con descueto

 Objetivo: Desarrollar un programa que calcule el total de una compra en farmacia 
 y aplique un descuento si supera cierta cantidad. Este reto refuerza el uso de operadores aritméticos, 
 asignación, entrada por consola, e inferencia de tipo con var.

 Instrucciones:
  1. Crea una clase llamada SimuladorFarmacia.
  2. Solicita al usuario que introduzca los siguientes datos:
    - Nombre del medicamento (tipo String)
    - Precio unitario (tipo double)
    - Cantidad de piezas (tipo int)
  3. Calcula el total sin descuento multiplicando el precio por la cantidad.
  4. Supón que si el total supera los $500.00, la farmacia ofrece un 15% de descuento. 
  Aplica el descuento usando el operador ternario (? :) sin estructuras if.
  5. Muestra en consola el resumen con el siguiente formato:
    Medicamento: Amoxicilina
    Cantidad: 5
    Precio unitario: $120.0
    Total sin descuento: $600.0
    ¿Aplica descuento?: true
    Descuento: $90.0
    Total a pagar: $510.0
 */

 public class simuladorFarmacia{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in); //Crear un objeto Scanner para leer desde el teclado

      //Solicitar datos 
      System.out.println("Llene el siguiente formulario: ");

      System.out.println("Nombre del medicamento: ");
      String medicamento = input.nextLine();

      System.out.println("Precio del medicamento: $");
      double precio = input.nextDouble();
      

      System.out.println("Cantidad de medicamento recetado: ");
      int piezas = input.nextInt();
      

      //Total a pagar sin descuento
      double totalNoDescuento = precio * piezas; 

      //Si aplica descuento 
      var siDescuento = totalNoDescuento > 500; 
      double descuento = siDescuento ? totalNoDescuento * 0.15 : 0;

      //Total a pagar 
      double total = totalNoDescuento - descuento;

      System.out.println("Resumen de compra: ");
      System.out.println("Medicamento: " + medicamento);
      System.out.println("Cantidad de piezas: " + piezas);
      System.out.println("Precio unitario: $" + precio);
      System.out.println("Total sin descuento: " + totalNoDescuento);
      System.out.println("¿Aplica descuento? " + siDescuento);
      System.out.println("Descuento: $" + descuento);
      System.out.println("Total a pagar: $" + total);

      input.close();
  }
 }