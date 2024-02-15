import java.util.Random;

public class MayorNumero {
    public static void main(String[] args) {
        int num1 = generateRandomNumber();
        int num2 = generateRandomNumber();

        int maxNumber = getMaxNumber(num1, num2);
        System.out.println("The maximum number between " + num1 + " and " + num2 + " is: " + maxNumber);
    }

    public static int getMaxNumber(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }
}