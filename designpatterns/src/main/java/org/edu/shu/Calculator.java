package org.edu.shu;

/**
 * Created with IntelliJ IDEA.
 * User: paulsideleau
 * Date: 9/25/13
 * Time: 7:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class Calculator {
    /**
     * @throws IllegalArgumentException if number is negative
     */
    public int add(int x, int y) {
        if (x < 0)
        {
            throw new IllegalArgumentException("only positive numbers are allowed") ;
        }
        return x + y;
    }
}
