import  java.util.Scanner;
public class BDCconverter {
    public static void main(String[] args){
        Scanner scan=new Scanner (System.in);
        int binary=scan.nextInt();
        int ans=0;
        int pow=1;
        while(binary!=0){
            int bit=binary%10;
            binary/=10;
            ans+=bit*pow;
            pow*=2;
        }
        System.out.print(ans);
    }
}