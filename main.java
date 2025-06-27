import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        cola cola = new cola();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú Cola con Lista Enlazada ---");
            System.out.println("1. Insertar elemento");
            System.out.println("2. Extraer elemento");
            System.out.println("3. Obtener primer elemento");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un número entero: ");
                    int valor = scanner.nextInt();
                    cola.insertar(valor);
                    break;
                case 2:
                    cola.extraer();
                    break;
                case 3:
                    cola.obtenerPrimero();
                    break;
                case 4:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);
    }
}
