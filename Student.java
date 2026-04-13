
public class Student {

	private String name;
	private int age;
	private String grade;

	Student(String n, int a, String g) {

		this.name = n;
		this.age = a;
		this.grade = g;
	}

	public String getName() {

		return name;
	}

	public int getAge() {

		return age;
	}

	public void setAge(int age) {

		this.age = age;
	}

	String getGrade() {

		return grade;
	}

	public static void main(String[] args) {

		Student student_1 = new Student("Noble", 18, "B");
		Student student_2 = new Student("Jack", 17, "B");
		Student student_3 = new Student("Josephine", 15, "A");
		Student student_4 = new Student("David", 18, "A");
		Student student_5 = new Student("Ross", 18, "D");
		Student student_6 = new Student("Jacqueline", 17, "B");
		Student student_7 = new Student("Louis", 17, "F");
		Student student_8 = new Student("Cassey", 18, "C");
		
	       student_1.setAge(19);
	       System.out.println(student_1.getAge());

		
	       System.out.println("Name:" + student_1.getName() + "  Age:" + student_1.getAge() + "  Grade:" + student_1.getGrade());  
	       System.out.println("Name:" + student_2.getName() + "  Age:" + student_2.getAge() + "  Grade:" + student_2.getGrade());  
	       System.out.println("Name:" + student_3.getName() + "  Age:" + student_3.getAge() + "  Grade:" + student_3.getGrade());  
	       System.out.println("Name:" + student_4.getName() + "  Age:" + student_4.getAge() + "  Grade:" + student_4.getGrade());  
	       System.out.println("Name:" + student_5.getName() + "  Age:" + student_5.getAge() + "  Grade:" + student_5.getGrade());  
	       System.out.println("Name:" + student_6.getName() + "  Age:" + student_6.getAge() + "  Grade:" + student_6.getGrade());  
	       System.out.println("Name:" + student_7.getName() + "  Age:" + student_7.getAge() + "  Grade:" + student_7.getGrade());  
	       System.out.println("Name:" + student_8.getName() + "  Age:" + student_8.getAge() + "  Grade:" + student_8.getGrade());  

	       

	}

}

