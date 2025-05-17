/*
 Reserva de vuelos

 Objetivos:
 Diseñar un sistema básico de reservas de vuelo aplicando los fundamentos de la 
 Programación Orientada a Objetos en Java. Practicarás la creación de clases y objetos, 
 el uso de atributos static y final, así como la definición de métodos con parámetros y valores de retorno.

 Instrucciones
   1. Crear la clase Vuelo
      Atributos
       - final String codigoVuelo: código único del vuelo
       - String destino: ciudad destino del vuelo
       - String horaSalida: hora de salida en formato 24h
       - Pasajero asientoReservado: referencia al pasajero que reservó el asiento (puede ser null)
      Métodos
       - Vuelo(String codigo, String destino, String horaSalida): constructor del vuelo
       - boolean reservarAsiento(Pasajero p) → Asigna al pasajero si no hay reserva previa
       - boolean reservarAsiento(String nombre, String pasaporte) → Método sobrecargado
       - void cancelarReserva() → Elimina al pasajero asignado
       - String obtenerItinerario() → Muestra la información del vuelo y el pasajero
    2. Crear el objeto pasajeros
      Atributos
       - String nombre: nombre del pasajero
       - String pasaporte: número de pasaporte
      Métodos 
       - Pasajero(String nombre, String pasaporte)
       - String getNombre()
       - String getPasaporte()
    3. En la clase principal
      Actividades
       - Crear al menos un pasajero y un vuelo
       - Reservar el asiento en el vuelo
       - Mostrar el itinerario
       - Cancelar la reserva
       - Mostrar nuevamente el itinerario
       - Reservar un asiento en el vuelo usando un nombre y pasaporte
 */

public class vuelo{
    //Atributos
       final String codigoVuelo;
       String destino;
       String horaSalida;
       Pasajero asientoReservado;
    //Métodos
        public vuelo (String codigoVuelo, String destino, String horaSalida){ //Constructor
            this.codigoVuelo = codigoVuelo;
            this.destino = destino;
            this.horaSalida = horaSalida;
            this.asientoReservado = null;
        }

        public boolean reservarAsiento(Pasajero p){
            if(asientoReservado==null){
                asientoReservado = p;
                return true;
            }else{
                return false;
            }
        }

        //Sobrecarga
        public boolean reservarAsiento(String nombre, String pasaporte){
            Pasajero nuevoPasajero = new Pasajero(nombre,pasaporte);
            return reservarAsiento(nuevoPasajero);
        }

        //Cancelar reserva
        public void cancelarReserva(){
            asientoReservado = null;
        }

        //Itinerario de vuelo
        public void obtenerItinerario(){
            System.out.println("Vuelo: " + codigoVuelo);
            System.out.println("Destino: " + destino);
            System.out.println("Hora de salida: "+ horaSalida);
            if(asientoReservado == null){
                System.out.println("Sin asiento asignado");
            }else{
                System.out.println("Asiento reservado: " + asientoReservado.getNombre());
                System.out.println("Pasaporte: " + asientoReservado.getPasaporte());
            }
        }
}