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

/*
Pattern Syntax
You can use the following symbols in your formatting pattern:

G	Era designator (before christ, after christ)
y	Year (e.g. 12 or 2012). Use either yy or yyyy.
M	Month in year. Number of M's determine length of format (e.g. MM, MMM or MMMMM)
d	Day in month. Number of d's determine length of format (e.g. d or dd)
h	Hour of day, 1-12 (AM / PM) (normally hh)
H	Hour of day, 0-23 (normally HH)
m	Minute in hour, 0-59 (normally mm)
s	Second in minute, 0-59 (normally ss)
S	Millisecond in second, 0-999 (normally SSS)
E	Day in week (e.g Monday, Tuesday etc.)
D	Day in year (1-366)
F	Day of week in month (e.g. 1st Thursday of December)
w	Week in year (1-53)
W	Week in month (0-5)
a	AM / PM marker
k	Hour in day (1-24, unlike HH's 0-23)
K	Hour in day, AM / PM (0-11)
z	Time Zone
'	Escape for text delimiter
'	Single quote
*/