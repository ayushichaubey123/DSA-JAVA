package basics;

import java.util.*;
public class decToBin{
    public static int convert(int n){
        int dec=0;
        int pow=0;
        while(n>0){
            int rem= n%2;
            dec=dec + (rem * (int)Math.pow(10,pow));
            pow++;

            n=n/2;
        }

        return dec;
    }
    public static void main(String args[]){
        System.out.println("enter the number in decimal:");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int result = convert(n);
        System.out.println("Binary number of the following is "+result);
        sc.close();
    }
}