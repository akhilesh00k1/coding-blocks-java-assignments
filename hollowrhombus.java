import java.util.Scanner;
public class hollowrhombus {
    public static void main(String[] args){
        int n=scan();
        rhombus(n);
    }
    public static int scan(){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        scan.close();
        return n;
    }
    public static void rhombus(int n){
        int nrows=n;
        int nsp=n-1;
        int nst=n;
        int nsp2=n-2;
        for(int row=1;row<=nrows;row++){
            for(int csp=1;csp<=nsp;csp++){
                System.out.print(" ");

            }
            //set1
            if(row==1||row==n){
                for (int i = 1; i <=nst; i++) {
                    System.out.print("*");
                }
            
            }
            else{

                //setmid
                System.out.print("*");

                for (int i = 1; i <= nsp2; i++) {
                    System.out.print(" ");

                
                
                }
                System.out.print("*");

            }

            nsp--;

            System.out.println("");

        }

    }

    
}
