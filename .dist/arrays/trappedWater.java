package arrays;

import java.util.*;

public class trappedWater{
    public static int rainWater(int height[]){

        int width=1;

        int leftMax[]=new int[height.length];
        leftMax[0] = height[0];
        for (int i=1; i< height.length; i++){
            leftMax[i]= Math.max(height[i], leftMax[i-1]);
        }

        int rightMax[]=new int[height.length];
        rightMax[height.length -1] = height[height.length -1];
        for (int i=height.length -2; i>=0; i--){
            rightMax[i]= Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater=0;
        for(int i=0; i<height.length ;i++){
            int waterlevel= Math.min(leftMax[i], rightMax[i]);
            trappedWater += (waterlevel-height[i]) * width;
        }

        return trappedWater;
    }

    public static void main(String args[]) {
        System.out.println("how many heights you want to enter: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int j = 0; j < n; j++) {
            System.out.println("enter the height" + j + ":");
            int a = sc.nextInt();
            array[j] = a;
        }

        int a= rainWater(array);
        System.out.println("the resulted trapped water is: "+ a);
    }
}