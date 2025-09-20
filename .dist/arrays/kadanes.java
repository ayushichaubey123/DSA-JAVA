package arrays;

import java.util.*;

public class kadanes{
    public static int kadanes(int nums[]){
        int ms=0;
        int cs=0;

        for (int i=0; i<nums.length; i++){
            cs += nums[i];
            if (cs<0){
                cs=0;
            }
            ms=Math.max(ms,cs);
        }
        return ms;
    }
    public static void main(String args[]) {
        System.out.println("how many elements you want to enter: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int j = 0; j < n; j++) {
            System.out.println("enter the number:");
            int a = sc.nextInt();
            nums[j] = a;
        }
        int result= kadanes(nums);
        System.out.println("the result is : "+result);
    }

}