public class CajaRegistradora{
    public static void main(String[] args) {
        MetodoPago[] pagos = {
            new PagoEfectivo (300),
            new PagoTarjeta (600,1000),
            new PagoTransferencia(400,"Nu")
        };

        for(MetodoPago pago : pagos){

        if(pago.autenticar()){
            pago.ProcesarPago();
            pago.MostrarResumen();
            System.out.println("Movimiento exitoso");
        }else {
            System.out.println("Movimiento denegado" + pago.getClass().getSimpleName());
        }
    }
}
}