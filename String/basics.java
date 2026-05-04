package String;

class Strings {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Mani");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("Krishna");



        System.out.println(sb);
    }
}