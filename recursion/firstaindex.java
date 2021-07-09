package recursion;

public class firstaindex {
    public static void main(String[] args){
        int []arr={1,2,3,4,5,8,65,5,7};
        System.out.println(indexf(arr,0,8));

    }
    public static int indexf(int[]arr,int si,int data){
        if(si==arr.length){
            return -1;
        }
        if(arr[si]==data){
            return si;
        }
        else{
            int restans=indexf(arr,si+1,data);
            return  restans;
        }

    }
    
}