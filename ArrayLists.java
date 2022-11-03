import java.util.ArrayList;
import java.util.Comparator;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(6);
        numbers.add(5);
        numbers.add(4);
        numbers.add(3);
        numbers.add(7);

        numbers.remove(6);
        numbers.remove(Integer.valueOf(6));

        System.out.println(numbers.toString());
        System.out.println(numbers.get(0));
        System.out.println(numbers.size());
        System.out.println(numbers.contains(Integer.valueOf(1)));

        numbers.set(0, Integer.valueOf(50));
        System.out.println(numbers.toString());

        numbers.sort(Comparator.reverseOrder());
        System.out.println(numbers.toString());

        numbers.sort(Comparator.naturalOrder());
        System.out.println(numbers.toString());

        System.out.println("For each loop");

        numbers.forEach((number) -> {
            numbers.set(numbers.indexOf(number), Integer.valueOf(number *= 2));
            System.out.printf("Number: %d - Index: %d\n", number, numbers.indexOf(number));
        });

        System.out.println("End for each loop");

        System.out.println(numbers.toString());

        numbers.clear();

        System.out.println(numbers.toString());

        System.out.println(numbers.isEmpty());

    }
}
