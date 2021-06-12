import java.util.Scanner;

public class Basic_calculator {
    static Scanner scan=new Scanner (System.in);
        
    public static void main(String[] args){
        calculator();
    }

    public static void calculator(){
        int a=1;
        int b=1;
        while(true){
            char ch=scan.next().charAt(0);
            if(ch=='x'||ch=='X'){
                break;
            }

            switch (ch){
                
                case '+':
                    a=scan();
                    b=scan();
                    System.out.println(a+b);
                    break;
                case '-':
                    a=scan();
                    b=scan();
                    System.out.println(a-b);
                    break;
                case '*':
                    a=scan();
                    b=scan();
                    double mul=a*b;
                    System.out.println(mul);
                    break;
                case '/':
                    a=scan();
                    b=scan();
                    System.out.println((double)a/b);
                    break;
                case '%':
                    
                    a=scan();
                    b=scan();
                    
                    System.out.println(a%b);
                    break;
                
                default:
                    System.out.println("Invalid operation. Try again.");
                    break;


            }    

        }
       
        
    }
    static int scan(){
        return scan.nextInt();
    }
    
    
}