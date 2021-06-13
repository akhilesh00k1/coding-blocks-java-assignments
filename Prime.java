import java.util.Scanner;
public class Prime {

    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int number=scan.nextInt();
        System.out.print(isprime(number));
    
    }

    public static String isprime(int number) {
        for(int i=2;i<=(int)Math.pow(number,0.5);i++){
            if(number%i==0){
            return "Not Prime";
            }
        }
        return "Prime";

        
    }
}