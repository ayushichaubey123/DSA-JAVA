package patterns;

import java.util.*;
public class AdvPattern4{
    public static void Floyd(int n){
        int num=1;
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        System.out.println("Enter the number of rows: ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        Floyd(n);
        sc.close();
    }
}