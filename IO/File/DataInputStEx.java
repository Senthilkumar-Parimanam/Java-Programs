package IO.File;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataInputStEx {
	
	
	public static void main(String[] arg){
		
		//C:\\Users\\sony\\Desktop\\MerchantDirectory_20180112
		try {
			FileReader fileReader = new FileReader("C:\\Users\\sony\\Desktop\\MerchantDirectory_20180112.txt");
			BufferedReader bufReader = new BufferedReader(fileReader);
			int givenCount=0, actualCount=0;
			String record,footerRecord[] ; 
			while((record = bufReader.readLine()) != null){
				 if(record.contains("3|")){
					 	++actualCount;
				 	}else if(record.contains("2|"))
				 		break;
			}
			footerRecord = record.split("\\|");
			System.out.println("Actual Count is:  "+ actualCount);
			System.out.println("Last Record is :  "+ record);
			givenCount = new Integer(footerRecord[footerRecord.length-1]).intValue();
			System.out.println("Given count is :  "+givenCount );
		} catch (FileNotFoundException fileNotfoound) {
			// TODO Auto-generated catch block
			fileNotfoound.printStackTrace();
		}
		catch (IOException ioExp) {
			// TODO Auto-generated catch block
			ioExp.printStackTrace();
		}
	}

}
