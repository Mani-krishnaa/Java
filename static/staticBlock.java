class staticBlock {

    int num;
    String brand;
    static String name;

    static {
        name = "Phone";
        System.out.println("In Static block");
    }

    public staticBlock() {
        brand = "";
        num = 12;
        System.out.println("In constructor");

    }

    public void show() {
        System.out.println(num + " " + name);
    }

    class staticBlock1 {
        public static void main(String[] args) {

            staticBlock sb = new staticBlock();
            sb.num = 12;
            staticBlock.name = "mani";
            staticBlock sb1 = new staticBlock();


        }
    }
}
