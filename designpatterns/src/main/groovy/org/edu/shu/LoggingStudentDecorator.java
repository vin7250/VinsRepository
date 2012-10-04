package org.edu.shu;

public class LoggingStudentDecorator extends Student {
	private final Student student;
	
	
	public LoggingStudentDecorator(Student student) {
		super();
		this.student = student;
	}

	public void register()
	{
		student.register();
		System.out.println("registered for class");
	}

}
