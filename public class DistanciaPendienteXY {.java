public class DistanciaPendienteXY {

    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2));
    }

    public static double calculateSlope(double x1, double y1, double x2, double y2) {
        if (x2 - x1 == 0.0) {
            throw new IllegalArgumentException("La diferencia entre las coordenadas x no puede ser cero.");
        }
        return (y2 - y1) / (x2 - x1);
    }

    public static void main(String[] args) {
        double x1 = 3.0, y1 = 2.0;
        double x2 = 6.0, y2 = 6.0;

        double distance = calculateDistance(x1, y1, x2, y2);
        double slope = calculateSlope(x1, y1, x2, y2);

        System.out.printf("La distancia entre los dos puntos (%.2f, %.2f) y (%.2f, %.2f) es: %.2f%n", x1, y1, x2, y2, distance);
        System.out.printf("La pendiente de la recta que une los dos puntos es: %.2f%n", slope);
    }
}