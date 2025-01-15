public class TestStudent {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		Student student2 = new Student();
		
		student1.setStudentDetails("Siriyakorn",new double[] {85.0,78.0,92.0});
		student2.setStudentDetails("sumsoo",new double[] {98.0,66.5});
		
		System.out.println("Student 1 details");
		student1.displayStudentDetails();
		System.out.println("Student 2 details");
		student2.displayStudentDetails();

	}

}
