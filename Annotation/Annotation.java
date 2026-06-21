package Annotation;

class Annotation {

    public void mani() {
        System.out.println("Hello Mani");
    }
}

class InnerAnnotation extends Annotation {

    @Override
    public void mani() {
        System.out.println("Hello Moni");
    }
}

class Demo {
    public static void main(String[] args) {
        InnerAnnotation i = new InnerAnnotation();
        i.mani();
    }
}
