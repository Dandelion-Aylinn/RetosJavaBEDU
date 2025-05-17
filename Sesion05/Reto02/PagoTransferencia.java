public class PagoTransferencia extends MetodoPago implements Autenticable{
    private String banco;
    
    //Constructor
    public PagoTransferencia (double monto, String banco){
        super(monto);
        this.banco = banco;
        
    }

    @Override
     public boolean autenticar(){
         System.out.println("El pago en efectivo no requiere autenticación");
        return banco != null && !banco.isEmpty();
     }

     @Override
    public void ProcesarPago() {
        System.out.println("Monto de tarnsferido: $" + monto);
    }
}