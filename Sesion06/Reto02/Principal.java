import java.util.Comparator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Principal {
    public static void main(String[] args) {
        // Lista concurrente de temas
        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();

        // Mapa concurrente de recursos
        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();

        // Agregar temas
        temas.add(new Tema("Lectura comprensiva", 2));
        temas.add(new Tema("Matemáticas básicas", 1));
        temas.add(new Tema("Cuidado del medio ambiente", 3));
        temas.add(new Tema("Educación cívica", 2));

        // Agregar recursos
        recursos.put("Lectura comprensiva", "https://recursos.edu/lectura");
        recursos.put("Matemáticas básicas", "https://recursos.edu/mate");
        recursos.put("Cuidado del medio ambiente", "https://recursos.edu/medioambiente");
        recursos.put("Educación cívica", "https://recursos.edu/civica");

        // Mostrar temas ordenados alfabéticamente (orden natural)
        System.out.println("Temas ordenados alfabéticamente:");
        temas.stream().sorted().forEach(System.out::println);

        // Mostrar temas ordenados por prioridad ascendente
        System.out.println("Temas ordenados por prioridad:");
        temas.stream()
             .sorted(Comparator.comparingInt(Tema::getPrioridad))
             .forEach(System.out::println);

        // Mostrar recursos
        System.out.println("Repositorio de recursos:");
        recursos.forEach((titulo, enlace) -> {
            System.out.println(titulo + " ➝ " + enlace);
        });
    }
}
