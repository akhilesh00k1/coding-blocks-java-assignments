import  java.util.Scanner;
public class FtoC {
    public static void main(String[] args){
        
        Scanner  scan = new Scanner(System.in);
        int min=scan.nextInt();
        int max=scan.nextInt();
        int step=scan.nextInt();
        while(min<=max){
            System.out.print(min+"    ");
            System.out.print(fc(min)+"\n");
            min+=step;


        }

    }
    public static int  fc(int f){
        return (5*(f-32))/9;
    }
    
}