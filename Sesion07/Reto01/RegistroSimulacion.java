/*
 Registro de parámetros de simulación

 Objetivo
 Aplicar las clases Path y Files de la API java.nio.file (NIO.2) para crear un archivo de configuración 
 de simulación, verificar su existencia y leer su contenido. Este ejercicio simula una tarea real del rol 
 de Process Simulation Engineer, donde se documentan los parámetros antes de ejecutar una corrida de simulación.

Instrucciones
1. Crea una clase principal llamada RegistroSimulacion.
2. Usa Path y Paths.get() para definir la ruta del archivo parametros.txt, dentro de una carpeta config/.
3. Crea un String con parámetros como:
    - Tiempo de ciclo: 55.8 segundos
    - Velocidad de línea: 1.2 m/s
    - Número de estaciones: 8
4. Utiliza Files.write() para guardar el contenido en el archivo. 
   Si la carpeta config/ no existe, créala previamente.
5. Usa Files.exists() para validar que el archivo fue creado correctamente.
6. Lee el archivo con Files.readString() y muestra su contenido en consola.
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RegistroSimulacion{
    public static void main(String[] args) {
        //Crear path con ruta a un archivo
        Path rutaArchivo = Paths.get("config/Parametros.txt");

        try {
            guardarParametros(rutaArchivo);
            
            if (Files.exists(rutaArchivo)) {
                System.out.println("Archivo creado correctamente.");
                leerParametros(rutaArchivo);
            } else {
                System.out.println("No se pudo crear el archivo.");
            }
        } catch (IOException e) {
            System.err.println("Error al trabajar con el archivo: " + e.getMessage());
        }
    }

    private static void guardarParametros(Path ruta) throws IOException {
        // Crear carpeta si no existe
        Path carpeta = ruta.getParent();
        if (!Files.exists(carpeta)) {
            Files.createDirectories(carpeta);
        }

        String parametros = """
                Tiempo de ciclo: 55.8 segundos
                Velocidad de línea: 1.2 m/s
                Número de estaciones: 8
                """;

        Files.write(ruta, parametros.getBytes());
    }

    private static void leerParametros(Path ruta) throws IOException {
        String contenido = Files.readString(ruta);
        System.out.println("Contenido del archivo:");
        System.out.println(contenido);
    }
}

    
