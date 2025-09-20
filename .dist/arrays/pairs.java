package arrays;

import java.util.*;

public class pairs{

    public static void pair(int array[]){
        int tp=0;

        for (int i=0; i< array.length; i++){
            int current = array[i];
            for (int j= i+1; j<array.length; j++){
                System.out.print("[" +current +"," +array[j]+ "] ;");
                tp += 1;

            }
            System.out.println();
    }

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
        pair(array);
    }
}