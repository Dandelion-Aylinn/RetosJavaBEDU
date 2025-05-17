public class PagoTarjeta extends MetodoPago implements Autenticable{
    private double fondosSuficientes;

    //Constructor
    public PagoTarjeta (double monto, double fondosSuficientes){
        super(monto);
        this.fondosSuficientes = fondosSuficientes;
        
    }

     @Override
     public boolean autenticar(){
         System.out.println("El pago en efectivo no requiere autenticación");
        return fondosSuficientes >= monto;
     }

     @Override
    public void ProcesarPago() {
        System.out.println("Monto de tarjeta: $" + monto);
    }
}
