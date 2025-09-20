package basics;

public class q2 {
    public static void main(String[] args){
        int a=24;

        String b=Integer.toBinaryString(a);
        String o=Integer.toOctalString(a);
        String h=Integer.toHexString(a);

        System.out.println("Binary: " + b);
        System.out.println("Octal: " + o);  
        System.out.println("Hexadecimal: " + h);
    }
    
}
