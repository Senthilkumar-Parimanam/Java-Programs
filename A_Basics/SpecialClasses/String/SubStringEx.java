package A_Basics.SpecialClasses.String;

public class SubStringEx {


    public static void main(String[] arg){

        String addressSt = "India Has Given Buddha To The World, Not Yuddha PM Modi In Austria ";
        int length= addressSt.length();
        String address[]  = new String[30];
        int index = 0;
        int start = 0;
        int end=0;
        while((length-end)> 6){
            end += 6;
            address[index] = addressSt.substring(start, end);
            start = end;
            ++index;
        }
        address[index] = addressSt.substring(start,length);
        for(int i=0; i< index ; i++){
            System.out.println(" result : "+ address[i]);
        }




    }


}
