/*
 Motor de lógica narrativa

 Instrucciones
 1. Crea una clase principal llamada MainNarrativa que simule el flujo de una escena narrativa.
 2. Refactoriza el diseño original (una clase gigante llamada Narrador) 
    dividiendo responsabilidades en al menos estas tres interfaces:
    - TransicionHistoria: para definir cómo se pasa de una escena a otra.
    - GestorDialogo: para imprimir o manejar diálogos.
    - LogicaDecision: para tomar decisiones según la acción del jugador.
 3. Implementa una clase por cada interfaz que cumpla una responsabilidad específica. 
    Puedes usar nombres como TransicionSimple, DialogoTexto, DecisionBinaria, etc.
 4. Usa inyección de dependencias para que la clase principal dependa solo de las interfaces (DIP).
 5. Aplica también el principio OCP: las clases deben estar abiertas a extenderse 
    (nuevas transiciones, nuevos diálogos) pero cerradas a modificaciones.
 6. Ejecuta una simulación simple donde el usuario toma una decisión y 
    el sistema responde con una transición de historia y un diálogo.
 */

public class MainNarrativa {
    private final TransaccionHistoria transicion;
    private final GestorDialogo dialogo;
    private final LogicaDecision decision;
    
    public MainNarrativa(TransaccionHistoria transicion, GestorDialogo dialogo, LogicaDecision decision) {
        this.transicion = transicion;
        this.dialogo = dialogo;
        this.decision = decision;
    }
    
    public void iniciarEscena() {
        dialogo.hablaDialogo(" Te encuentras en una encrucijada.");
        String respuesta = decision.tomaDecision();
        transicion.cambiaEscena(respuesta);
    }
    
    
    public static void main(String[] args) {
        
        TransaccionHistoria transicion = new TransicionSimple();
        GestorDialogo dialogo = new DialogoTexto();
        LogicaDecision decision = new TomaDecision();

        MainNarrativa juego = new MainNarrativa(transicion, dialogo, decision);
        juego.iniciarEscena();
            
    }
    
}
