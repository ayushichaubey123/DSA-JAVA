import java.util.*;

class negativeKadanes {
    public static int maxSubArray(int[] nums) {
        int cs=0;
        int ms=Integer.MIN_VALUE;
        boolean isNegative=false;
        int neg=0;
        for(int i=0; i<nums.length;i++){
            if (nums[i]<0){
                neg +=1;
            }else{
                break;
            }
        }
        if (neg==nums.length){
            isNegative= true;
        }


        for(int i=0; i<nums.length; i++){
            if(isNegative==true){
                cs=nums[i];
                ms=Math.max(ms,cs);
            }
            else{
                cs+= nums[i];
                if (cs < 0){
                    cs=0;
                }
                ms = Math.max(cs,ms);
            }
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
        int result= maxSubArray(nums);
        System.out.println("the result is : "+result);
    }

}