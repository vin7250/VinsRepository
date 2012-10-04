package org.edu.shu;

public class StudentFactory {
	
	public Student newInstance(String studentType)
	{
		switch (studentType)
		{
			case "UNDERGRAD":
				return new UndergradStudent();
			case "GRAD":
				return new GraduateStudent();
			default:
				throw new IllegalArgumentException(studentType + " is not supported");
		}
	}
	
	public Student newDynamicInstance(String studentType)
	{
		try
		{
		 return (Student) Class.forName("org.edu.shu." + 
		               studentType.substring(0, 1) + 
		               studentType.substring(1).toLowerCase() + 
		               "Student").newInstance();
		}
		catch (Exception ex)
		{
			// exception chaining 
			throw new RuntimeException(ex);
		}
	}

}
