public class TomaDecision implements LogicaDecision {
    @Override
    public String tomaDecision(){
    System.out.println("¿Qué puerta deseas tomar? (A: Izquierda/ B: Derecha)");
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            return sc.nextLine().trim();
        }
    }
}