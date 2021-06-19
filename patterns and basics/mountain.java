import java.util.Scanner;



public class mountain {
    public static void main(String[] args) {
        int number=scan();
        pattern(number);
        
    }
    public static int scan() {
        Scanner scan=new Scanner(System.in);
        int n  =scan.nextInt();
        scan.close();
        return n;
        
    }

    public static void pattern(int n) {
        //variable for no fo rows
        int nrows=n;
        int nst=1;
        int  nsp=n+1;
        int nst2=1;
        
        for(int row=1;row<=nrows;row++){
            //column strs1
            int digit=1;
            
            for (int cst = 1; cst <=nst; cst++) {
                System.out.print(digit+"    ");
                digit++;
            }
            //spaces
            for (int csp = 1; csp <=nsp; csp++) {
                System.out.print(" "+"    ");
               

                
            }
            //stars2
            for (int cst = 1; cst <= nst2; cst++) {
                if(row==n && cst==1){
                    digit--;
                    continue;
                }
                digit--;
                System.out.print(digit+"    ");
                
            }
            System.out.println("");
            nst++;
            nsp-=2;
            nst2++;
           
        }
        
        
    }
}