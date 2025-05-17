import java.util.Objects;
public class CuentaFiscal{
    //Atributos
    private String rfc;
    private double saldoDisponible;

    //Contructor
    public CuentaFiscal (String rfc,double saldoDisponible){
        this.rfc = rfc;

        if(saldoDisponible < 0){
            System.out.println("Saldo negativo incorrecto, validación a cero");
            this.saldoDisponible =0;
        } else{
            this.saldoDisponible = saldoDisponible;
        }
    }

    //getters
    public String getRfc(){
        return rfc;
    }

    public double getSaldoDisponible(){
        return saldoDisponible;
    }

    //Validacion de RFC
    public boolean validarRFC(DeclaracionImpuestos d){
        return Objects.equals(this.rfc, d.rfcContribuyente());
    }

    @Override
    public String toString(){
        return "Cuenta fiscal: [rfc" + rfc + ", saldo disponible " + saldoDisponible + "]";
    }
}