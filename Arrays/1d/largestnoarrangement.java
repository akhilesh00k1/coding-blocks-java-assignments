//0package Arrays.1d;
import java.util.Scanner;
public class largestnoarrangement {
    static Scanner  scan =new Scanner (System.in);
        
    public static void main(String[] args){
        int testcases=scan.nextInt();
        for(int test=1;test<=testcases;test++){

            System.out.println( findgreatest());
        }

    }
    public static int findgreatest(){
        int ans=-1;
        System.out.println("enter len");
        int numberOfEntries=scan.nextInt();
        System.out.println("enter string");
        scan.nextLine();
        String [] srr=scan.nextLine().split(" ");
    
       int xy=0;
       int yx=0;
        
       String variable=srr[0];
       for(int iterate=1;iterate<=srr.length-1;iterate++){
           xy=Integer.parseInt(variable + srr[iterate]);
           yx=Integer.parseInt(srr[iterate]+variable);
           if (xy>yx){
               variable=Integer.toString(xy);
           }
           else{
               variable=Integer.toString(yx);
           }
           
        
       }
       return xy;

    }
}