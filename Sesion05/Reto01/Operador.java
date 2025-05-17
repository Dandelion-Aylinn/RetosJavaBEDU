public class Operador {
    private String nombre;

    public Operador(String nombre) {
        this.nombre = nombre;
    }

    public void reportarse() {
        System.out.println(nombre + " reportándose a la central de emergencias.");
    }
}
