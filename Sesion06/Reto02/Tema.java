/*
 Planeación de temas y recursos educativos colaborativos

Instrucciones
1. Crea una clase Tema con:
    - titulo (String)
    - prioridad (int)
    - Implementa Comparable<Tema> para ordenar por título.
2. En tu método main:
    - Usa CopyOnWriteArrayList<Tema> para gestionar los temas activos.
    - Muestra la lista ordenada alfabéticamente (orden natural).
    - Luego ordénala por prioridad ascendente (1 → 3) usando Comparator.
3. Usa ConcurrentHashMap<String, String> como repositorio:
    - Clave: título del tema.
    - Valor: descripción o enlace del recurso compartido.

 */

 public class Tema implements Comparable<Tema> {
    private String titulo;
    private int prioridad;

    public Tema(String titulo, int prioridad) {
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPrioridad() {
        return prioridad;
    }

    @Override
    public int compareTo(Tema otro) {
        return this.titulo.compareToIgnoreCase(otro.titulo);
    }

    @Override
    public String toString() {
        return titulo + " (Prioridad: " + prioridad + ")";
    }
}



