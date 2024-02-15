public class calculoSalones {
    public static void main(String[] args) {
        int numEstudiantes = 2000; // example number of students
        int capacidadSalon = 50; // example capacity of a room
        int numSalonesPiso = 10; // example number of rooms per floor

        int numSalones = calcularNumSalones(numEstudiantes, capacidadSalon);
        int numPisos = calcularNumPisos(numSalones, numSalonesPiso);

        System.out.println("Número de salones: " + numSalones);
        System.out.println("Número de pisos: " + numPisos);
    }

    public static int calcularNumSalones(int numEstudiantes, int capacidadSalon) {
        return (int) Math.ceil((double) numEstudiantes / capacidadSalon);
    }

    public static int calcularNumPisos(int numSalones, int numSalonesPiso) {
        return (int) Math.ceil((double) numSalones / numSalonesPiso);
    }
}