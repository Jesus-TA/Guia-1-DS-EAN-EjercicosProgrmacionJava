public class ElPaseo {
    public static void main(String[] args) {
        int capacidadBus = 50;
        int estudiantesGordos = 70;
        int estudiantesFlacos = 70;

        int numBuses = cantidadDeBuses(capacidadBus, estudiantesGordos, estudiantesFlacos);
        System.out.println("Se necesitan alquilar " + numBuses + " buses para llevar a todos los estudiantes.");
    }

    public static int cantidadDeBuses(int capacidadBus, int estudiantesGordos, int estudiantesFlacos) {
        int sillasOcupadasPorGordos = estudiantesGordos * 2;
        int sillasOcupadasTotales = sillasOcupadasPorGordos + estudiantesFlacos;
        int numBuses = sillasOcupadasTotales / capacidadBus;

        if (sillasOcupadasTotales % capacidadBus != 0) {
            numBuses++;
        }

        return numBuses;
    }
}