package Class11;

import java.util.ArrayList;
import java.util.List;

//Model Class

class Student {
	private String stu_name;
	private int stu_id;

	Student(String stu_name, int stu_id) {
		this.stu_name = stu_name;
		this.stu_id = stu_id;
	}

	public String getStu_name() {
		return stu_name;
	}

	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}

	public int getStu_id() {
		return stu_id;
	}

	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}
}

interface StudentDAO {
	public List<Student> getAllStudents();

	public Student getStudent(int stu_id);

	public void updateStudent(Student student);

	public void deleteStudent(Student student);

}

class StudentDAOImpl implements StudentDAO {

	List<Student> students;

	public StudentDAOImpl() {
		students = new ArrayList<>();
		Student stu1 = new Student("ABC", 123);
		Student stu2 = new Student("XYZ", 456);
		students.add(stu1);
		students.add(stu2);

	}

	@Override
	public List<Student> getAllStudents() {

		return students;
	}

	@Override
	public Student getStudent(int stu_id) {

		return students.get(stu_id);
	}

	@Override
	public void updateStudent(Student student) {
		students.get(0).setStu_name(student.getStu_name());
		System.out.println("Student with id " + student.getStu_id() + " is updated");
	}

	@Override
	public void deleteStudent(Student student) {
		students.remove(student.getStu_id());
		System.out.println("Student with id " + student.getStu_id() + " is removed");

	}

}

public class DAODesignPattern {

	public static void main(String[] args) {
		StudentDAO studentDAO = new StudentDAOImpl();
		for (Student st : studentDAO.getAllStudents()) {
			System.out.println("Studen [stu id " + st.getStu_id() + " , Name: " + st.getStu_name() + " ] ");

		}

		Student firstStudent = studentDAO.getAllStudents().get(0);
		System.out.println("First Student is " + firstStudent.getStu_id() + " " + firstStudent.getStu_name());
		firstStudent.setStu_name("XYZ");
		for (Student st : studentDAO.getAllStudents()) {
			System.out.println("Student [ stu id " + st.getStu_id() + " , Name: " + st.getStu_name() + " ] ");
		}
		
		
		
		
		Student firstStudentUpdateData = studentDAO.getAllStudents().get(0);
		System.out.println("First Student is " + firstStudent.getStu_id() + " " + firstStudent.getStu_name());
		firstStudentUpdateData.setStu_name("MNO");
		studentDAO.updateStudent(firstStudentUpdateData);
		for (Student st : studentDAO.getAllStudents()) {
			System.out.println("Student [ stu id " + st.getStu_id() + " , Name: " + st.getStu_name() + " ] ");
		}
		

	}

}
