package org.edu.shu;

public class GPA {
	private StudentAccess studentAccess;
	
	
	public GPA(StudentAccess studentAccess) {
		this.studentAccess = studentAccess;
	}


	public float calculate(int studentID)
	{
		
		def grades = studentAccess.findGrades(studentID)
		
		return  grades.sum() / grades.size()
	}

}
