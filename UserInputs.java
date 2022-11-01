import java.util.Scanner;

public class UserInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = scanner.nextLine();

        System.out.println("Your name is: " + name + ". How old are you?");
        int age = scanner.nextInt();
        String name2 = scanner.nextLine(); // Nextline will skip the prompt, because nextInt takes the int, and leave
                                           // an "enter" in the buffer, wich gets allocated to nextLine, falsely
                                           // triggering it.

        // One solution is to use a nextLine() always after any other scanner, to clear
        // the buffer. Or you could use only nextLine() and then convert from string to
        // the desired format

        System.out.println("Your age is: " + age + " - Name2: " + name2);

        String conversion = scanner.nextLine();
        double value = Double.parseDouble(conversion);

        System.out.println(value);

        scanner.close();
    }
}
