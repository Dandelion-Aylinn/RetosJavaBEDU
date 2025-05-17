public record entrada_record (String nomEvento, double precioEntrada){
    public void mostrarInformacion(){

        System.out.println("Evento " + nomEvento + "| Precio: $" + precioEntrada);
    }
}