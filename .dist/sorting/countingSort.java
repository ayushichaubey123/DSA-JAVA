import java.util.*;

public class countingSort{

    public static int[] sort(int nums[]){
        int largest= Integer.MIN_VALUE;

        for(int i=1; i<nums.length;i++){
            largest= Math.max(largest, nums[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0; i<nums.length; i++){
            count[nums[i]]++;
        }
        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                nums[j]= i;
                j++;
                count[i]--;
            }
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

