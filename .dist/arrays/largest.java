package arrays;

import java.util.*;

public class largest{
    public static int largestInArray(int array[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(max<array[i]){
                max=array[i];
            }
        }
        return max;
    }

    public static void main(String args[]){
        System.out.println("how many elements you want to enter: ");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int array[]=new int[n];
        for(int j=0;j<n;j++){
            System.out.println("enter the number:");
            int a = sc.nextInt();
            array[j]=a;
        }
        int result=largestInArray(array);
        System.out.println("The arrays.largest in array is: "+ result);
    }
}