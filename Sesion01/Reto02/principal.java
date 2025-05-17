public class principal{
    public static void main(String[] args) {
        entrada entrada1 = new entrada ("Concierto de BEDU", 800.00);
        entrada entrada2 = new entrada ("Obra de Teatro BEDU", 450.00);

        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();

        //Reto adicional
        entrada_record entrada3 = new entrada_record ("Sinfonía BEDU",1200.00);
        entrada3.mostrarInformacion();
    }
}