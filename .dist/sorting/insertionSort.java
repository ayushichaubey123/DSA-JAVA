import java.util.*;

public class insertionSort{

    public static int[] sort(int nums[]){
        for(int i=1; i<nums.length;i++){
            int curr= nums[i];
            int prev=i-1;

            while(prev>=0 && nums[prev]>curr){
                nums[prev] = nums[prev+1];
                prev--;
            }
            nums[prev+1]= curr;
        }
        return nums;
    }

    public static void main(String agrs[]){
        System.out.println("Enter the number of elements: ");
        Scanner sc= new Scanner(System.in);
        int a =sc.nextInt();
        int nums[]=new int[a];
        for(int i=0; i<a;i++){
            System.out.println("enter the "+i+"element: ");
            nums[i]=sc.nextInt();
        }

        int[] results = sort(nums);
        for(int i=0; i<nums.length;i++){
            System.out.print(results[i]+", ");
        }
    }
}

