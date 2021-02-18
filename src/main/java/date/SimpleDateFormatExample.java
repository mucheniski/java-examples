package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * table of examples here https://www.callicoder.com/how-to-convert-parse-string-to-date-java/
 * */

public class SimpleDateFormatExample {
	
	private static SimpleDateFormat dateFormatter;
	private static String dateStr;
	
    public static void main(String[] args) {    	
    	
    	dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
    	dateStr = "2020-01-31";          
        printDate(dateStr, dateFormatter);        
        
        dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
        dateStr = "27/12/1986";          
        printDate(dateStr, dateFormatter);
        
        dateFormatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        dateStr = "27/12/1986 09:32:00";          
        printDate(dateStr, dateFormatter);
        printDateFormated(dateStr, dateFormatter);

    }
    
    private static void printDate(String dateString, SimpleDateFormat simpleDateFormat) {
        try {
            // Parsing a String to Date
            Date date = simpleDateFormat.parse(dateString);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
	
    private static void printDateFormated(String dateString, SimpleDateFormat simpleDateFormat) {    	
		try {
			Date date = simpleDateFormat.parse(dateString);
			System.out.println(simpleDateFormat.format(date));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    		    
    }	
    
}
