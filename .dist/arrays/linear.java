package arrays;

import java.util.*;

public class linear{
    public static int linearSearch(int array[], int key){
        for(int i=0;i<array.length;i++){
            if(array[i]==key){
                return i;
            }
        }
        return -1;
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
        System.out.println("enter the element you want to search for: ");
        int key= sc.nextInt();
        int index= linearSearch(array,key);
        if(index==-1){
            System.out.println("The key not found!!");
        }else{
            System.out.println("The index of the key in given array is : "+ index);
        }
    }
}