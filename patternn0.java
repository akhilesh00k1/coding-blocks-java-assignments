import java.util.Scanner;

public class patternn0 {
    public static void main(String[] args) {
        int n=scan();
        pattern(n);
        
    }
    public static int scan() {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        scan.close();
        return n;
        
    }
    public static void pattern(int n ) {
        int nrows=n;
        int nst=1;
        for(int row=1;row<=nrows;row++){
            int print=row;
            for(int cst=1;cst<=nst;cst++){
                if(cst==1||cst==nst){
                    System.out.print(print+"    ");
                }
                else{
                    System.out.print(0+"    ");
                }
            }
            nst++;
            System.out.println("");
        }

        
    }
    
}