package org.edu.shu;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private List<StudentListener> listeners = new ArrayList<StudentListener>();
	
	public void register()
	{
		// business logic
		
		// notify listeners
		for (StudentListener listener : listeners)
		{
			listener.studentChanged(this);
		}
	}
	
	public void addListener(StudentListener listener)
	{
		listeners.add(listener);
	}

}
