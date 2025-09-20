package patterns;

import java.util.*;
public class AdvPattern2{
    public static void pattern(int n){
        for(int i=1; i<=n;i++){
            for(int j=1; j<=n; j++){
                if(i+j >n){
                    System.out.print("$");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        System.out.println("enter the length: ");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        pattern(n);
        sc.close();
    }
}