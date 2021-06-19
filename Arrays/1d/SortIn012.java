import java.util.Scanner;

//package Arrays.1d;

public class SortIn012 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        int[] arr=new int[N];
        for (int i = 0; i <=N-1 ; i++) {
            arr[i]=scan.nextInt();
            
        }
        sort(arr);
        for (int i : arr) {
            System.out.println(i);
            
        }

    }
    public static void sort(int[]  arr){
        int zerocounter=0;
        int traverser=0;
        int twocounter=arr.length-1;
        while(traverser<=zerocounter){
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