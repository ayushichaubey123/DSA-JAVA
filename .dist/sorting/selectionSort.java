import java.util.*;

public class selectionSort {
    public static int[] sort(int[] array){

        for(int i=0; i<array.length-1; i++){
            int minPos=i;
            for(int j=i+1; j<array.length; j++){
                if(array[minPos]>array[j]){
                    minPos=j;
                }
            }
            int temp= array[minPos];
            array[minPos]=array[i];
            array[i]= temp;
        }
        return array;
    }

    public static void main(String agrs[]){
        System.out.println("Enter the number of elements: ");
        Scanner sc= new Scanner(System.in);
        int a =sc.nextInt();
        int array[]=new int[a];
        for(int i=0; i<a;i++){
            System.out.println("enter the "+i+"element: ");
            array[i]=sc.nextInt();
        }

        int[] results = sort(array);
        for(int i=0; i<array.length;i++){
            System.out.print(results[i]+", ");
        }
    }
}