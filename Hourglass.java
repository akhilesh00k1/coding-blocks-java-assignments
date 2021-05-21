import java.util.Scanner;

public class Hourglass {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        scan.close();
        int nrows=2*n+1;
        int nsp=0;
        int nst=2*n+1;
        int var=n;
        int digit=var;
        int middlecounter=n;
        //rows
        for(int row=1;row<=nrows;row++){
            //spaces
            for(int csp=0;csp<nsp;csp++){
                System.out.print("  ");

            }
            //stars
            digit=var;
            for(int cst=0;cst<nst;cst++){
                System.out.print(digit+" ");
                if(cst<middlecounter){
                    digit--;
                }
                else{
                    digit++;
                }
            }            
            System.out.println();
            if(row<n+1){
                nsp++;
                nst-=2;
                var--;
                middlecounter--;
            
            }
            else{
                nsp--;
                nst+=2;
                var++;
                middlecounter++;
            }
            
        }


        
    }
}