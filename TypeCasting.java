public class TypeCasting {
    public static void main(String[] args) {
        // Implicit type casting IF POSSIBLE (if conversion causes loss of any data,
        // decimal cases for example).
        int number1 = 5;
        double number2 = number1;

        // Explicit conversion
        double number3 = 5.0;
        int number4 = (int) number3;

        System.out.println(number1 + " - " + number2 + " - " + number3 + " - " + number4);
    }
}
