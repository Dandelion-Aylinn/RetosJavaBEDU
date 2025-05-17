/*
 Comparación de declaraciones de impuestos

 Objetivo:
 Modelar una declaración de impuestos con record y validarla contra una cuenta fiscal usando encapsulación 
 y comparación segura con Objects.equals().

 Instrucciones
 1. Crea un record llamado DeclaracionImpuestos con los siguientes campos:
    - String rfcContribuyente
    - double montoDeclarado
 2. Crea una clase tradicional llamada CuentaFiscal con:
    - Un atributo privado String rfc (no modificable una vez asignado).
    - Un atributo privado double saldoDisponible.
 3. Implementa lo siguiente en CuentaFiscal:
    - Constructor con validación para que el saldo no sea negativo.
    - Getters para ambos atributos.
    - Un método validarRFC(DeclaracionImpuestos d) 
      que compare el RFC de la cuenta con el de la declaración, usando Objects.equals().
 4. En la clase Main:
    - Crea una declaración de impuestos.
    - Crea una cuenta fiscal.
    - Muestra la información de ambas.
    - Valida si el RFC coincide y muestra el resultado.
 */

 public record DeclaracionImpuestos(String rfcContribuyente, double montoDeclarado){ }
