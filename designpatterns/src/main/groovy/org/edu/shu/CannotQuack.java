package org.edu.shu;

public class CannotQuack implements Quackable {

	@Override
	public void quack() {
		System.out.println("Cannot quack");
	}

}
