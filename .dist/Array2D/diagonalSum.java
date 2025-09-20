import java.util.*;

public class diagonalSum{
    public static int matrix(int[][] nums){
        int sum=0;
        int i=0;
        int n= nums.length;
        while(i<n){
            sum+=nums[i][i];
            i++;
        }
        int j=n-1-i;
        if(i!=j){
            sum+= nums[i][j];
        }

        return sum;
    }

    public static void main(String args[]){
        System.out.println("enter the number of row in matrix:");
        Scanner sc= new Scanner(System.in);
        int r= sc.nextInt();
        System.out.println("enter the number of column in matrix:");
        int c= sc.nextInt();
        int[][] nums= new int[r][c];

        for(int i=0; i<r;i++){
            for(int j=0; j<c;j++){
                System.out.println("enter the element in matrix:");
                nums[i][j]= sc.nextInt();
            }
        }


        matrix(nums);
    }
}