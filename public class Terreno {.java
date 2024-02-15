public class Terreno {

    public static double rectangleArea(double base, double height) {
        return base * height;
    }

    public static double triangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static double hipotenusa(double catetoA, double catetoB) {
        return Math.sqrt(catetoA * catetoA + catetoB * catetoB);
    }

    public static double perimeter(double sideA, double sideB, double sideC, double hipotenusa) {
        return sideA + sideB + sideC + hipotenusa;
    }

    public static void main(String[] args) {
        double sideA = 16.0;
        double sideB = 8.0;
        double sideC = 2.0;

        double base = sideB;
        double height = sideC;
        double rectangleArea = rectangleArea(base, height);
        System.out.println("El área del rectángulo es: " + rectangleArea);

        base = sideB;
        height = sideA - sideC;
        double triangleArea = triangleArea(base, height);
        System.out.println("El área del triángulo es: " + triangleArea);

        double hipotenusa = hipotenusa(sideA, sideB);
        double perimeter = perimeter(sideA, sideB, sideC, hipotenusa);
        System.out.println("El perímetro del terreno es: " + perimeter);

        double totalArea = rectangleArea + triangleArea;
        System.out.println("El área total del terreno es: " + totalArea);
    }
}