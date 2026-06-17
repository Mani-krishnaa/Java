package OOPS;

class Anoo {
    public void showw() {
        System.out.println("In a show");
    }
}
// class Anooo extends Anoo {
// public void showw() {
// System.out.println("In B show");
// }
// }

class AnonymousInnerClass {

    public static void main(String[] args) {

        Anoo anoo = new Anoo() {
            public void showw() { // this is the inner class, instead of creating method on top, while creating
                                  // oblect we can create a method, here there is no class keyword only method is
                                  // there, thats why it is a inner class

                System.out.println("In B show");
            }

        };
        anoo.showw();

    }

}
