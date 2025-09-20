import java.util.*;

public class spiralMatrix {
    public static void matrix(int[][] nums){
        int startCol=0;
        int startRow=0;
        int endRow=nums.length -1;
        int endCol=nums[0].length -1;

        while(startRow<=endRow && startCol <= endCol){
            for(int i=startCol; i<=endCol; i++){
                System.out.println(nums[startRow][i]);
            }
            for(int j=startRow+1; j<=endRow; j++){
                System.out.println(nums[j][endCol]);
            }
            for(int i=endCol-1; i>=startCol; i--){
                System.out.println(nums[endRow][i]);
            }
            for(int j=endRow-1; j>startRow; j--){
                System.out.println(nums[j][startCol]);
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
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