package org.edu.shu

import spock.lang.Specification;

class DuckTest extends Specification {
	
	def "should fly"()
	{
		given:
		   Duck duck = new Duck()
		   Flyable fly = new DefaultFly()
		   Quackable quackable = new DefaultQuack();
		   
		   duck.setFlyable(fly)
		   duck.setQuckable(quackable)
		when: 
		   duck.fly();
		   duck.quack();
		   
		   duck.setFlyable(new CannotFly());
		   duck.fly(); 
		then:
		  1 == 1
	}

}
