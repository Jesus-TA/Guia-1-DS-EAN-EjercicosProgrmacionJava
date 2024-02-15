public class CirculoCorona {
    public static void main(String[] args) {
        double radioPequeño = 2.0; // example value for the smaller radius
        double radioGrande = 4.0; // example value for the larger radius

        double areaCirculo = calcularAreaCirculo(radioPequeño);
        double areaCorona = calcularAreaCorona(radioGrande, radioPequeño);

        System.out.println("El área del círculo con radio " + radioPequeño + " es: " + areaCirculo);
        System.out.println("El área de la corona circular con radios " + radioGrande + " y " + radioPequeño + " es: " + areaCorona);
    }

    public static double calcularAreaCirculo(double radio) {
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    public static double calcularAreaCorona(double radioGrande, double radioPequeño) {
        double areaCorona = calcularAreaCirculo(radioGrande) - calcularAreaCirculo(radioPequeño);
        return areaCorona;
    }
}