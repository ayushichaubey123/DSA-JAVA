import java.util.*;

public class question4
{
     public static int[] triple(int[] array){

         int[] output= new int[3];
         for (int i=0; i< array.length; i++){
             for(int j=i+1; j<array.length; j++){
                 for(int k=j+1; k<array.length; k++){
                     if(array[i]!=array[j] || array[i]!=array[k] || array[j]!=array[k]){
                         if (array[i]+ array[j]+ array[k]==0){
                             output[0]=array[i];
                             output[1]=array[j];
                             output[2]=array[k];

                             return output;
                         }
                     }
                 }
             }
         }
         return output;
     }

     public static void main(String args[]) {
         System.out.println("Enter the numeber of elements you want to enter:");
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int array[] = new int[n];
         for (int j = 0; j < n; j++) {
             System.out.println("enter the element" + j + ":");
             int a = sc.nextInt();
             array[j] = a;
         }

         int[] results = triple(array);
         for(int i=0; i< array.length; i++ ){
             System.out.print(results[i] +" ");
         }
     }
}