package sorting;

import java.util.*;

public class bubbleSort{

    public static int[] sort(int[] array){
        for(int i=0; i<array.length-1; i++){
            for(int j=0; j<array.length-1-i; j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        return array;
    }

    public static void main(String args[]){
        System.out.println("how many elements you want to enter: ");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int array[]= new int[n];
        for(int j=0;j<n;j++){
            System.out.println("enter the number:");
            int a= sc.nextInt();
            array[j]=a;
        }

        int[] results= sort(array);
        for(int i=0; i< array.length; i++ ){
            System.out.print(results[i] +" ");
        }
    }
}
