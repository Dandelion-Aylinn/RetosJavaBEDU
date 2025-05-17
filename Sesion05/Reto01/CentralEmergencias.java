public class CentralEmergencias{
    public static void main (String []args){

        Operador operador1 = new Operador ("Juan");
        Operador operador2 = new Operador ("Laura");
        Operador operador3 = new Operador ("Marco");
        Ambulancia ambulancia = new Ambulancia ("Ambulancia",operador1);
        Patrulla patrulla = new Patrulla ("Patrulla", operador2);
        UnidadBomberos bomberos = new UnidadBomberos ("Unidad de Bomberos", operador3);

        ambulancia.IniciarOperacion();
        System.out.println();

        patrulla.IniciarOperacion();
        System.out.println();

        bomberos.IniciarOperacion();
        System.out.println();
    }
}