package patterns;

import java.util.*;
public class AdvPattern5{
    public static void pattern(int n){
        for(int i=1; i<=n;i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2 ==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
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