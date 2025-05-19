/*
Monitoreo de consumo de recursos en servidores

Instrucciones
1. Crea una clase principal llamada MonitorCPU donde se ejecuta el flujo general.
2. Solicita al usuario ingresar el consumo de CPU de varios servidores (valores en porcentaje).
3. Aplica validación:
    - El valor debe ser numérico.
    - No se deben permitir registros duplicados (usa HashSet).
    - No se permiten valores negativos ni mayores a 100%.
4. Si el valor ingresado es mayor a 95%, lanza una excepción personalizada llamada ConsumoCriticoException.
5. Muestra mensajes informativos en consola si hay errores o si todo marcha correctamente.
6. Cierra cualquier recurso utilizado adecuadamente (finally).
7. Puedes simular la entrada con datos fijos o usando Scanner.
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MonitorCPU{
    public static void main(String[] args) {
        Set<String> servidores = new HashSet<>();
        Scanner input = new Scanner(System.in);

    try{ 
        System.out.println("Ingresa datos para continuar");
        System.out.println("Escribir 'salir' para terminar");

        String nombreServidor;

        do{
            System.out.println("Nombre de servidor: ");
            nombreServidor = input.nextLine();

            if(nombreServidor.equalsIgnoreCase("salir")) {
                break;
            }

            if(servidores.contains(nombreServidor)){
                System.err.println("Error");
                continue;
            }

            System.err.println("Consumo de CPU en %");
            double consumo;

            try {
                consumo = Double.parseDouble(input.nextLine());

                if (consumo < 0 || consumo > 100){
                    System.out.println("El consumo debe de tener un rango entre 0% a 100 %");
                    continue;
                }

                if(consumo > 95){
                    throw new ConsumoCriticoException ("CPU con alto consumo" + nombreServidor + ":" + consumo + "%");

                }

            servidores.add(nombreServidor);
            System.out.println("Servidor reistrado " + consumo + "%");

            } catch(NumberFormatException e){
                System.out.println("Error");
            } catch(ConsumoCriticoException e){
                System.out.println(e.getMessage());
                System.out.println("Revición de servidor");
            }
        } 
        
        while (true);

        System.out.println("Monitoreo de servidores" + servidores.size());

         if (!servidores.isEmpty()) {
                System.out.println("Lista:");
                for (String srv : servidores) {
                    System.out.println("- " + srv);
                }
             } else {
                System.out.println("No hay servidores registrados");
            }
    } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        } finally {

            input.close();
        }
    }
}