//package Arrays.1d;
import java.util.Scanner;
public class largestno {
    public static void main(String[] args){
         
        Scanner scan=new Scanner(System.in);
        //int n=scan.nextInt();
        String s=scan.nextLine();
        String [] stringarr=s.split(" ");
        //check eacj sring length  and make all of them  sa me length by  adding xeroes
        int maxElementLength=largestelement(stringarr);
        


    }
    public static int largestelement(String[]arr){
        int max=0;
        for (String string : arr) {
            if(string.length()>max){
                max=string.length();
            }
            
        }
        return max;
    }
    public static int greatest (String[] srr){
        String ans="";
        int count=0;
        while (count<=srr.length-1){
            for(int items=0;items<=srr.length-1;items++){

            }

            count++;
        }
    }
    
    
}