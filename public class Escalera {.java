public class Escalera {
    public static void main(String[] args) {
        double alturaLadder = 5.0;
        double angulo = Math.toRadians(70.0);

        double longitudLadder = calcularLongitudLadder(alturaLadder, angulo);
        System.out.println("La longitud de la escalera es: " + longitudLadder);
    }

    public static double calcularLongitudLadder(double altura, double angulo) {
        double longitud = altura / Math.sin(angulo);
        return longitud;
    }
}