package basics;

import java.util.Scanner;

public class prefixSum{

    public static void prefixSum(int array[]){
        int maxS= Integer.MIN_VALUE;

        int prefix[] = new int[array.length];
        prefix[0] = array[0];
        for(int p=1; p<prefix.length; p++){
            prefix[p]= prefix[p-1] +array[p];
        }

        for (int i=0; i<array.length; i++){
            int current = array[i];
            int sum=0;

            for(int j =i; j<array.length; j++) {
                if(i>0){
                    sum = prefix[j] - prefix[i - 1];
                }else{
                    sum= prefix[j]-prefix[i];
                }
            }
            if (maxS<sum){
                maxS=sum;
            }
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
        prefixSum(array);

    }
}