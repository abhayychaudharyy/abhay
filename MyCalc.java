package exp2;

public class MyCalc {
	public int sum(int a, int b) {
		return(a+b);
	}
	public int diff(int a, int b) {
		return(a-b);
	}
	public int multiply(int a, int b) {
		return(a*b);
	}
	public int div(int a, int b) {
		return(a/b);
	}
	public static void main(String[] args) {
		MyCalc calc= new MyCalc();
		System.out.println("Sum is"+calc.sum(4,6));
		System.out.println("Diff is"+calc.diff(10,4));
		System.out.println("Multi is"+calc.multiply(4,6));
		System.out.println("Div is"+calc.div(10,4));
	}

}
