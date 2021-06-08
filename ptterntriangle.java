import java.util.Scanner;
public class ptterntriangle {
    public static void main(String[] args) {
        int num=scan();
        triangle(num);
        
    }
    public static int scan() {
        Scanner scan=new Scanner(System.in);
        int n  =scan.nextInt();
        scan.close();
        return n;
        
    }
    public static void triangle(int n) {
        int nrows=n;
        int nsp=n-1;
        int  nst=1;

        int count=0;
        int digit=1;
        int print=0;
        
      
        for(int row=1;row<=nrows;row++){
            count=0;
            print=digit;
            //spaces
            for(int csp=1;csp<=nsp;csp++){
                System.out.print(" "+"    ");
                count++;
             
               

            }
           
            //stars
            for (int cst = 1; cst <= nst;cst++) {
                
                System.out.print(print+"    ");
                if(count<n-1){
                    print++;
                }
                else{
                    print--;
                }
                count++;
               
                
                
            }

           
            System.out.println("");
            nsp--;
            nst+=2;
            digit++;
           
        }

        
    }
    
}