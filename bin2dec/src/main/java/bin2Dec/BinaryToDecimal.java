package bin2Dec;

public class BinaryToDecimal {
    private long id;
    private String decimal;

    public BinaryToDecimal(){
        // this.id = atomicId.incrementAndGet();
    }

    public BinaryToDecimal(long id, String binary){
        this.id = id;
        this.decimal = convertBinaryToDecimal(binary);
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
		return id;
    }

    public void setDecimal(String binaryInput) {
        this.decimal = convertBinaryToDecimal(binaryInput);
    }

    public String getDecimal() {
        return decimal;
    }


    public static String convertBinaryToDecimal(String binaryInput) {
        int decimalResult = 0;
        int length = binaryInput.length();
        int count = 0;
        for(int i = length - 1; i >= 0; i--){
            char digitChar = binaryInput.charAt(count);

            int digit = Character.getNumericValue(digitChar);

            if (digit == 1){
                decimalResult += Math.pow(2,i);
            }
            count++;
        }

        return Integer.toString(decimalResult);
    }

    public static boolean isValidInput(String input) {
        int length = input.length();
        for(int i = 0; i <= length -1; i++){
            char digitChar = input.charAt(i);

            int digit = Character.getNumericValue(digitChar);

            if (!isZeroOrOne(digit)){
                return false;
            }
        }
        return true;
    };

    public static boolean isZeroOrOne(int digit) {
        if (digit != 1 && digit != 0){
            return false;
        }
        return true;
    };
    


}