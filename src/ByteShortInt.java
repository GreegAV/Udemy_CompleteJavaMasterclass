/**
 * Created by avg-m on 05/08/2017.
 */
public class ByteShortInt {
    public static void main(String[] args) {
        int myValue=1000;

        // int has a width of 32bit
        int myIntMinValue = -2_147_483_648; // the minimum value of int variable
        int myIntMaxValue = 2_147_483_647; // the maximum variable for int variable

        // byte has a width of 8bit
        byte myByteValueMax = 127;  // the max byte value variable
        byte myByteValueMin = -128;  // minimum byte variable

        // short has width of 16
         short myShortMaxValue=32767;
         short myShortMinValue=-32768;

         // long has width of 64
        long myLongValue = 9_223_372_036_854_775_807L;

        // 1. Create a byte variable and set it to any valid byte number.
        // 2. Create a short variable and set it to any valid short number.
        // 3. Create a int variable and set it to any valid in number.
        // 4. Create a variable of type long, and make it equal to
        //    50000 + 10 times the sum of the byte, plus the short plus the int

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
        System.out.println("longTotal = " + longTotal);
        System.out.println("shortTotal = " + shortTotal);
    }
}
