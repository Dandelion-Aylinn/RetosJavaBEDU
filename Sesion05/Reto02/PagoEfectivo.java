public class PagoEfectivo extends MetodoPago implements Autenticable{
    //constructor
    public PagoEfectivo (double monto){
        super(monto);
    }

    @Override
     public boolean autenticar(){
         System.out.println("El pago en efectivo no requiere autenticación");
        return true;
     }
    
     @Override
    public void ProcesarPago() {
    System.out.println("Pago en efectivo: $" + monto);
    }
}
