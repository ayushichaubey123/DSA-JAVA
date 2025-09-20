package basics;

import java.util.*;
public class palindrome{
    public static boolean check(int n){
        int dec=0;

        int i=n;
        boolean isPal= true;
        while(n>0){
            int lD= n%10;
            dec= (dec * 10) + lD;

            n=n/10;
        }
        if(dec==i){
            isPal=true;
        }else{
            isPal=false;
        }
        return isPal;
    }

    public static void main(String args[]){
        System.out.println("enter the number :");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        boolean a =check(n);
        System.out.println(a);
        sc.close();
    }
}