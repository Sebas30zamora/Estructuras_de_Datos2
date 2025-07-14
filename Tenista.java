public class Tenista {
    String nombre;
    String pais;
    int edad;
    double puntaje;

    public Tenista(String nombre, String pais, int edad, double puntaje) {
        this.nombre = nombre;
        this.pais = pais;
        this.edad = edad;
        this.puntaje = puntaje;
    }

    @Override
    public String toString() {
        return nombre + " | " + pais + " | " + edad + " | " + puntaje;
    }
}
