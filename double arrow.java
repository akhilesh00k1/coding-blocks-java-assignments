import java.util.Scanner;

public class Pattern {

	public static void main(final String[] args) {

		final Scanner sc = new Scanner(System.in);
		final int n = sc.nextInt();
		sc.close();

		// initialization
		final int nrows = n;
		int nsp=n-1;
		int nst=1;
		int nsp2=-1;
		int nst2=1;
		int var=1;
		
		
	
		//rowloop
		for(int row=1;row<=nrows;row++){
			////spaces
			for(int csp=0;csp<nsp;csp++){
				System.out.print("  ");

			}
			//stars1
			int digit=var;
			for(int cst=0;cst<nst;cst++){
				
				System.out.print(digit +" ");
				digit--;
				
				


			}
			//spaces2

			for(int csp2=0;csp2<nsp2;csp2++){
				if(row==0||row==nrows){
					continue;

				}
				else{
					System.out.print("  ");
				}

			}
			//stars2
			int digit2=1;
			for(int cst2=0;cst2<nst2;cst2++){
				if(row==1||row==nrows){
					continue;

				}
				else{
					
					System.out.print(digit2+" ");
					digit2++;
				}
			}

		
			//conditions
			//spaces1
			//stars1
			if(row<nrows/2+1){
				nsp-=2;
				nst++;
				nsp2+=2;
				nst2++;
				var++;
			
			
				
				
			}
	
			else{
				nsp+=2;
				nst--;
				nsp2-=2;
				nst2--;
				var--;
			}
			

			System.out.println();
		}
	
		
										
			
			
		
		

	}

}
