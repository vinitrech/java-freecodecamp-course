public class ConditionalStatements {
    public static void main(String[] args) {
        boolean bool = true;
        int one = 1;

        if (bool) {

        } else if (!bool) {

        } else {

        }

        switch (one) {
            case 1:
                System.out.println("Is one");
                break;
            default:
                System.out.println("Default");
        }

    }
}
