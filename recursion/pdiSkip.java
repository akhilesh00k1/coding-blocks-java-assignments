

public class pdiSkip {
    public static void main(String[] args){
        int n =5;
        pdiskip(n);
    }
    public static void pdiskip(int n ){
        if(n==0){
            return;
        }
        if(n%2==1){
            System.out.println(n);

        }
        pdiskip(n-1);
        if(n%2==0){
            System.out.println(n);
        }
    }
}    
