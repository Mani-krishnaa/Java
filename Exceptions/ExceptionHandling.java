package Exceptions;

class ExceptionHandling {

    public static void main(String[] args) {
        int i = 0;
        int j = 8;
        int nums[] = new int[5];


        try {
            System.out.println(nums[8]);
            int k = j / i;
            System.out.println(k);


        } catch (Exception e) {
            System.out.println("We cant divide any num with Zero " + e);

        }

    }

}
