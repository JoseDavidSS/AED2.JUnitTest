public class Cuadrado {
    int largo;
    int ancho;
    int area;

    public Cuadrado(int largo, int ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    int calcularArea() {
        int area = largo * ancho;
        return area;
    }

    int calcularSuma() {
        return largo + ancho;
    }

    public String sumarStrings(String a, String b) {
        return a + b;
    }
}
