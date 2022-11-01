public class Variables {
    // Static methods can only work with static variables
    // Variables declared in the class level have a default value is assigned to it
    static int hour = 10;

    public static void main(String[] args) {
        int age = 15;

        // A variable declaration inside the method overrides the default value of the
        // class level variable
        int hour = 50;

        System.out.println(age + " - " + hour);
    }
}
