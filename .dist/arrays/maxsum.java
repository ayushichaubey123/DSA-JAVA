package arrays;

import java.util.Scanner;

public class maxsum{

    public static void subArray(int array[]){
        int maxS= Integer.MIN_VALUE;


        for (int i=0; i<array.length; i++){
            int current = array[i];
            for(int j =i+1; j<array.length; j++){
                int sum=0;
                for(int k= i; k<= j; k++){
                    System.out.print(array[k]+",");
                    sum +=array[k];
                }
                System.out.print(" => sum: "+ sum+" ;");
                System.out.println();

                if(maxS<sum){
                    maxS= sum;
                }

            }
            System.out.println();
        }

        System.out.println("Maximum sum: "+maxS);
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
        subArray(array);
    }
}