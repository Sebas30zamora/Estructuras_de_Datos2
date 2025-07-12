import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class TenistasATP {

    public static void main(String[] args) {
        // Crear el scanner para leer entradas
        Scanner sc = new Scanner(System.in);

        // Crear una lista de tenistas
        List<Tenista> tenistas = new ArrayList<>();

        // Ingreso de datos de los tenistas (Punto 1)
        for (int i = 0; i < 15; i++) {
            System.out.println("Ingrese el nombre del tenista " + (i + 1) + ": ");
            String nombre = sc.nextLine();
            System.out.println("Ingrese el país del tenista: ");
            String pais = sc.nextLine();
            System.out.println("Ingrese la edad del tenista: ");
            int edad = Integer.parseInt(sc.nextLine());
            System.out.println("Ingrese el puntaje del tenista: ");
            double puntaje = Double.parseDouble(sc.nextLine());

            // Crear el objeto Tenista y agregarlo a la lista (Punto 1)
            tenistas.add(new Tenista(nombre, pais, edad, puntaje));
        }

        // Mostrar los datos ingresados (Punto 2)
        System.out.println("\nDatos ingresados:");
        for (Tenista tenista : tenistas) {
            System.out.println(tenista);
        }

        // Cerrar el scanner
        sc.close();
    }
}
