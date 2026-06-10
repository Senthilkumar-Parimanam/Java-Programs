package A_Basics.SpecialClasses.String;



import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class StringTrimStrip {

    public static void main(String[] arg){

        String st = " tes\nt   ";
        //System.out.println (st.strip());
        //System.out.println(" letfpad :: "+ StringUtils.leftPad(" 1234\n 5 ",20,'0'));
        //System.out.println(" ::"+ StringUtils.deleteWhitespace(st));
        String st2 = " tes\nt   ";
       // System.out.println(" :: "+ StringUtils.normalizeSpace(st2));
        String s3 = " test ";
        System.out.println("trim: -"+s3.trim());
        String s1 = "\n\t       a   b   c   \n";
        String s2 = "\n\t       a   b   c   \n";
        System.out.println("test St:"+ s1 );
        System.out.println("trim:"+ s1.trim());
        System.out.println("strip:"+ s2.strip());


    }
}
