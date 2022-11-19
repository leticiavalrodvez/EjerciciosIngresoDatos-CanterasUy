import java.util.Scanner;

public class solicitudPorTecladoParte3 {
    public static void main(String[] args) {

        String name; //Variable del nombre.
        String lastname; //Variable del apellido.
        String momName; //Variable nombre de la madre.
        String dadName; //variable nombre del padre.

        Scanner sc = new Scanner(System.in); //objeto Scanner

        System.out.println("Ingrese su nombre"); //Solicitud de ingreso de datos: Nombre
        name = sc.nextLine(); //Ingreso de datos a la variable correspondiente.

        System.out.println("Ingrese su apellido"); //Solicitud de ingreso de datos: Apellido
        lastname = sc.nextLine(); //Ingreso de datos a la variable correspondiente.

        System.out.println("Ingrese el nombre de su madre"); //Solicitud de ingreso de datos: Nombre Madre
        momName = sc.nextLine(); //Ingreso de datos a la variable correspondiente.

        System.out.println("Ingrese el nombre de su padre"); //Solicitud de ingreso de datos: Nombre Padre
        dadName = sc.nextLine(); //Ingreso de datos a la variable correspondiente.

        System.out.println("Yo " + name + " " + lastname + ", soy hijo/a de " + momName + " y " + dadName + "."); //Muestra por pantalla los datos ingresados.

        sc.close(); //Termina el proceso del objeto Scanner.

    }
}
