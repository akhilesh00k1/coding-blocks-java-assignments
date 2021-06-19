import java.util.Scanner;
public class Countdigit {
    public static void  main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number=scan.nextInt();
        int digit=scan.nextInt();
        int count=0;
        while(number!=0){

            if(number%10==digit){
                count++;
            }

            number/=10;
        }
        System.out.print(count);
    }
}