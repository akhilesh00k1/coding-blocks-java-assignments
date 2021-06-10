import java.util.Scanner;
public class hollowdiamond{
    public static void main(String[] args) {
        int num=scan();
        diamond(num);
        
    }
    public static int scan() {
        Scanner scan=new Scanner(System.in);
        int n  =scan.nextInt();
        scan.close();
        return n;
        
    }
    public static void diamond(int n) {
        int nrows=n;
        int nst=(n+1)/2;
        int nsp=-1;
        int nst2=(n+1)/2;
        for (int row  = 1; row  <=nrows; row++) {
            for (int cst = 1; cst <=nst; cst++) {
                System.out.print("*"+"    ");

            }
            for(int csp=1;csp<=nsp;csp++){
                System.out.print(" "+"    ");

            }
            for(int cst=1;cst<=nst2;cst++){
                if((row==1||row==n)&&(cst==1)){
                    continue;
                    
                }
                System.out.print("*"+"    ");
            }
            if(row<(n+1)/2){
                nst--;
                nsp+=2;
                nst2--;
            }
            else{
                nst++;
                nsp-=2;
                nst2++;

            }
            System.out.println("");
        }
        
    }
}