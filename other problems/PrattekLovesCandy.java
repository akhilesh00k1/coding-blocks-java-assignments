import java.util.Scanner;
public class PrattekLovesCandy {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<=n-1;i++){
            arr[i]=scan.nextInt();


            
        }
        for(int i:arr){
            System.out.println(  ans(i));
        }
    }
    public static int ans(int n){
        int count=0;
        int ans=0;
        int num=2;
        while(count<n){
            if(isprime(num)==true){
                count++;

            }
            ans=num;
            num++;
          
            
        }
        return ans;
    }
    public static boolean isprime(int number) {
        if(number==1){
            return false;
        }
        for(int i=2;i<=(int)Math.pow(number,0.5);i++){
            if(number%i==0){
            return false;
            }
        }
        return true;

        
    }
    
}