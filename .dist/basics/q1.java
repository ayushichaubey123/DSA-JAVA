package basics;

public class q1{
    public static void main(String[] args) {
        int n=10 ,m = 5;
        System.out.println("Before swap: n = " + n + ", m = " + m);
        n=n+m;
        m=n-m;
        n=n-m; 
        System.out.println("After swap: n = " + n + ", m = " + m);
    }
}