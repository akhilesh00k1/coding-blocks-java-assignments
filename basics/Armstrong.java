import java.util.Scanner;
public class Armstrong{
    public static void main(String[] args){
        Scanner scn=new Scanner (System.in);
        int num=scn.nextInt();
        String s=Integer.toString(num);
        int len=s.length();
        System.out.println( armstrong(num,len));

        


    }
    public static boolean armstrong(int num,int len){
        int ans=0;
        
        int number=num;
        int digit=0;
        
        while(number!=0){
            digit=number%10;
            number/=10;
        
            ans+=Math.pow(digit,len);
            
            
            
        }
        
        
    

        //System.out.println(ans);
        if(num==ans){
            return true;
        }
        return false;

    }
    
}