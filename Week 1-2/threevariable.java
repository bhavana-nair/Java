package First;

public class threevariable {
	public static void main(String args[]) {
		int a=111;
		int b=222;
		int c=3;
		int max= a>b?(a>c ? a:c): (b>c? b: c);
		
//		max=a>b && a>c?a:max;
//		max= b>a&& b>c?b:max;
//		max= c>a&& c>b?c:max;
		
		System.out.print("The greatest number is " + max);
	}
}