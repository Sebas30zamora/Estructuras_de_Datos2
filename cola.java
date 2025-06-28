public class cola {
    private nodo frente;
    private nodo fin;

    public cola() {
        frente = null;
        fin = null;
    }

    public void insertar(int valor) {
        nodo nuevo = new nodo(valor);
        if (fin == null) {
            frente = nuevo;
            fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }
        System.out.println("Elemento insertado: " + valor);
    }

    public void extraer() {
        if (frente == null) {
            System.out.println("La cola está vacía.");
        } else {
            System.out.println("Elemento extraído: " + frente.valor);
            frente = frente.siguiente;
            if (frente == null) {
                fin = null;
            }
        }
    }

    public void obtenerPrimero() {
        if (frente == null) {
            System.out.println("La cola está vacía.");
        } else {
            System.out.println("Primer elemento: " + frente.valor);
        }
    }

    public void obtenerUltimo() {
        if (fin == null) {
            System.out.println("La cola está vacía.");
        } else {
            System.out.println("Último elemento: " + fin.valor);
        }
    }

    public void obtenerElementoEnPosicion(int posicion) {
        if (posicion < 0) {
            System.out.println("Posición inválida.");
            return;
        }

        nodo actual = frente;
        int indice = 0;

        while (actual != null && indice < posicion) {
            actual = actual.siguiente;
            indice++;
        }

        if (actual == null) {
            System.out.println("No existe un elemento en esa posición.");
        } else {
            System.out.println("Elemento en posición " + posicion + ": " + actual.valor);
        }
    }

    public void verificarSiEstaVacia() {
        if (frente == null) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}
