package patterns;

import java.util.*;
public class pattern4{
    public static void pattern(int n){
        char ch='A';
        for(int i=1; i<=n ; i++){
            for(int j=1 ;j<=i ;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        return;
    }
    public static void main(String args[]){
        System.out.println("enter the number of lines in the pattern 1:");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        pattern(n);
        sc.close();
    }
}