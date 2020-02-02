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
            def result = binaryToDecimal.convertBinaryToDecimal("1110")
        then: 
            result == "14"

    }
}