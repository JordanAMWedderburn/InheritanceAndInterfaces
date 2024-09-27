
public class ClassB implements InterfaceA{
		public void sum() {
			int sum = a + b;
			System.out.println("Sum of a and b is: "+ sum );
		}
		public static void main(String[]args) {
			ClassB sumab = new ClassB();
			sumab.sum();
			//System.out.println(sumab.sum());
		}
	}