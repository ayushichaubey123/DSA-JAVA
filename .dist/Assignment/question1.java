import java.util.*;

public class question1 {

    public static boolean check(int[] array){
        boolean isRepeat= false;
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length;j++){
                if(array[j]==array[i]){
                    isRepeat= true;
                }
            }
        }

        return isRepeat;
    }

    public static void main(String args[]){
        System.out.println("Enter the numeber of elements you want to enter:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int j = 0; j < n; j++) {
            System.out.println("enter the element" + j + ":");
            int a = sc.nextInt();
            array[j] = a;
        }
        boolean results = check(array);
        System.out.println("The numbers are not unique: "+ results);
    }
}