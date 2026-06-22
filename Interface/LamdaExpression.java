package Interface;

interface InnerLamdaExpression {

    void show(int i);
}

public class LamdaExpression {
    public static void main(String[] args) {

        /*
         * Instead of writing a full anonymous class like:
         *
         *
         * InnerLamdaExpression obj = new InnerLamdaExpression() {
         * public void show(int i) {
         * System.out.println("With Lamda " + i);
         * }
         * };
         */

        InnerLamdaExpression obj = i -> System.out.println("With Lamda " + i);
        obj.show(5);
    }

}

/*


*/