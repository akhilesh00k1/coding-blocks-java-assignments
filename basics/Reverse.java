import java.util.Scanner;
public class Reverse {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        System.out.print(reverse(number));


    }
    public static int reverse(int num){
        int ans=0;
        int digit=0;
        String s=Integer.toString(num);
        int len=s.length();
        int multiplier=(int)Math.pow(10,len-1);
        while(num!=0){
            digit=num%10;
            num/=10;
            ans+=digit*multiplier;
            multiplier/=10;
        }
        return ans ;
    }
}