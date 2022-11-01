public class Strings {
    public static void main(String[] args) {
        String name = "Name";
        String name2 = new String("Name 2");

        // New strings always allocate new pool spaces,so 2 new string objects can have
        // the same value and still be different. Always prefer the literal syntax.

        System.out.println(name + " - " + name2);
        System.out.printf("Name 1: %s, and 2: %s - Integer: %d, Float: %f, Character: %c, B: %b\n", name,
                name2, 5, 10.0, '%', true);
        System.out.println(name.length() + " - Is empty: " + name.isEmpty());
        System.out.println("Name 1 is equal to name 2: " + name.equals(name2));
        System.out.println(name.replace("Name", "John")); // replace returns a new string, not changing the original
        System.out.println(name.contains("Name"));
    }
}
