import java.util.Scanner;

public class solicitudPorTecladoParte5 {
    public static void main(String[] args) {

        String namePet; //Variable Nombre Mascota
        Integer agePet; //Variable Edad Mascota
        String typePet; //Variable Tipo Mascota
        String ownerName; //Variable Nombre Dueño

        Scanner sc = new Scanner(System.in);  //Objeto Scanner

        System.out.println("Ingrese el nombre de la mascota: "); //Solicitud de ingreso de datos: Nombre Mascota
        namePet = sc.nextLine(); //Ingreso de datos a la variable correspondiente.

        System.out.println("Ingrese la edad de la mascota: "); //Solicitud de ingreso de datos: Edad Mascota
        agePet = sc.nextInt(); //Ingreso de datos a la variable correspondiente.

        sc.nextLine(); //Limpiar el buffer de entrada de datos.

        System.out.println("Ingrese el tipo de mascota: "); //Solicitud de ingreso de datos: Tipo Mascota
        typePet = sc.nextLine(); //Ingreso de datos a la variable correspondiente.

        System.out.println("Ingrese el nombre del dueño: "); //Solicitud de ingreso de datos: Dueño Mascota
        ownerName = sc.nextLine(); //Ingreso de datos a la variable correspondiente.

        System.out.println( namePet + " es un(a) " + typePet + ", el cual, tiene " + agePet + " años y " + ownerName + " es actualmente su dueño(a).");

        sc.close(); //Termina el proceso del objeto Scanner.
    }
}
