public class Principal{
    public static void main(String[] args) {
        Pasajero pasajero1 = new Pasajero("Abril Aldana","PAS95146");

        vuelo vuelo1 = new vuelo("V1012","Cancún","10:30");

        //Reservar asiento
        boolean reservacion = vuelo1.reservarAsiento(pasajero1);
        if(reservacion){
            System.out.println("Reservación exitosa");
        }else{
            System.err.println("Reservación sin exito");
        }
          //Itinerario
    vuelo1.obtenerItinerario();

    System.out.println("Vuelo cancelado");
    vuelo1.cancelarReserva();

    vuelo1.obtenerItinerario();

    vuelo1.reservarAsiento("Ana Lilia", "PAS456852");
    vuelo1.obtenerItinerario();
    }
}