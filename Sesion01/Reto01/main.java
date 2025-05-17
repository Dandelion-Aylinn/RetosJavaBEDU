
import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Crear un objeto Scanner para leer desde el teclado

        //paciente --> p
        paciente p1 = new paciente ();

        System.out.println("Complete el siguiete formulario: ");

        System.out.println("Nombre completo: ");
        p1.Nombre = input.nextLine();

        System.out.println("Edad: ");
        p1.Edad = input.nextInt();
        input.nextLine(); //nextLine limpia el buffer y así pueda volver a pedir los datos

        System.out.println("Número de expediente: ");
        p1.NumExp = input.nextLine();

        input.close(); // El escaner ya no va a pedir más datos

        p1.mostrarInfo(); //Imprime los datos del objeto        

    }
}