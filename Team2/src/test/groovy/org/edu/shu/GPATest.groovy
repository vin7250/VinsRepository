package org.edu.shu;

import spock.lang.Specification;

public class GPATest extends Specification {
	def "should calculate a student's GPA"()
	{
		given: "The student has completed courses at SHU"
		    int studentID = 12342
		    StudentAccess studentAccess = Mock(StudentAccess)
			GPA gpa = new GPA(studentAccess)
		when:
		     float result = gpa.calculate(studentID)
	    then:
		    1 * studentAccess.findGrades(studentID) >> [3, 3, 4, 4].toSet()
			
			result == 3.5
		
	}
	

}
