package patterns;

import java.util.Scanner;

public class AdvPattern9{
    public static void diamond(int n){
        for (int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }

            System.out.println();
        }
        for (int i=n;i>=1;i--){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void main(String args[]){
        System.out.println("enter the length: ");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        diamond(n/2);
        sc.close();
    }
}
