package AshishQuestions;

import java.util.Scanner;

public class DSA1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to perform operation: ");
        System.out.println("Enter 0 to exit: ");
        int n = sc.nextInt();
        while (n != 0) {
            System.out.println("Enter String: ");
            sc.nextLine();
            String str = sc.nextLine();
            System.out.println("Enter Characters in form of String to find occurence of each character: ");
            String ch = sc.nextLine();
            char[] arr = ch.toCharArray();

            for (int i = 0; i < arr.length; i++) {
                int count = 0;
                for (int j = 0; j < str.length(); j++) {
                    if (arr[i] == str.charAt(j)) {
                        count++;
                    }
                }
                System.out.println(arr[i] + " Occurence: " + count);
            }
            System.out.println("Enter 1 to perform operation: ");
            System.out.println("Enter 0 to exit: ");
            n = sc.nextInt();
        }
    }
}
