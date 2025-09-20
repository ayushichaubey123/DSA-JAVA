import java.util.*;

public class question3{

    public static int rainWater(int[] heights){

        int width=1;
        int leftMax[]=new int[heights.length];
        leftMax[0]= heights[0];
        for (int i=1; i<heights.length; i++){
            leftMax[i]=Math.max(leftMax[i-1], heights[i]);
        }

        int rightMax[]=new int[heights.length];
        rightMax[heights.length-1]= heights[heights.length-1];
        for (int i=heights.length-2; i>=0; i--){
            rightMax[i]=Math.max(rightMax[i+1], heights[i]);
        }
        int waterTrapped = 0 ;
        for (int i=0; i<heights.length; i++){
            int waterlevel= Math.min(leftMax[i], rightMax[i]);
            waterTrapped += (waterlevel -heights[i]) * width;
        }

        return waterTrapped;
    }

    public static void main(String args[]){
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