package SchoolMangement;

public class Teacher {
	
	
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	
	
	
	public Teacher(int id, String name, int salary) {
		
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.salaryEarned=0;
		
	}
	
	

	public int getId() {
		return id;
		

	}
	
	public String getName() {
		return name;
		
	}
	
	public int getSalary() {
		return salary;
		
	}
	
	public void setSalary(int salary) {
		this.salary=salary;
	}
	
	/**
	 * Add to salary
	 * remove from total money earned by the school
	 * @param salary
	 */

	public void receiveSalary(int salary) {
		salaryEarned+=salary;
		/**
		 * School spend there money for given salary to the staff
		 */
		School.updateTotalMoneySpend(salary);
	}
	/**
	 * if we donot override the methode we get junk out print will be printed
	 *  
	 */
	@Override
	public String toString() {
		return " Name of the Teacher: "+name+" Total salary earned so far" + salaryEarned;
		
	}



	public String getSubject() {
		// TODO Auto-generated method stub
		return name;
	}



	public String getGender() {
		// TODO Auto-generated method stub
		return getGender();
	}
	
	
}
