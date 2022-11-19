import java.util.Scanner;

public class solicitudPorTecladoParte1 {
    public static void main(String[] args) {
        
        String name; //Declara la variable que contendrá el nombre.
        String lastname; //Declara la variable que contendrá el apellido.

        Scanner sc = new Scanner(System.in); // Se crea el objeto de la clase Scanner para ingresar datos.

        System.out.println("Ingrese su nombre: "); // Muestra en consola el texto de solicitud de nombre.
        name = sc.nextLine(); // Permite ingresar el dato correspondiente con la solicitud anterior del nombre.

        System.out.println("Ingrese su apellido: "); // Muestra en consola el texto de solicitud del apellido.
        lastname = sc.nextLine(); // Permite ingresar el dato correspondiente con la solicitud anterior del apellido.

        System.out.println("Su nombre es " + name + " " + lastname +"."); // Muestra en pantalla los datos ingresados anteiormente.
        
        sc.close(); //Cierra el objeto Scanner.

    }
}
