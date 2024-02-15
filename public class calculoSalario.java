import java.util.Scanner;

public class calculoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el sueldo actual del empleado: ");
        double salario = scanner.nextDouble();
        double aumento = calcularAumento(salario);
        double nuevoSalario = salario + aumento;
        System.out.println("El valor del aumento es: " + aumento);
        System.out.println("El nuevo salario del empleado es: " + nuevoSalario);
    }

    public static double calcularAumento(double salario) {
        if (salario <= 800000) {
            return salario * 0.10;
        } else if (salario > 800000 && salario <= 1200000) {
            return salario * 0.08;
        } else {
            return salario * 0.05;
        }
    }
}
