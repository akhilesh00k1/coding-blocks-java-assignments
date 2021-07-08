public class workBeforeCall{
    public static void main(String[] args){


    int n=5;
    pd(n);
    pi(n);

    }
    public static void pd(int n){
        //base case
        if(n==0){
            return;
        }
        System.out.println(n);
        pd(n-1);

    }
    public static void pi(int n) {
        //base case 
        if(n==0){
            return;
        }
        //no work beofre call
        pi(n-1);
        //orl when stack is falling
        System.out.println(n);

    }
}