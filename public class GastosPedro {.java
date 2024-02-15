public class GastosPedro {
    public static void main(String[] args) {
        double sueldo = 2000.0; // example salary value

        double gastoArriendo = calcularGastoArriendo(sueldo);
        double gastoComida = calcularGastoComida(sueldo);
        double dineroRestante = sueldo - gastoArriendo - gastoComida;

        System.out.println("Gasto en arriendo: " + gastoArriendo);
        System.out.println("Gasto en comida: " + gastoComida);
        System.out.println("Dinero restante: " + dineroRestante);
    }

    public static double calcularGastoArriendo(double sueldo) {
        double gastoArriendo = sueldo * 0.4;
        return gastoArriendo;
    }

    public static double calcularGastoComida(double sueldo) {
        double gastoComida = sueldo * 0.15;
        return gastoComida;
    }
}