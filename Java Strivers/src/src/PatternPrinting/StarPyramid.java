package PatternPrinting;

import java.util.Scanner;

public class StarPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of lines: ");
        int n = sc.nextInt();

        for (int i = n; i> 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for(int k=0;k<2*(n-i)+1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
