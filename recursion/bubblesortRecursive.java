//package recursion;

public class bubblesortRecursive {
    public static void main(String[] args){
        int [] arr={7,6,5,3,2,1};
        bubblerecur(arr,0, arr.length-2);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static void bubblerecur(int[]arr,int si,int li){
        if(si==li){
            bubblerecur(arr, 0, li-1);
            return ;
        }
        if (arr[si]>arr[si+1]){
            int temp =arr[si];
            arr[si]=arr[si+1];
            arr[si+1]=temp;
        }
        bubblerecur(arr, si+1, li);
       
      
    }
    
}