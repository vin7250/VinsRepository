package org.edu.shu;

import groovy.sql.Sql

public class StudentAccess implements StudentListener {
	private final StudentFactory studentFactory;

	public StudentAccess(StudentFactory studentFactory) {
		super();
		this.studentFactory = studentFactory;
	}
	
	public Student findStudent(int studentId)
	{
		Sql sql = new Sql();
		
		def row = sql.firstRow("select * from student where studentId = ?", [studentId])
		Student student = studentFactory.newDynamicInstance(row.student_type);
        student.addListener(this)
		return student; 
		
	}

	@Override
	public void studentChanged(Student student) {
		Sql sql = new Sql();
		sql.update("update student set registered = 1 where id = ?", [student.id])
		
		
	}
	
	
	
}
