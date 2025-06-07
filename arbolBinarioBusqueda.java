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
