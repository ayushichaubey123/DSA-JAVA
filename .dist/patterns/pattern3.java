package patterns;

import java.util.*;
public class pattern3{
    public static void pattern(int n){
        for (int i=1 ; i<=n ; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        System.out.println("enter the lines in patter:");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        pattern(n);
        sc.close();
    }
}