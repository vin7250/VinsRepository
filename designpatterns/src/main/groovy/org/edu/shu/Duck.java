package org.edu.shu;

public class Duck {
	private Flyable flyable;
	private Quackable quckable;
	
	public void setFlyable(Flyable flyable) {
		this.flyable = flyable;
	}
	public void setQuckable(Quackable quckable) {
		this.quckable = quckable;
	}
	
	
	public void fly()
	{
		this.flyable.fly();
	}
	
	public void quack()
	{
		this.quckable.quack();
	}

}
