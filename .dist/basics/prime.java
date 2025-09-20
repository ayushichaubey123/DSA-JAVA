package basics;

import java.util.*;
public class prime{
    public static Boolean check(int n){
        boolean isPrime= true;
        for(int i=2; i<= n-1 ;i++){
            if (n % i==0){
                isPrime= false;
            }
        }
        return isPrime;
    }
    public static void range(int s, int e){
        for(int i=s; i<= e;i++){
            boolean a= check(i);
            if(a){
                System.out.println(i);
            }else{
                continue;
            }
        }
    }
    public static void main(String args[]){
        System.out.println("you want to check for a number (1) or you want to check primes in a range (2):");
        Scanner sc = new Scanner(System.in);
        int c= sc.nextInt();
        if(c==1){
            System.out.println("enter the number you want to check for: ");
            int n= sc.nextInt();
            boolean result= check(n);
            System.out.println(result);
        }else if(c==2){
            System.out.println("enter the starting range: ");
            int s= sc.nextInt();
            System.out.println("enter the ending range: ");
            int e= sc.nextInt();
            range(s,e);
        }

        sc.close();
    }
}