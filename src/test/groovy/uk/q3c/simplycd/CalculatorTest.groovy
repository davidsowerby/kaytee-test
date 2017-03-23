package uk.q3c.simplycd

import spock.lang.Specification

/**
 * Created by David Sowerby on 23 Mar 2017
 */
class CalculatorTest extends Specification {

    Calculator calculator

    def setup() {
        calculator = new Calculator()
    }

    def "Add"() {

        expect:
        calculator.add(2, 3) == 5
    }
}
