
public class Ambulancia extends UnidadEmergencia{

    private SistemaGPS gps;
    private Sirena wiuwiu;
    private Operador operador;

    //Constructor
    public Ambulancia (String nombre, Operador operador) {
    super(nombre);
    this.gps = new SistemaGPS();
    this.wiuwiu = new Sirena();
    this.operador = operador;
    }

    public void IniciarOperacion(){
        ActivarUnidad();
        gps.localizar();
        wiuwiu.activarSirena();
        operador.reportarse();
        responder();

    }


    @Override
    public void responder(){
    System.out.println("Ambulancia en camino al hospital más cercano");
    }

}