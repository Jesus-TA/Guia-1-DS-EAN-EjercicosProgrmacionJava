public class Hermanos {
    public static void main(String[] args) {
        String[][] hermanos = {{"Juan", "25"}, {"Pedro", "22"}, {"Maria", "28"}};
        ordenarHermanosPorEdad(hermanos);
        imprimirHermanosOrdenados(hermanos);
    }

    public static void ordenarHermanosPorEdad(String[][] hermanos) {
        for (int i = 0; i < hermanos.length; i++) {
            for (int j = 0; j < hermanos.length - 1 - i; j++) {
                int edad1 = Integer.parseInt(hermanos[j][1]);
                int edad2 = Integer.parseInt(hermanos[j + 1][1]);
                if (edad1 < edad2) {
                    String[] temp = hermanos[j];
                    hermanos[j] = hermanos[j + 1];
                    hermanos[j + 1] = temp;
                }
            }
        }
    }

    public static void imprimirHermanosOrdenados(String[][] hermanos) {
        for (String[] hermano : hermanos) {
            System.out.println("El nombre del hermano es: " + hermano[0] + " y su edad es: " + hermano[1]);
        }
    }
}