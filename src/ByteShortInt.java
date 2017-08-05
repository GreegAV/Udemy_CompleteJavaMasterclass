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

        int long2int = (int)myLongValue;
        System.out.println(long2int);

        int int2byte = (byte)myIntMaxValue;
        System.out.println(int2byte);
    }
}
