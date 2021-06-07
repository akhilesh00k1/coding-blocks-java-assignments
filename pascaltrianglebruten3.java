import java.util.Scanner;

public class pascaltrianglebruten3 {
    public static void main(String[] args) {
        int number=scan();
        pascal(number);
        
    }
    public static int scan() {
        Scanner scan=new Scanner(System.in);
        int n  =scan.nextInt();
        scan.close();
        return n;
        
    }
    public static void pascal(int number) {
       
        //n fpor nCr
        for(int n=0;n<number;n++){
            //r for nCr
            for(int r=0;r<=n;r++){
                System.out.print( combination(n,r)+"    ");
            }
            //nextline
            System.out.println("");


        }

        
    }
    public static int combination(int n,int r) {
        int ans=1;
        if(r>n-r){
            r=n-r;
        }
        for (int i = 0; i < r; i++) {
            ans*=n-i;
            ans/=i+1;
        }
        return ans;
        
    }
    
}