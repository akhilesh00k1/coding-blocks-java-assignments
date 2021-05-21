import java.util.Scanner;

public class invertedhourglass {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        scan.close();
        int nrows=2*n+1;
        int nst=1; 
        int nsp=2*n-1;
        int nst2=1;
        int printvar=n; 
        int var2=n;  
        int printvar2=var2;     
        for(int row=1;row<=nrows;row++){
            //stars
            printvar=n;
            for(int cst=0;cst<nst;cst++){
                System.out.print(printvar+ " ");
                printvar--;

            }
            //additional zero
        
            //spaces
            for(int csp=0;csp<nsp;csp++){
                System.out.print("  ");

            }
            //stars2
            if(row==n+1){

                printvar2=1; 
            }
            else{
                printvar2=var2;
            }
            for(int cst2=0;cst2<nst2;cst2++){
                if(row==n+1&&cst2==0){
                    //do nothing
                    
                }
                else{
                    System.out.print(printvar2+" ");
                    printvar2++;

                }
                

            }

            if ( row<n+1){
                nst++;
                nsp-=2;
                nst2++;
                var2--;

            }
            else{
                nst--;
                nsp+=2;
                nst2--;
                var2++;
    
            }









            System.out.println();
        }
       
        
    }
}    
