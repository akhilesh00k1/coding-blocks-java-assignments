
import java.util.Scanner;

public class pythagorean_triplets {
    
    public static void main(String[] args){
        int n =scan();
        pytriplets(n);


    }
    public static void pytriplets(int n){
        if(n<0){
            System.out.println(0);
        }
        int a=n;
        int b=0;
        int c=0;
        int x=n/2;
        if(n%2==0){
            b=x*x-1;
            c=x*x+1;

        }
        else {
            b=(int)(n*n/2.0 -0.5)  ;
            c=(int)(n*n/2.0 +0.5);
        }
        System.out.print(b+" "+c);
        
    }
    public static int scan(){
        Scanner scan=new Scanner(System.in);
        return scan.nextInt();
    }
}