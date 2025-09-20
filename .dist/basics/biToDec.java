package basics;

import java.util.*;
public class biToDec{
    public static int convert(int n){
        int dec=0;
        int pow=0;
        while(n>0){
            int last= n%10;
            dec=dec + (last * (int)Math.pow(2,pow));
            pow++;

            n=n/10;
        }

        return dec;
    }
    public static void main(String args[]){
        System.out.println("enter the number in basics.binary:");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int result = convert(n);
        System.out.println("Decimal number of the following is "+result);
        sc.close();
    }
}