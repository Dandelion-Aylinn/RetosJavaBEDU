public class UnidadBomberos extends UnidadEmergencia{

    private SistemaGPS gps;
    private Sirena wiuwiu;
    private Operador operador;

    //Constructor
    public UnidadBomberos (String nombre, Operador operador){
    super(nombre);
    this.gps = new SistemaGPS();
    this.wiuwiu = new Sirena();
    this.operador = operador;
    }

    public void IniciarOperacion() {
        ActivarUnidad();
        gps.localizar();
        wiuwiu.activarSirena();
        operador.reportarse();
        responder();
    }

    
     @Override
    public void responder(){
    System.out.println("Unidad de bomberos respondiendo a incendio estructural.");
    }
}