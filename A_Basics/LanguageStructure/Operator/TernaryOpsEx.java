package A_Basics.LanguageStructure.Operator;

public class TernaryOpsEx {


    public static void main(String[] args){
        int carry, sum = 19;


        carry = (sum>0)?sum /10:0;
        sum = (sum > 9)?sum%10:sum;

        System.out.println( "Carry value :: "+ carry);
        System.out.println( "Sum value :: "+ sum);





    }
}
