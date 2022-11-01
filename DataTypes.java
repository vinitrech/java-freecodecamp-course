public class DataTypes {
    public static void main(String[] args) {
        // integer types
        byte aSingleByte = 100; // -128 to 127
        short aSmallNumber = 200; // -32,768 to 32,767
        int anInteger = 2315166; // -2147483648 to 214748367
        long aLargeNumber = 651561615L; // -9223372036854775808 to 9223372036854775807 - if the letter is not present at
                                        // the end, the compiler will treat the variable as Int.

        // decimal types
        double aDouble = 1.684949;
        float aFloat = 3.402F; // if the letter is not present at the end, the compiler will treat the variable
                               // as Double.

        // booleans
        boolean trueBoolean = true;
        boolean falseBoolean = false;

        // characters
        char copyrightSymbol = '\u00A9';

        System.out.println(aSingleByte + " - " + aSmallNumber + " - " + anInteger + " - " + aLargeNumber + " - "
                + aDouble + " - " + aFloat + " - " + trueBoolean + " - " +
                falseBoolean + " - " + copyrightSymbol);
    }
}
