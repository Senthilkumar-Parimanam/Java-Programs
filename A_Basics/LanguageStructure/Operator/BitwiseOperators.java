package A_Basics.LanguageStructure.Operator;

public class BitwiseOperators {

    public static void main(String[] arg){
        int a = 10;

        int leftShiftValue = a << 1;
        System.out.println(" letfShift Value is "+leftShiftValue);

        int unsignedRightShiftValue = a >> 1;
        System.out.println(" Unsigned rightShiftValue is "+unsignedRightShiftValue);

        int signedRightShiftValue = a >>> 1;
        System.out.println(" signedRightShiftValue is "+signedRightShiftValue);

        int b = 50;
        int c = a|b;
        System.out.println(" value of X-OR : "+ c);
    }


}
