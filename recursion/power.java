//package recursion;

public class power {
    public static void main(String [] args){
        int n =2;
        int pow=4;
        System.out.println( power(n,pow));
    }
    public static int power(int n ,int pow){
        if(pow==0){
            return 1;
        }
        return n*power (n,pow-1);
    }
}