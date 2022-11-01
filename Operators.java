public class Operators {
    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 2;

        // Arithmetic operators
        System.out.println(number1 + number2);
        System.out.println(number1 - number2);
        System.out.println(number1 * number2);
        System.out.println(number1 / number2); // Int divided by Int is always equal to Int. Int and double, or double
                                               // and double is always double.
        System.out.println(number1 % number2);
        System.out.println(number1++);// Change the value after printing.
        System.out.println(number1--);// Change the value after printing.
        System.out.println(++number1);// Change the value before printing.
        System.out.println(--number1);// Change the value before printing.

        // Relational operators
        System.out.println(number1 == number2);
        System.out.println(number1 > number2);
        System.out.println(number1 < number2);
        System.out.println(number1 >= number2);
        System.out.println(number1 <= number2);
        System.out.println(number1 != number2);

        // Logical operators
        System.out.println(number1 > 10 && number2 < 20);
        System.out.println(number1 > 10 || number2 < 20);
        System.out.println(!(number1 > 10));

    }
}
