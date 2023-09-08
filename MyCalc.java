package exp2;

public class MyCalc {
	public int sum(int a, int b) {
		return(a+b);
	}
	public int diff(int a, int b) {
		return(a-b);
	}
	public static void main(String[] args) {
		MyCalc calc= new MyCalc();
		System.out.println("Sum abhisis"+calc.sum(4,6));
		System.out.println("Diff is"+calc.diff(10,4));
	}

}
