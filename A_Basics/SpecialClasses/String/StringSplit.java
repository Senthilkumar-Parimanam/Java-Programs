package A_Basics.SpecialClasses.String;

public class StringSplit {


    public static void main(String[] arg) {

       /* String st = "D\Users\parimanam\Senthilkumar\TestFolder\ACH_File.txt";
        System.out.println(st);
        String[] stSplit = st.split("\\\\");*/
        String str = "";
        System.out.println(" len : "+ str.length());

        String st =  "2432432"+"+"+"3443";
        //String st1 = "Testing file";
        String[] split1  = st.split("\\+");
        System.out.println(st);
        System.out.println(split1.length);
        System.out.println(split1[0]);
        System.out.println(split1[1]);



    }


    public static void splitByBlankspace() {
        String st =  "2014-11-03 00:00:00";
        //String st1 = "Testing file";
        String[] split1  = st.split(" ");
        System.out.println(split1.length);
        System.out.println(split1[0]);

    }


    public static void splitByFullstop() {
        String st = "testingfile.txt";
        //String st1 = "Testing file";
        String[] split1  = st.split("\\.");
        System.out.println(split1.length);
        System.out.println(split1[0]);

    }



    public static void splitByComma() {
		String st1 = "testing,file,txt2";
	    //String st1 = "Testing file";
        String[] split1  = st1.split("\\,");
	    System.out.println(split1.length);
	    for(int i=0,j=split1.length; i<j; i++) {
		    System.out.println(split1[i]);
	    }

    }

    public static void splitBySlash() {
        String st = "D:\\Users\\sparimanam\\Senthilkumar\\TestFolder\\ACH_File.txt";
        System.out.println(st);
        String[] stSplit = st.split("\\\\");

        System.out.println(stSplit.length);
        System.out.println(stSplit[5]);

        if (stSplit[5].contains("ACH")) {
            System.out.println("true");
        }

    }

}
