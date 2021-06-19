import java.util.Scanner;
public class PrintSeries{
    public static void main(String[]args){
        Scanner scan =new Scanner(System.in);
        int n1=scan.nextInt();
        int n2=scan.nextInt();
        //array  index
        int count=0;
        //array to  store values
        int[] arr=new int[n1];
        //i =1 bcoz in series nstars from 1
        int i=1;
        //using n1 as an reverse counter
        while(n1!=0){


            //series 3n+2
            int x=3*i+2;
            //i iterates through series from n=1-->so on
            i++;
            if(x%n2!=0){
                arr[count]=x;
                //count for idexing
                count++;
                //if we find a value decrease required numbers c
                n1--;
            }
            

        }
        for (int j : arr) {
            System.out.println(j);
            
        }
    }
}