package org.edu.shu

import spock.lang.Specification;
import spock.lang.Unroll;

class CalculatorTest extends Specification {
	
	@Unroll
	def "#x + #y should equal #result"()
	{
		given:
		Calculator calculator = new Calculator()
		expect:
		    int sum = calculator.add(x, y)
			sum == result
		where:
		   x |  y | result
		   5 | 5  | 10
		   2 | 5  | 7
		   1 | 2  | 3
	}

}
