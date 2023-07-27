package student;

public class StudentTester {

	public static void main(String[] args) {
		Student st1 = new Student(1,"Vitinho","xxxxxx");
		System.out.println(st1.toString());
		
		Student st2 = new Student(2,"Zezinho","xxxxxx");
		System.out.println(st2.toString());
		
		Student st3 = new Student(3,"Luanzinho","xxxxxx");
		System.out.println(st3.toString());
		
		st1.setName("Teste");
		System.out.println(st1.toString());

	}

}
