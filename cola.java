import javax.swing.*;
import java.awt.*;

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

    public void obtenerCantidad() {
        int contador = 0;
        nodo actual = frente;
        while (actual != null) {
            contador++;
            actual = actual.siguiente;
        }
        System.out.println("Cantidad de elementos en la cola: " + contador);
    }

    public void mostrarElementos() {
        if (fin == null) {
            System.out.println("La cola está vacía.");
        } else {
            System.out.println("Los elementos van a aparecer en una nueva ventana.");
            JFrame frame = new JFrame("Elementos de la cola");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setSize(800, 200);
            frame.setLocationRelativeTo(null);
            JPanel panel = new JPanel() {
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    nodo actual = frente;
                    int x = 20;
                    while (actual != null) {
                        g.drawRect(x, 50, 50, 50);
                        g.drawString(Integer.toString(actual.valor), x + 20, 80);
                        if (actual.siguiente != null) {
                            g.drawLine(x + 50, 75, x + 70, 75);
                            g.drawLine(x + 65, 70, x + 70, 75);
                            g.drawLine(x + 65, 80, x + 70, 75);
                        }
                        x += 70;
                        actual = actual.siguiente;
                    }
                    if (frente != null) {
                        g.drawString("raiz", 25, 40);
                        g.drawLine(35, 45, 35, 50);
                    }
                }
            };
            frame.add(panel);
            frame.setVisible(true);
        }
    }

    public void vaciar() {
        frente = null;
        fin = null;
        System.out.println("La cola ha sido vaciada.");
    }
}
