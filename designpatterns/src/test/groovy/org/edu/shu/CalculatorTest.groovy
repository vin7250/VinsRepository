package org.edu.shu

import spock.lang.Specification;
import spock.lang.Unroll;

class CalculatorTest extends Specification {
    private Calculator calculator

    def setup()
    {
        calculator = new Calculator();
    }
	
	@Unroll
	def "#x + #y should equal #result"()
	{
		expect:
		    int sum = calculator.add(x, y)
			sum == result
		where:
		   x |  y | result
		   5 | 5  | 10
		   2 | 5  | 7
		   1 | 2  | 3
	}

    @Unroll
    def "should only add positive numbers"()
    {
        when: "i add two numbers"
          calculator.add(-1, 5)
        then:
           thrown(IllegalArgumentException)
    }

}
