package SchoolMangement;

import java.util.List;

public class School {

	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpend;



	public School ( List<Teacher> teachers, List<Student> students ) {
		this.teachers=teachers;
		this.students=students;
		this.totalMoneyEarned=0;
		this.totalMoneySpend=0;
	}

	/**
	 * @return the teachers
	 */
	public List<Teacher> getTeachers() {
		return teachers;
	}


	/**
	 * Adds a teacher to the school.
	 * @param teacher the teacher to be added.
	 */
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}



	/**
	 * @return the students
	 */
	public List<Student> getStudents() {
		return students;
	}


	/**
	 * Adds a student to the school
	 * @param student the student to be added.
	 */
	public void addStudent(Student student) {
		students.add(student);
	}



	/**
	 * @return the totalMoneyEarned
	 */
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}



	/**Add the total money by the school
	 * @param totalMoneyEarned the totalMoneyEarned to set
	 */
	public static void updateTotalMoneyEarned(int MoneyEarned) {
		totalMoneyEarned += MoneyEarned;
	}



	/**initially total money earned & spend is 0
	 * @return the totalMoneySpend
	 */
	public int getTotalMoneySpend() {
		return totalMoneySpend;
	}



	/**
	 * @param totalMoneySpend the totalMoneySpend to set
	 * updates the money spends by the school
	 * salary is way one of the way school spend there money
	 * is the salary given by the school to teacher's
	 */
	public static void updateTotalMoneySpend(int MoneySpend) {
		totalMoneyEarned=totalMoneyEarned-MoneySpend;
		totalMoneyEarned -= totalMoneySpend;
	}

	



}
