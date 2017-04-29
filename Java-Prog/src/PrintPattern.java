
public class PrintPattern {

	public static void main(String[] args) {
		/*
		 * 1
		 * 121
		 * 12321
		 * 1234321
		 * 123454321
		 * 12345654321
		 * 1234567654321
		 * 
		 */
		
		for(int i=1; i<=7; i++){
			
			int m = 2*i-1;
			
			for(int j=1,l=m; j<=m; j++,l--){

				if(j<=i){
					System.out.print(j);
				}else{
					System.out.print(l);
				}
			}
			
			System.out.println();
		}

	}

}
