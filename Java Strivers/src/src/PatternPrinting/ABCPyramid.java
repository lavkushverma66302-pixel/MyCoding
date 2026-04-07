package PatternPrinting;

import java.util.Scanner;

public class ABCPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>0;i--){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            char ch='A';
            for (int j=1;j<=n-i+1;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
