public class ComputerTeacher extends Teacher{
	String subject = "Computer Science";
	public static void main(String[] args) {
		ComputerTeacher myCT = new ComputerTeacher();
		myCT.does();
		System.out.println("I am a " + myCT.subject + " " + myCT.designation + " at " + myCT.collegeName);
	}
}