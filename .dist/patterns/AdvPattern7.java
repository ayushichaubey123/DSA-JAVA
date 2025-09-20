package patterns;

import java.util.*;
public class AdvPattern7{
    public static void rhombus(int n){
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        System.out.println("Enter the rows required: ");
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        rhombus(n);
        sc.close();
    }
}