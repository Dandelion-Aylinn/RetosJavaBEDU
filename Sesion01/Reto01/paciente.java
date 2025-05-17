/*
Registo básico de pacientes

Objetivo:
Desarrollar un programa en Java que registre los datos de un paciente, 
aplicando los fundamentos de clases, objetos, atributos, métodos y la entrada de datos por consola.

Instrucciones: 
1. Crear una clase llamada paciente
2. Utilizar la clase scanner para solicitar los sig. datos de la consola: 
   - Nombre del paciente (String)
   - Edad del paciente (int)
   - Número de expediente (String)
3. Declara atributos en la clase Paciente para almacenar esta información.
4. Agrega un método público llamado mostrarInformacion() que imprima el siguiente formato:
   Paciente: Lena Marie 
   Edad: 25
   Expediente: EXP202409
5. Crea un archivo llamado Principal y dentro del método main():
   - Crea un objeto de tipo Paciente
   - Asigna los valores ingresados por el usuario
   - Llama al método mostrarInformacion() para mostrar los datos en consola
*/

public class paciente{
   //Atributos
   String Nombre;
   int Edad;
   String NumExp;

   public void mostrarInfo(){
      System.out.println("Información del paciente ");
      System.out.println("Paciente: " + Nombre);
      System.out.println("Edad: " + Edad);
      System.out.println("Número de expediente: " + NumExp);
   }
}