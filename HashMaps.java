import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<Integer, String> numbers = new HashMap<Integer, String>();

        numbers.put(4, "Number four");
        numbers.put(3, "Number three");
        numbers.put(2, "Number two");
        numbers.put(5, "Number five");
        numbers.put(1, "Number one");

        numbers.forEach(
                (key, value) -> {
                    numbers.replace(key, value + " - UPDATED");
                });

        System.out.println(numbers.toString());
        System.out.println(numbers.get(4));

        numbers.putIfAbsent(1, "Number one");
        numbers.replace(1, "Number one updated");
        System.out.println(numbers.toString());
        System.out.println(numbers.getOrDefault(15, "Doesn't exist in the hashmap"));

        numbers.remove(2);
        System.out.println(numbers.toString());

        System.out.println(numbers.containsKey(3));
        System.out.println(numbers.containsValue("Number three"));

        numbers.clear();
        System.out.println(numbers.toString());
        System.out.println(numbers.isEmpty());
        System.out.println(numbers.size());
    }
}
