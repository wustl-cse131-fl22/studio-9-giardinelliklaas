package studio9;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import assignment7.Student;

public class UniversityDatabase {
	private final Map<String, Student> uni;
	
	
	public UniversityDatabase() {
		this.uni = new HashMap<String, Student>();
	}
	public UniversityDatabase(String firstName , String lastName , int idNumber) {
		this.uni = new HashMap<String, Student>();
	//	Map<String, Integer> uni = new HashMap<>();
		
	
	}

	public void addStudent(String accountName, Student student) {
		uni.put(accountName, student);
	}

	public int getStudentCount() {
		// TODO
		return uni.size();
	}

	public String lookupFullName(String accountName) {
		
		if(uni.containsKey(accountName) == false){
			return null;
		}
		
		return (uni.get(accountName)).getFullName();

	}

	public double getTotalBearBucks() {
		int total = 0;
		for(Entry<String, Student> n : uni.entrySet()) {
			total += n.getValue().getBearBucksBalance();
		}
		return total;
	}
}
