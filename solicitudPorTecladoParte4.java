import java.util.Scanner;

public class solicitudPorTecladoParte4 {
    public static void main(String[] args) {

        String city; //Variable Capital
        String country; //Variable Pais

        Scanner sc = new Scanner(System.in); //Objeto Scanner

        System.out.println("Ingrese la capital: "); //Solicitud de ingreso de datos: Capital
        city = sc.nextLine(); //Ingreso de datos a la variable correspondiente.

        System.out.println("Ingrese el país correspondiente a la capital: "); //Solicitud de ingreso de datos: Pais
        country = sc.nextLine(); //Ingreso de datos a la variable correspondiente.

        System.out.println("La ciudad " + city + ", es la capital del país " + country + "."); //Muestra por pantalla los datos ingresados.

        sc.close(); //Termina el proceso del objeto Scanner.

    }
}
