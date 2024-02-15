public class numeroRomano {
    public static void main(String[] args) {
        int number = 23;

        if (number < 1 || number > 99 || number < 0) {
            System.out.println("Error: The number must be between 1 and 99, and cannot be negative.");
        } else {
            String tens = getTens(number / 10);
            String units = getUnits(number % 10);

            System.out.println(number + " in Roman numerals is: " + tens + units);
        }
    }

    private static String getTens(int number) {
        switch (number) {
            case 1:
                return "X";
            case 2:
                return "XX";
            case 3:
                return "XXX";
            case 4:
                return "XL";
            case 5:
                return "L";
            case 6:
                return "LX";
            case 7:
                return "LXX";
            case 8:
                return "LXXX";
            case 9:
                return "XC";
            default:
                return "";
        }
    }

    private static String getUnits(int number) {
        switch (number) {
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 6:
                return "VI";
            case 7:
                return "VII";
            case 8:
                return "VIII";
            case 9:
                return "IX";
            default:
                return "";
        }
    }
}