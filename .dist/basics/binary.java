package basics;

import java.util.*;

public class binary {
    public static int binarySearch(int array[], int key) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;

    }

    public static void main(String args[]) {
        System.out.println("how many elements you want to enter: ");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int array[]=new int[n];
        for(int j=0;j<n;j++){
            System.out.println("enter the number:");
            int a = sc.nextInt();
            array[j]=a;
        }
        System.out.println("Enter the key you want to search for: ");
        int key = sc.nextInt();
        int results = binarySearch(array, key);
        if (results == -1){
            System.out.println("The key not found!!");
        }
        else{
            System.out.println("The index of the given key is : "+results);
        }
    }
}