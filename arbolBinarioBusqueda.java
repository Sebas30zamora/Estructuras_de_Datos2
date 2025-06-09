public class arbolBinarioBusqueda {
    private nodo raiz;

    public arbolBinarioBusqueda() {
        raiz = null;
    }

    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    private nodo insertarRec(nodo actual, int valor) {
        if (actual == null) {
            return new nodo(valor);
        }

        if (valor < actual.valor) {
            actual.hijoIzq = insertarRec(actual.hijoIzq, valor);
        } else if (valor > actual.valor) {
            actual.hijoDer = insertarRec(actual.hijoDer, valor);
        }

        return actual;
    }

    public boolean buscar(int valor) {
        return buscarRec(raiz, valor);
    }

    private boolean buscarRec(nodo actual, int valor) {
        if (actual == null) {
            return false;
        }

        if (actual.valor == valor) {
            return true;
        }

        if (valor < actual.valor) {
            return buscarRec(actual.hijoIzq, valor);
        } else {
            return buscarRec(actual.hijoDer, valor);
        }
    }

    public void mostrarEnOrden() {
        mostrarRec(raiz);
        System.out.println();
    }

    private void mostrarRec(nodo actual) {
        if (actual != null) {
            mostrarRec(actual.hijoIzq);
            System.out.print(actual.valor + " ");
            mostrarRec(actual.hijoDer);
        }
    }
}public class arbolBinarioBusqueda {
    private nodo raiz;

    public arbolBinarioBusqueda() {
        raiz = null;
    }

    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    private nodo insertarRec(nodo actual, int valor) {
        if (actual == null) {
            return new nodo(valor);
        }

        if (valor < actual.valor) {
            actual.hijoIzq = insertarRec(actual.hijoIzq, valor);
  } else if (valor > actual.valor) {
            actual.hijoDer = insertarRec(actual.hijoDer, valor);
        }

        return actual;
    }
