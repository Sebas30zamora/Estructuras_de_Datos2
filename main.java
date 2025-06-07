import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arbolBinarioBusqueda arbol = new arbolBinarioBusqueda();

        int op = -1;

        while (op != 0) {
            System.out.println("\nMenú:");
            System.out.println("1. Insertar número");
            System.out.println("2. Buscar número");
            System.out.println("3. Mostrar en orden");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            op = sc.nextInt();

            if (op == 1) {
                System.out.print("Número a insertar: ");
                int num = sc.nextInt();
                arbol.insertar(num);
                System.out.println("Listo.");
            } else if (op == 2) {
                System.out.print("Número a buscar: ");
                int num = sc.nextInt();
                boolean encontrado = arbol.buscar(num);
                if (encontrado) {
                    System.out.println("Está en el árbol.");
                } else {
                    System.out.println("No está en el árbol.");
                }
            } else if (op == 3) {
                System.out.println("Mostrando árbol:");
                arbol.mostrarEnOrden();
            } else if (op == 0) {
                System.out.println("Chao.");
            } else {
                System.out.println("Opción inválida.");
            }
        }

        sc.close();
    }
}

