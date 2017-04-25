import spock.lang.Specification
import uk.q3c.simplycd.Calculator

/**
 * Created by David Sowerby on 21 Apr 2017
 */
class Integration extends Specification {

    Calculator calculator

    def setup() {
        calculator = new Calculator()
    }

    def "Add"() {

        expect:
        calculator.add(2, 3) == 5
    }

    def "subtract"() {
        expect:
        calculator.subtract(3, 2) == 1
    }

    def "multiply"() {
        expect:
        calculator.multiply(2, 2) == 4
    }
}
