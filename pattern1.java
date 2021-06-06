import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        scan.close();
        
        int nrows=n;
        int nst=n;
        int nsp=-1;
        //rows
        for (int row = 1; row <=nrows; row++) {
            //first stars
            int digit=1;
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(digit+" ");
                digit++;
                
            }
            //second stars
            for (int csp = 1; csp <=nsp; csp++) {
                System.out.print("*"+" ");
                
            }
            
        
            //changeline
            System.out.println("");
            //cdtn
            nst--;
            nsp+=2;

           
        }
        
    }



    
}