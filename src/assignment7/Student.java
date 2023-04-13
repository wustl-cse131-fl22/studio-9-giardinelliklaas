package assignment7;

public class Student {
	
	private String firstName;
	private String lastName;
	private int idNumber;
	private int attemptedCredits;
	private int passingCredits;
	private double tgqp;
	private double bbb;
	
	public Student() {	
	}
	public Student(String firstName , String lastName , int idNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.attemptedCredits = 0;
		this.passingCredits = 0;
		this.tgqp = 0;
		this.bbb = 0;
	}
	/**
	 * this gets full name
	 * @return full name of student
	 */	
	public String getFullName() {
		return firstName + " " + lastName;
	}
	/**
	 * this gets last name
	 * @return last name
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * this gets Id number
	 * @return id number
	 */
	public int getId() {
		return idNumber;
	}
	/**
	 * this gets total attempted credits
	 * @return attempted credits
	 */
	public int getTotalAttemptedCredits() {
		return attemptedCredits;
	}
	/**
	 * this gets total passing credits
	 * @return passing credits
	 */
	public int getTotalPassingCredit() {
		return passingCredits;	
	}
	/**
	 * this gets Total Grade Quality Points
	 * @return Total Grade Quality Points
	 */
	public double getTotalGradeQualityPoints() {
		return tgqp;
	}
	/**
	 * this submits a grade to the user on a 4.0 scale
	 * @param grade grade for course out of 4
	 * @param credits how many credits total in a course
	 */
	public void submitGrade(double grade, int credits) {
		tgqp += (grade * credits);
		if(grade >= 1.7) {
			passingCredits += credits;
	}
		attemptedCredits += credits;
	}
	/**
	 * this calculates a students gpa
	 * @return gpa which is total quality points over total credits earned
	 */
	public double calculateGradePointAverage() {
		return (tgqp / attemptedCredits);
	}
	/**
	 * this gets the grade a student is in
	 * @return either first year, sophomore, junior, or senior 
	 * depending on number of credits
	 */
	public String getClassStanding() {
		if(passingCredits < 30) {
			return "First Year";
		}
		else if(passingCredits >= 30 && passingCredits < 60) {
			return "Sophomore";
		}
		else if(passingCredits >= 60 && passingCredits < 90) {
			return "Junior";
		}
		else {
			return "Senior";
		}
		
	}
	/**
	 * sees whether student is eligible for this PBK
	 * @return true or false depending on credentials 
	 */
	public boolean isEligibleForPhiBetaKappa() {
		if(passingCredits >= 98 && calculateGradePointAverage() >= 3.6) {
			return true;
		}
		else if(passingCredits >= 75 && calculateGradePointAverage() >= 3.8) {
			return true;
		}
		else {
			return false;
		}
		
	}
	/**
	 * increases amount of bear bucks
	 * @param amount how much you want to add
	 */
	public void depositBearBucks(double amount) {
		 bbb += amount;
	}
	/**
	 * decreases amount of bear bucks
	 * @param amount how much you want to take out
	 */
	public void deductBearBucks(double amount) {
		bbb -= amount;
	}
	/**
	 * gets the total number of bear bucks
	 * @return balance of bear bucks
	 */
	public double getBearBucksBalance() {
		return bbb;
	}
	/**
	 * takes away all you bear bucks with 10$ fee
	 * @return how many bear bucks you have - 10
	 */
	public double cashOutBearBucks() {
		double cashOut = bbb - 10;
		if(bbb < 10) {
			cashOut = 0;
		}
		bbb = 0;
		return cashOut;
	}
	/**
	 * creates a new object for a legacy student
	 * @param firstName first name of student
	 * @param other second student object
	 * @param isHyphenated if last name is hyphenated
	 * @param id number on id of student
	 * @return new student object basted off other two objects
	 */
	public Student createLegacy(String firstName, Student other, boolean isHyphenated, int id) {
		String lN = "";
		if(isHyphenated == false) {
			lN = this.lastName;
		}
		else {
			lN = this.lastName + "-" + other.getLastName();
		}
		Student legacy = new Student (firstName, lN, id);
		
		double a = this.cashOutBearBucks();
		double b = other.cashOutBearBucks();
		
		if(a > 0) {
			legacy.depositBearBucks(a);
		}
		if(b > 0) {
			legacy.depositBearBucks(b);
		}
		
		return legacy;
	}
	/**
	 * changes every thing to string
	 */
	public String toString() {
		return firstName + " " + lastName + " "+ idNumber;
	}
}
