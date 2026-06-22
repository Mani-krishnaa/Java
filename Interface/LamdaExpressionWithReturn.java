package Interface;

@FunctionalInterface
interface LambaExpressionWithReturn {

    int show(int i, int j);

}

class Demo {
    public static void main(String[] args) {
        LambaExpressionWithReturn obj = (i, j) -> i + j; // return statement also we can remove
        int res = obj.show(30, 10);
        System.out.println(res);
    }
}