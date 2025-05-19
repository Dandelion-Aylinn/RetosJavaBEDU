/*
Procesamiento eficiente de logs de errores

Instrucciones
1. Crea una clase principal llamada AnalizadorDeLogs.
2. Usa try-with-resources para abrir el archivo errores.log con BufferedReader.
3. Lee el archivo línea por línea y cuenta cuántas veces aparece:
    - La palabra "ERROR"
    - La palabra "WARNING"
4. Al finalizar, imprime un resumen en consola con:
    - Total de líneas leídas
    - Cantidad de errores
    - Cantidad de advertencias
    - Porcentaje de líneas con errores y advertencias
5. Si el archivo no existe o hay algún problema, captura la excepción con 
try-catch y guarda el mensaje de error en un archivo registro_fallos.txt.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class AnalizadorDeLogs{
    public static void main(String[] args) {
        Path rutaFallos = Paths.get("config/registro_fallos.txt");
        Path rutaArchivo = Paths.get("config/errores.txt");

        //Iniciar contador
        int totalLineas = 0;
        int contadorErrores = 0;
        int contadorAdvertencias = 0;
        try{
        Files.createDirectories(rutaArchivo.getParent());

        try(BufferedReader lector = Files.newBufferedReader(rutaArchivo)){
            String linea;
            while((linea = lector.readLine()) != null){
                totalLineas++;

                if (linea.contains("ERROR")){
                    contadorErrores++;
                }
                if(linea.contains("WARNING")){
                    contadorAdvertencias++;
                }
            }
        
        }
        double porcentaje = (double) (contadorErrores + contadorAdvertencias) / totalLineas * 100;
        System.out.println("Analisis: \n");
        System.out.println("Total de líneas leidas: " + totalLineas);
        System.out.println("Total de errores encontrados: " + contadorErrores);
        System.out.println("Total de advertencias encontradas: " + contadorAdvertencias);
        System.out.println("Porcentaje de líenas de errores y advertencias: " + porcentaje);

        } catch(IOException e){
            System.out.println("Se produjo un error al procesar el archivo: " + e.getMessage());
            try(BufferedWriter escritor = Files.newBufferedWriter(rutaFallos)){
                escritor.write("Error en archivo: " + e.getMessage());
            
            }catch(IOException ex){
                System.out.println("Error adicional al intentar escribir en registro_fallos.txt: " + ex.getMessage());
            }
        }
    }
}