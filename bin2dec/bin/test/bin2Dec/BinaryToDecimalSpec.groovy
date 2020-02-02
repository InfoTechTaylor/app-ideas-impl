package bin2Dec;

import spock.lang.*;

public class BinaryToDecimalTest extends Specification {

    @Subject
    def binaryToDecimal

    def setup(){
        binaryToDecimal = new BinaryToDecimal()
    }

    def "convert binary to decimal"() {

        expect:
        binaryToDecimal.convertBinaryToDecimal(binary) == decimal
        
        where:
        binary     | decimal
        "10"       | "2"
        "0101"     | "5"
        "1110"     | "14"
        "10111111" | "191"
    }
}