
import java.util.Scanner;

/*
 Cajero Automatico Simple

 Objetivo:
 Implementar un programa que simule un cajero automático básico, aplicando estructuras de control como while, 
 switch, break y continue para navegar entre opciones y validar operaciones del usuario.

 Intrucciones:
    1. Crea una clase llamada CajeroAutomatico.
    2. En el método main, define un saldo inicial (por ejemplo: saldo = 1000.0), 
    dicha variable deberá ser inferida por java.
    3. Muestra un menú interactivo en consola con las siguientes opciones:
    Bienvenido al cajero automático
        1. Consultar saldo
        2. Depositar dinero
        3. Retirar dinero
        4. Salir
Puedes usar un do-while
   4. El programa debe repetirse usando un while hasta que el usuario elija salir (opción 4).
   5. Utiliza un switch para manejar las opciones:
        1. Consultar saldo → Mostrar el saldo actual.
        2. Depositar dinero → Pedir monto a depositar y sumarlo al saldo.
        3. Retirar dinero → Pedir monto a retirar y:
                - Validar si hay saldo suficiente.
                - Si no hay suficiente, mostrar un mensaje y continuar sin restar.
        4. Salir → Mostrar mensaje de despedida y terminar el programa.
    6. Controla el flujo con break y continue donde sea necesario.

Desafio adicional
Si el usuario ingresa una opción inválida, muestra un mensaje de error y 
vuelve a mostrar el menú sin detener el programa.
 */

public class cajeroAutomatico{
    public static void main (String[]args){

        Scanner input = new Scanner(System.in);
        double saldoInicial = 1000.0;
        int opcion;

        do { 
            //Menu 
        System.out.println("¡Bienvenido al cajero automático!");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Depositar dinero");
        System.out.println("3. Retirar dinero");
        System.out.println("4. Salir");

        opcion = input.nextInt();

        switch(opcion){

            case 1 -> {
                System.out.println("Tu saldo actual es: $" + saldoInicial);
            }

            case 2-> {
                System.out.println("Monto a depositar: $ " );
                double deposito = input.nextDouble();

                if (deposito <= 0){
                    System.out.println("El monto a depositar debe ser mayor a $0");
                    continue; // Hace regresar al menú
                }

                System.out.println("El monto total es $ " + saldoInicial);
                saldoInicial += deposito;
            }

            case 3 ->{
                System.out.println("Ingresa el monto a retirar: ");
                double retiro = input.nextDouble();
                if (retiro <=0){
                    System.out.println("Monto introducido invalido");
                    continue; //Regresa al menú
                }
                if(retiro > saldoInicial){
                    System.out.println("Saldo insuficiente, ingrese nuevo monto");
                    continue;//Regresa al menú
                }

                saldoInicial -=retiro;
                System.out.println("Saldo actual $ " + saldoInicial);
            }

            case 4 ->{
                System.out.println("Gracias por su preferencia, ¡hasta pronto!");
            }
            default ->{
                System.out.println("Opción invaluda. Seleccione una de las opciones mostradas en el menú");
            } 
        }

        } while (opcion !=4);
        input.close();

    }
}