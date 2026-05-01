package arrays;

class MultiDimensionalArray {
    public static void main(String a[]) {
        int nums[][] = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int a1[] : nums) {
            for (int m : a1) {
                System.out.print(m + " ");
            }
            System.out.println();

        }
    }
}