package bin2Dec;

import spock.lang.*;

public class BinaryToDecimalTest extends Specification {

    @Subject
    def binaryToDecimal

    def setup(){
        binaryToDecimal = new BinaryToDecimal()
    }

    def "convert binary to decimal"() {
        when:
            def result = binaryToDecimal.convertBinaryToDecimal("1010")
        then: 
            result = "101"

    }
}