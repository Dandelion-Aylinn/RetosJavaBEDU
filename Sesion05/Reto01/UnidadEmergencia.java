/*
 Sistema de emergencia

 Objetivo:
 Construir un sistema que modele diferentes tipos de unidades de emergencia, 
 aplicando los principios de herencia y composición en Java. Reforzarás el uso de extends, super, 
 y el diseño modular usando clases auxiliares.

 Instrucciones
 1.  Crea una clase abstracta UnidadEmergencia con:
    - Un atributo nombre (String)
    - Un método responder() → abstracto
    - Un método concreto activarUnidad() que imprima un mensaje de activación
 2. Crea las subclases:
    - Ambulancia
    - Patrulla
    - UnidadBomberos
   Cada clase debe:
    - Extender UnidadEmergencia
    - Sobrescribir el método responder() con un mensaje propio
 3. Crea las clases auxiliares para composición:
    - SistemaGPS → método localizar()
    - Sirena → método activarSirena()
    - Operador → atributo nombre, método reportarse()
 4. En cada subclase (Ambulancia, Patrulla, UnidadBomberos), agrega los componentes por composición 
    y un método llamado iniciarOperacion() que invoque:
    - activarUnidad() (heredado)
    - localizar()
    - activarSirena()
    - reportarse()
    - responder() (implementación propia)
 5. En la clase CentralEmergencias (main):
    - Crea una instancia de cada tipo de unidad
    - Llama al método iniciarOperacion() en cada una
 */

 public abstract class UnidadEmergencia{
    //Atributo 
    String nombre;

    //Constructor
    public UnidadEmergencia(String nombre){
        this.nombre = nombre;
    }

    public abstract void responder();

    //Activar Unidad
    public void ActivarUnidad(){
        System.out.println("Activando unidad de emergencia " + nombre);
    }

 }