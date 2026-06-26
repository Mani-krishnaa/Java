package Exceptions;

class ManiExceptions extends Exception {
    public ManiExceptions(String message) {
        super(message);
    }
}

class customExceptions {

    static int divide(int numerator, int denominator) throws ManiExceptions {
        if (denominator < 0) {
            throw new ManiExceptions("Denominator cannot be negative: " + denominator);
        }
        return numerator / denominator;
    }

    public static void main(String[] args) {
        int i = 0;
        int j = 2;
        int k = 0;

        // Catching a built-in exception
        try {
            k = j / i;
            System.out.println("Result: " + k);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

        // Catching a custom exception
        try {
            k = divide(j, -1);
            System.out.println("Result: " + k);
        } catch (ManiExceptions e) {
            System.out.println("Caught ManiExceptions: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }

}