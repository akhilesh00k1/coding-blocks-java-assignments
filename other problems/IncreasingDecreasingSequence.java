import java.util.Scanner;

public class IncreasingDecreasingSequence{
    static Scanner scan=new Scanner (System.in);
    public static void main(String[] args) {
        
        int n =scan.nextInt();
        System.out.println( incdec(n));
    }
    public static boolean incdec(int n ) {
        //flags for sequence checks inc flag 1 dec flag 2
        int flag1=0;
        int flag2=0;
        int previous =scan.nextInt();
        int current=scan.nextInt();
        //wihtout using  any ds
        //check if first twor terms follow  inc seq if true  the proceed else return false
        if(current<previous){
            return false;
        }
        //if first two terms are in sequence then we move forward 
        else{
            //two comparisons alredy done
            for(int i =0;i<=n-3;i++){
                previous =current ;
                current =scan.nextInt();
                if (current>=previous){
                    flag1=0;
                }
                else {flag1=1;
                }
                if  (flag1==1){
                    if(current <=previous){
                        flag2=0;
                    }
                    else {
                        return false ;
                    
                    }
                }
           }


        }
        return true;

        
        
    }

}