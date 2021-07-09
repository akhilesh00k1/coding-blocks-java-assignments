//package recursion;
public class fibonacci{
    public static void main(String[] args){
        System.out.println(fibterm(5));
    }
    public static int fibterm(int n ){
        int term1=0;
        int term2=1;
        int nextterm=0;
        if(n==1){
            return term1;
        }
        else if (n==2){
            return term2 ;
        }
        
        for(int i=3;i<=n;i++){
            nextterm=term1+term2;
            term1=term2;
            term2=nextterm;
        }
        return nextterm;


    }
    public static int fibtermn(int n ){
        if(n==0||n==1){
            return n;
        }
        
        int fnm1=fibtermn(n-1);
        int fnm2=fibterm(n-2);
        int fn=fnm1+fnm2;
        return fn;

    }
    
}