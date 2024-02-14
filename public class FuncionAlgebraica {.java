public class FuncionAlgebraica {

        // Método estático que calcula el valor de la función algebraica f(x, y) = x^2 + 2xy + y^2
        public static double calcularFuncion(double x, double y) {
            return x * x + 2 * x * y + y * y;
        }
    
        public static void main(String[] args) {
            // Ejemplo de uso
            double x = 3.0;
            double y = 4.0;
    
            // Llamando al método para calcular el valor de la función
            double resultado = calcularFuncion(x, y);
    
            // Mostrando el resultado
            System.out.println("El resultado de la función para x = " + x + " y y = " + y + " es: " + resultado);
        }
    }