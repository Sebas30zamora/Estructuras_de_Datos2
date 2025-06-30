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
            System.out.println("4. Obtener último elemento");
            System.out.println("5. Obtener elemento en posición");
            System.out.println("6. ¿Está vacía la cola?");
            System.out.println("7. Mostrar cantidad de elementos");
            System.out.println("8. Mostrar elementos en la cola");
            System.out.println("9. Vaciar la cola");
            System.out.println("0. Salir");
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
                    cola.obtenerUltimo();
                    break;
                case 5:
                    System.out.print("Ingrese la posición: ");
                    int pos = scanner.nextInt();
                    scanner.nextLine(); 
                    cola.obtenerElementoEnPosicion(pos);
                    break;
                case 6:
                    cola.verificarSiEstaVacia();
                    break;
                case 7:
                    cola.obtenerCantidad();
                    break;
                case 8:
                    cola.mostrarElementos();
                    break;
                case 9:
                    cola.vaciar();
                    break;
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }
}
