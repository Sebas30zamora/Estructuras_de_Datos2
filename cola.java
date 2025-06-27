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

    public boolean estaVacia() {
        return frente == null;
    }
}

