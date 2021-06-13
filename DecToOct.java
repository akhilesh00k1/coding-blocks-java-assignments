import java.util.Scanner;
public class DecToOct {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        System.out.print(DtoO(number));
    }
    public static int DtoO(int  number){
        int ans=0;
        int bit=0;
        int multiplier=1;
        while(number!=0){
            bit=number%8;
            number/=8;
            ans+=bit*multiplier;
            multiplier *=10;

        }
        return ans;
        
    }
    
}