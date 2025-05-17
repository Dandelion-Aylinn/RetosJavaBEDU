public abstract class MetodoPago implements Autenticable{
    //Atributos
    protected double monto;

    public MetodoPago(double monto){
        this.monto = monto;
    }

    public abstract void ProcesarPago();

    public void MostrarResumen(){
        System.out.println("Tipo de pago: " + this.getClass().getSimpleName());
        System.out.println("Monto: $" + monto);

    }
}
