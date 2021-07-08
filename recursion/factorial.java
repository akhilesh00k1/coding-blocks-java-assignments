//package recursion;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
        Scanner scan=new Scanner (System.in);
        int n =scan.nextInt();
        System.out.println(fact(n));

    }
    public static int fact(int n ){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }

}