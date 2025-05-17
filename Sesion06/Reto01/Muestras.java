/*
Registro y análisis de muestras genéticas

Objetivo
Practicar el uso de ArrayList, HashSet y HashMap en un contexto profesional relacionado con la biotecnología, 
para registrar muestras, identificar elementos únicos y asociar datos clave.

Instrucciones
1. Use un ArrayList<String> para registrar el orden en que llegaron las muestras.
Ejemplo de especies: "Homo sapiens", "Mus musculus", "Arabidopsis thaliana", "Homo sapiens".
2. Use un HashSet<String> para obtener una lista de especies únicas.
3. Use un HashMap<String, String> para asociar el ID de muestra con el nombre del investigador.
Ejemplo: ("M-001", "Dra. López"), ("M-002", "Dr. Hernández").
4. Muestre en consola:
    - La lista completa y ordenada de muestras.
    - Las especies únicas procesadas.
    - La relación de ID de muestra → investigador.
    - Una búsqueda por ID de muestra ("M-002" por ejemplo).
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Muestras {
    public static void main(String[] args) {
        
        //incicializa la bitácora
        HashMap<String, String> directorio = new HashMap<>();
        HashSet<String> inventarioSpp = new HashSet<>();
        ArrayList<String> fila = new ArrayList<>();

        int numMuestras = args.length;
        
        for (String arg : args) {
            System.out.println("Muestra: " + arg);
            
            String[] datos = arg.split("\\.");
            String idMuestra = datos[0];
            String responsable = datos[1];
            String spp = datos[2];
            
            fila.add(spp);
            directorio.put(responsable,idMuestra);
            inventarioSpp.add(spp);            
            
        }
        
        System.out.println("Contenido de fila: " + fila.toString());
        System.out.println("Contenido de directorio: " + directorio.toString());
        System.out.println("Contenido de inventarioSpp: " + inventarioSpp.toString());

        
    }
    
}
