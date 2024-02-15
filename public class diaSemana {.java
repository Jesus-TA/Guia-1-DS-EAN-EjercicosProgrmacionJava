import java.util.Scanner;

public class diaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el dia: ");
        String day = scanner.next().toLowerCase();
        String nextDay = getNextDay(day);
        System.out.println("Dia siguiente: " + nextDay);
    }

    public static String getNextDay(String day) {
        String[] days = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
        int index = -1;
        for (int i = 0; i < days.length; i++) {
            if (days[i].equals(day)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return "Dia Invalido";
        }
        index = (index + 1) % 7;
        return days[index];
    }
}