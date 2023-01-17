package SchoolMangement;


import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.ArrayList; 
import java.util.List; 


/**
 * This class is responsible for keeping the
 * track of students id, fees total, name ,grade & fees
 * paid.
 *
 */


public class Student 
{ 

	private int id; 
	private String name; 
	

	private int grade;
	private int feesTotal;
	private int feesPaid; 
	public Student(int id, String name, int grade){
		this.feesPaid=0;
		this.feesTotal=30000;
		this.id=id;
		this.name=name;
		this.grade=grade;
		
		 /**
	     * To create a new student by initializing.
	     * Fees for every student is $30,000{it is not fix}.
	     * Fees paid initially is 0.
	     * @param id id for the student: unique.
	     * @param name name of the student.
	     * @param grade grade of the student.
	     */
		
		
	}
	
	   //Not going to alter student's name, student's id.


    /**
     * Used to update the student's grade.
     * @param grade new grade of the student.
     */

	
	

    /**
     * Keep adding the fees to feesPaid Field.
     * Add the fees to the fees paid.
     * The school is going receive the funds.
     *
     * @param fees the fees that the student pays.
     */

	public void setGrade(int grade) {
		this.grade=grade;
	}

	public void payFees(int fees) {
		feesPaid=feesPaid+fees;
		//feesPaid+=fees;
		School.updateTotalMoneyEarned(feesPaid);
		/**
		 * with static we can access the method
		 * 
		 */
		//School.updateTotalMoneyEarned(feesPaid);
		
	}
	
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}





	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}




	/**
	 * @return the feesTotal
	 */
	public int getFeesTotal() {
		return feesTotal;
	}




	/**
	 * @return the feePaid
	 */
	public int getFeePaid() {
		return feesPaid;
	}





	/**
	 * @return the grade
	 */
	public int getGrade() {
		return grade;
	}
	/**
	 * 
	 * @return the remaining fees
	 */
	public int getremainingFees() {
		return feesTotal-feesPaid;
		
	}
	
	/**
	 * I want return ID of the student , name, fees paid by the student
	 */
	@Override
	public String toString() {
		return "Student's name :"+name+ ""
				+ " Total fees paid so for " + feesPaid;
		
	}
	

}






