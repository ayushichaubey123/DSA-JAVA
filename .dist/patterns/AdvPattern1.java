package patterns;

import java.util.*;
public class AdvPattern1{
    public static void pattern(int n,int m){
        for(int i=1; i<=n ; i++){
            for(int j=1 ;j<=m ;j++){
                if(i==1|| i==n || j==1 || j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        return;
    }
    public static void main(String args[]){
        System.out.println("enter the length:");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("enter the breadth:");
        int m= sc.nextInt();
        pattern(n,m);
        sc.close();
    }
}