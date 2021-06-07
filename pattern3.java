import java.util.Scanner;
public class pattern3 {
    public static void main(String[] args) {
        int num=scan();
        numstars(num);

    }
    public static int scan() {
        Scanner scan=new Scanner(System.in);
        int n  =scan.nextInt();
        scan.close();
        return n;
        
    }
    public static void numstars(int n) {
        int rows=n ;
        int nsn=1;
        int nst=n-1;
        
        //n rows
        for (int row=1;row<=rows;row++){
            //ncols
            //numbers
            int digit=1;
            for (int csn = 1; csn <=nsn; csn++) {
                System.out.print(digit);
                digit++;

                
            }
            //stars
            for (int cst = 1; cst <=nst; cst++) {
                System.out.print("*");
                
            } 
            //cndtn
            nsn++;
            nst--;
            System.out.println("");


        }
        
    }
    
}