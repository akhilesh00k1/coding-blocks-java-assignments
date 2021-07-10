//package recursion;

public class lastIndex {
    public static void main(String[] args){
        int[]arr={3,8,1,8,8,7};
        System.out.println(indexl1(arr,0,8));
    }
    public static int indexl1(int[]arr,int si,int data){
        //out of bounds si
        if(si==arr.length){
            return -1;//reached the end of array
        }
        //call next step

        int index=indexl1(arr,si+1,data);
        //now when reached the end or last element then start checking for data if data found then return its indexotherwise -1
        if(index==-1){
            //now checking the data
            //if data id therethrn index will save index of element equal to  data
            if(arr[si]==data){
                return si;
            }
            //if not equal to  data return  -1
            else{
                //not found data in thet very  step  
                return -1;
            }
        
        }
        //in case the index is found or not found the variable index will have index od element or -1
        else{
            return index;
        }

    }
}