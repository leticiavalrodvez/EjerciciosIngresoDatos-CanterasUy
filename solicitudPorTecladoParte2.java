import java.util.Scanner;

public class solicitudPorTecladoParte2 {

    public static void main(String[] args) {

        String name; //Declara la variable que contendrá el nombre.
        String lastname; //Declara la variable que contendrá el apellido.
        int age; //Declara la variable que contendrá la edad.
        float height; //Declara la variable que contendrá la estatura.

        Scanner sc = new Scanner(System.in); // Se crea el objeto de la clase Scanner para ingresar datos.

        System.out.println("Ingrese su nombre: "); // Muestra en consola el texto de solicitud de nombre.
        name = sc.nextLine(); // Permite ingresar el dato correspondiente con la solicitud anterior del nombre.

        System.out.println("Ingrese su apellido: "); // Muestra en consola el texto de solicitud del apellido.
        lastname = sc.nextLine(); // Permite ingresar el dato correspondiente con la solicitud anterior del apellido.

        System.out.println("Ingrese su edad: "); // Muestra en consola el texto de solicitud de la edad.
        age = sc.nextInt(); // Permite ingresar el dato correspondiente con la solicitud anterior de la edad.

        System.out.println("Ingrese su estatura: "); // Muestra en consola el texto de solicitud de la estatura.
        height = sc.nextFloat(); // Permite ingresar el dato correspondiente con la solicitud anterior de la estatura.

        System.out.println("Su nombre es " + name + " " + lastname + ", su edad es " + age + " años y su estatura es " + height + "."); // Muestra en pantalla los datos ingresados anteiormente.

        sc.close(); //Cierra el objeto Scanner.

    }
}
