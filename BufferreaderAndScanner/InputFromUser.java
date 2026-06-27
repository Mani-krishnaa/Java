package BufferreaderAndScanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class InputFromUser {
    public static void main(String[] args) throws NumberFormatException, IOException {
        System.out.println("Enter a number");

        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);

        // The above is the old way

        // Now with scanner class
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(num);

        sc.close();

    }

}