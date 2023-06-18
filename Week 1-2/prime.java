package First;

public class Prime {

public static void main(String args[]) {
		
		int n=19;
		boolean r= true;
		if(n==1) {
			r= false;
		}
				
		for(int i=2; i<n; i++) {
			
			 if (n%i==0) {
				r= false;
				break;	
			}
		}
		if(r==true) {
			
			System.out.println("Number is prime");
		}
		else {
			System.out.println("Number is not a prime");
		}
	
}
}
