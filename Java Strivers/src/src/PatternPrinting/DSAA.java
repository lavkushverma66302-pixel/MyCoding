package PatternPrinting;

import java.util.Scanner;

public class DSAA {
    public static void menu() {
        System.out.println("Enter 1 to perform operation: ");
        System.out.println("Enter 0 to exit: ");
    }
    public static void logic(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        System.out.println("Enter character:");
        char ch = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                count++;
            }
        }
        System.out.println(ch + " occurence: " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menu();
        int n = sc.nextInt();
        sc.nextLine();
        while (n != 0) {
            logic();
            menu();
            n = sc.nextInt();

        }
    }
}
