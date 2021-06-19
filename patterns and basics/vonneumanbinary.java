import java.util.Scanner;
public class vonneumanbinary {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        int items=scan();
        int []arr=new int[items];
        for(int item=0;item<=items-1;item++){
            arr[item]=bdc(scan());
        }
        for (int i : arr) {
            System.out.println(i);
            
        }


    }
    public static int bdc(int n){
        int binary=n;
        int x=0;
        int ans=0;
        int expo=1;

        while(binary!=0){
            x=binary%10;
            binary/=10;
            ans+=x*expo;
            expo*=2;
            

        }
        return ans;
    }
    public static int scan(){
        
        return scan.nextInt();
        
        
    }
    
}