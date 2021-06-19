import java.util.Scanner;

//package Arrays.1d;

public class SortIn012 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <=n-1 ; i++) {
            arr[i]=scan.nextInt();
            
        }
        sort(arr);
        System.out.println("");
        System.out.println("");
        for (int i : arr) {
            System.out.println(i);
            
        }

    }
    public static void sort(int[]  arr){
        int zerocounter=0;
        int traverser=0;
        int twocounter=arr.length-1;
        while(traverser<=twocounter){
            if(arr[traverser]==0){
                swap(arr,traverser,zerocounter);
                zerocounter++;
                traverser++;
            }
            else if(arr[traverser]==1){
                traverser++;
            }
            else{
                swap(arr,traverser,twocounter);
                twocounter--;
               
            }
        }

    }
    public static void swap(int[] arr,int i ,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    
}