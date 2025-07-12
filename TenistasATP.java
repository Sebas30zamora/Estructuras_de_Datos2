import java.util.*;

public class TenistasATP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Tenista> tenistas = new ArrayList<>();

        int opcion;
        do {
            System.out.println("\n--- Menú de opciones ---");
            System.out.println("1. Ingreso de los tenistas");
            System.out.println("2. Mostrar datos ingresados");
            System.out.println("3. Mostrar tenistas ordenados por puntaje descendente");
            System.out.println("4. Mostrar tenistas ordenados por edad ascendente");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    tenistas.clear(); 
                    for (int i = 0; i < 15; i++) {
                        System.out.println("\nIngrese el nombre del tenista " + (i + 1) + ": ");
                        String nombre = sc.nextLine();
                        System.out.println("Ingrese el país del tenista: ");
                        String pais = sc.nextLine();
                        System.out.println("Ingrese la edad del tenista: ");
                        int edad = Integer.parseInt(sc.nextLine());
                        System.out.println("Ingrese el puntaje del tenista: ");
                        double puntaje = Double.parseDouble(sc.nextLine());

                        tenistas.add(new Tenista(nombre, pais, edad, puntaje));
                    }
                    break;

                case 2:
                    System.out.println("\n--- Lista de tenistas ingresados ---");
                    for (Tenista t : tenistas) {
                        System.out.println(t);
                    }
                    break;

                case 3:
                    System.out.println("\n--- Tenistas ordenados por puntaje (descendente) ---");
                    List<Tenista> ordenadosPorPuntaje = new ArrayList<>(tenistas);
                    quickSortPuntajeDesc(ordenadosPorPuntaje, 0, ordenadosPorPuntaje.size() - 1);
                    for (Tenista t : ordenadosPorPuntaje) {
                        System.out.println(t);
                    }
                    break;

                case 4:
                    System.out.println("\n--- Tenistas ordenados por edad (ascendente) ---");
                    List<Tenista> ordenadosPorEdad = new ArrayList<>(tenistas);
                    insertionSortEdadAsc(ordenadosPorEdad);
                    for (Tenista t : ordenadosPorEdad) {
                        System.out.println(t);
                    }
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        sc.close();
    }

    // Ordenamiento por puntaje descendente con QuickSort
    public static void quickSortPuntajeDesc(List<Tenista> lista, int inicio, int fin) {
        if (inicio < fin) {
            int indiceParticion = particionarPuntaje(lista, inicio, fin);
            quickSortPuntajeDesc(lista, inicio, indiceParticion - 1);
            quickSortPuntajeDesc(lista, indiceParticion + 1, fin);
        }
    }

    public static int particionarPuntaje(List<Tenista> lista, int inicio, int fin) {
        double pivote = lista.get(fin).puntaje;
        int i = inicio - 1;

        for (int j = inicio; j < fin; j++) {
            if (lista.get(j).puntaje > pivote) { // Descendente
                i++;
                Collections.swap(lista, i, j);
            }
        }
        Collections.swap(lista, i + 1, fin);
        return i + 1;
    }

    // Ordenamiento por edad ascendente con Inserción
    public static void insertionSortEdadAsc(List<Tenista> lista) {
        for (int i = 1; i < lista.size(); i++) {
            Tenista actual = lista.get(i);
            int j = i - 1;
            while (j >= 0 && lista.get(j).edad > actual.edad) {
                lista.set(j + 1, lista.get(j));
                j--;
            }
            lista.set(j + 1, actual);
        }
    }
}
