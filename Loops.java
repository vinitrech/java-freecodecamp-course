public class Loops {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println();

        int numbers[] = { 1, 2, 3, 4, 5 };

        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
        }

        System.out.println();

        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println();

        int counter = 0;

        while (counter < 10) {
            System.out.println(counter);
            counter++;
        }

        System.out.println();

        int counter2 = 0;

        do {
            System.out.println(counter2);
            counter2++;
        } while (counter2 < 10);

    }
}
