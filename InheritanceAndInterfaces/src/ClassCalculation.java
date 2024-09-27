
public class ClassCalculation implements InterfaceA,InterfaceB {
	public void sum() {
		int sum = a + b;
		System.out.println("Sum of a and b is: "+ sum);
	}
	public void mul() {
		int mul = x * y;
		System.out.println("Product  of x and y is: "+ mul);
	}
	public static void main(String[]args) {
		ClassCalculation sumab = new ClassCalculation();
		ClassCalculation mulxy = new ClassCalculation();
		sumab.sum();
		mulxy.mul();
	}		
}