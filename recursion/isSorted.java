public class isSorted {
    public static void main(String[] args){
        int [] arr={9,2,3,4,5};
        System.out.println(sorted(arr,0));
    }
    public static boolean sorted(int[]arr,int si){
        if(si==arr.length-1){
            return true;

        }
        if(arr[si]>arr[si+1]){
            return false;
            
        }
        else{
            boolean restans=sorted(arr,si+1);
            return restans;
        }
    }
    
}