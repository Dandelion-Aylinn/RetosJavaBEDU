/*
 Sistema de pago con múltiples métodos

 Objetivo
 Diseñar un sistema de pagos en el que distintos métodos de pago (efectivo, tarjeta, transferencia) 
 compartan una estructura común pero tengan comportamientos específicos. 
 Aplicarás el uso de interfaces, clases abstractas, y polimorfismo para modelar un flujo flexible y extensible.

 Instrucciones
 1. Crea una interfaz Autenticable con:
    - Método boolean autenticar()
 2. Crea una clase abstracta MetodoPago con:
    - Atributo monto (double)
    - Método abstracto procesarPago()
    - Método concreto mostrarResumen() que imprima el tipo de pago y el monto
 3. Crea las clases concretas que extiendan MetodoPago y implementen Autenticable:
    - PagoEfectivo → autenticar() siempre retorna true (no requiere validación)
    - PagoTarjeta → valida si hay fondos suficientes
    - PagoTransferencia → simula una validación bancaria externa
 4. Cada clase debe sobrescribir procesarPago() y autenticar() usando @Override
 5. En la clase CajaRegistradora:
    - Crea un arreglo de tipo MetodoPago con instancias mezcladas (polimorfismo)
    - Recorre el arreglo, llama a autenticar() y si es válido, llama a procesarPago() y mostrarResumen()

 */

 public interface Autenticable {
    boolean autenticar();
}
