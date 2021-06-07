import java.util.Scanner;



public class pattern2 {
    public static void main(String[] args) {

        int num=scan();
        swastik(num);
        
    }
    public static int scan() {
        Scanner scan=new Scanner(System.in);
        int n  =scan.nextInt();
        scan.close();
        return n;
        
    }
    public static void swastik(int n) {
        //rows variable
        int rows=n;
        //first set variables
        int nst1=(n+1)/2;
        int nsp1=(n-3)/2;
        //code set 1
        System.out.print("*");
        for (int csp1 = 1; csp1 <=nsp1; csp1++) {
            System.out.print(" ");
        }
        for (int cst1 = 1; cst1 <= nst1; cst1++) {
            System.out.print("*");
            
        }
        //next line 
        System.out.println("");
        //variables set2
        //same 2 stars  with spaces varying with  n 
        //number of spaces same as nsp1

        //for row 2 to n/2+1we have other set 
        for (int i=2;i<(n+1)/2;i++){
            
            System.out.print("*");
            for (int cst2 =  1 ; cst2 <= (n-3)/2;  cst2++){
                System.out.print(" ");

            }
            System.out.print("*");
            //nextline
            System.out.println("");



        }
       

        //variable set three
        //nst=n
        for (int i = 1; i <=n; i++) {
            System.out.print("*");

            
        } 
        //nextline
        System.out.println("");
       
        
        //next set variabbles

       
        //row half---->n-1
        for (int i = 1; i <=(n-3)/2 ; i++) {
            //with  loops setup pattern for each crow half--.n-1
            //spaces ;loop
            for (int j = 1; j <=n/2; j++) {
                System.out.print(" ");
            } 
            //star
            System.out.print("*");
            //spces n-3/2
            for (int j = 1; j <=(n-3)/2; j++) {
                System.out.print(" ");
            }
 
            //star again
            System.out.print("*");
            //next line
            System.out.println("");
        }
        

        //nth tline
        for (int i = 1; i <=(n+1)/2; i++) {
            System.out.print("*");

        }
        for (int i = 1; i <= (n-3)/2; i++) {
            System.out.print(" ");
            
        }
        System.out.println("*");

        
       

    }
    
}