package arrays;

import java.util.*;

public class reverse{
    public static int[] reverse(int array[]){
        int start=0;
        int end= array.length -1;
        while (start < end){
            int temp=  array[start];
            array[start]= array[end] ;
            array[end] =temp;
            start +=1;
            end -=1;
        }

        return array;
    }

    public static void main(String args[]) {
        System.out.println("how many elements you want to enter: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int j = 0; j < n; j++) {
            System.out.println("enter the number:");
            int a = sc.nextInt();
            array[j] = a;
        }
        int results[] = reverse(array);
        for(int i=0; i< array.length; i++ ){
            System.out.print(results[i] +" ");
        }

    }
}
