import java.util.Scanner;

public class fibonaccipattern {
    public static void main(String[] args) {
        int number=scan();
        fibnumber(number);
        
        
    }
    public static int scan() {
        Scanner scan=new Scanner(System.in);
        int n  =scan.nextInt();
        scan.close();
        return n;
        
    }
    public static void fibnumber(int n) {
        int nrows=n;
        int nst=1;
        int current=1;
        int previous=0;
        for (int row = 1; row <=nrows; row++) {
            for (int cst = 1; cst <=nst; cst++) {
                if(row==1&&cst==1){
                    System.out.print(0);
                    continue;
                }
               
                
                System.out.print(current+"    ");
                int x=current;
                current+=previous;
                previous=x;
                
            }
            System.out.println("");
            nst++;
        }
        
    }


    
}