//package recursion;

public class starpattern {
    public static void main(String[] args){
        pattern(5,1,1);
    }
    public static void pattern(int n,int row,int col){
        //end all the wrok when the rows are completely printed
        if(row>n){
            return ;
        }
        //as col gets higher then row we need to  shift to  next rowand call pattern for stars of next row
        if(col>row){
            System.out.println();
            //call for shifting rows
            pattern(n,row+1,1);
            //get out
            return;
        }
        //print stars as per colsumns until col is greater then row
        System.out.print("*");
        //call  for printing stars on the row
        pattern(n,row,col+1);

    }
}