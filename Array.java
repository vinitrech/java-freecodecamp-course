import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        char vowels[] = new char[5];
        char vowels2[] = { 'a', 'e', 'i', 'o', 'u' };

        vowels[0] = 'u';
        vowels[1] = 'a';
        vowels[2] = 'i';
        vowels[3] = 'e';
        vowels[4] = 'o';

        System.out.println(Arrays.toString(vowels));
        System.out.println(Arrays.toString(vowels2));
        System.out.println(vowels.length);

        Arrays.sort(vowels);
        System.out.println(vowels);

        System.out.println(Arrays.binarySearch(vowels, 'o')); // If the search fails, it will give a negative result.

        Arrays.fill(vowels, 'x');
        System.out.println(vowels);

        // Arrays are reference types, if you assign an array to another variable, it
        // will point to the original array. You need to use Arrays.copyOf() instead.

        int numbers1[] = { 1, 2, 3, 4, 5 };
        int numbers2[] = Arrays.copyOf(numbers1, numbers1.length);

        System.out.println(Arrays.toString(numbers1));
        System.out.println(Arrays.toString(numbers2));

        System.out.println(numbers1 == numbers2);// Direct comparison of arrays doesn't work as expected, similar to
                                                 // Strings, the variables point to different places, so it gives false
                                                 // even if the arrays are identical. You should use
                                                 // Arrays.equals() instead
        System.out.println(Arrays.equals(numbers1, numbers2));
    }

}
