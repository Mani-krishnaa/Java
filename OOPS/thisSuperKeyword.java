package OOPS;

class thisSuperKeyword  extends Object{
    public thisSuperKeyword() {
        System.out.println("thisSuperKeyword");
    }
      public thisSuperKeyword(int a) {
        this();
        System.out.println("thisSuperKeyword " + a);
    }

}

class thisSuperKeywords extends thisSuperKeyword {

    public thisSuperKeywords() {
        super(90);

        System.out.println("thisSuperKeywords");
    }

    public thisSuperKeywords(int a) {
        this();
        System.out.println("Parameterized Constructor" + " " + a);
    }
}

class mani {
    public static void main(String[] args) {
        thisSuperKeywords mk = new thisSuperKeywords(9);
    }
}
