public class OperacionArtimetica {
    public static void main(String[] args) {
        int num1 = 16;
        int num2 = 3;

        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicacion: " + (num1 * num2));
        System.out.println("Exponencial: " + Math.pow(num1, num2));
        System.out.println("Division: " + (num1 / (double)num2));
    }
}