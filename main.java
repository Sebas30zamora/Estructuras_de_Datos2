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
            System.out.println("10. Salir");
            opcion = leerEntero(scanner, "Seleccione una opción: ");

            switch (opcion) {
                case 1: {
                    int valor = leerEntero(scanner, "Ingrese un número entero: ");
                    cola.insertar(valor);
                    break;
                }
                case 2:
                    cola.extraer();
                    break;
                case 3:
                    cola.obtenerPrimero();
                    break;
                case 4:
                    cola.obtenerUltimo();
                    break;
                case 5: {
                    int pos = leerEntero(scanner, "Ingrese la posición (0, 1, 2, ...): ");
                    cola.obtenerElementoEnPosicion(pos);
                    break;
                }
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
                case 10:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 10);

        scanner.close();
    }

    /**
     * Lee un entero desde consola. Si el usuario escribe letras u otro formato,
     * muestra "Las letras no son válidas" y vuelve a pedir.
     */
    private static int leerEntero(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                int val = scanner.nextInt();
                scanner.nextLine(); // consumir el fin de línea
                return val;
            } else {
                String invalido = scanner.next(); // consume el token inválido
                System.out.println("Entrada inválida: \"" + invalido + "\". Las letras no son válidas, solo números enteros.");
            }
        }
    }
}
