import java.util.Scanner;
public class manmohan2 {
    static Scanner scan=new Scanner(System.in);
    
    
    public static void main(String[] args) {
        int n=scan();
        pattern(n);
    }
    public static void pattern(int n){
        int nst=1;
        for(int row=1;row<=n;row++){
            for(int cst=1;cst<=nst;cst++){
                if(row==1){
                    System.out.print(1);
                }
                else if (cst==1||cst==nst){
                    System.out.print(row-1);
                }
                else{
                    System.out.print(0);
                }
            }
            nst++;
            System.out.println("");

        }

    }



    public static int scan(){
        return scan.nextInt();
    }
    
}