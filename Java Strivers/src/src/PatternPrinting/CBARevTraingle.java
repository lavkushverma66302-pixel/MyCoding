package PatternPrinting;

import java.util.Scanner;

public class CBARevTraingle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Lines: ");
        int n=sc.nextInt();
        for(int i=n;i>0;i--){
            char ch=(char)('A'+n-1);
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch--;
            }
            System.out.println();
        }
    }
}
