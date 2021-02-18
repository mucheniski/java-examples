package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExamples {
	
	// https://www.geeksforgeeks.org/date-class-java-examples/
	private static SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");;
	
	public static void main(String[] args) {
		try {
			exemplosDateBasicos();			
		} catch (ParseException e) {
			System.out.println("Exception; " + e);
		}
	}
	
	
    public static void exemplosDateBasicos() throws ParseException  { 
        // Creating date 
        Date d1 = dateFormatter.parse("27/12/1986");
        Date dataAtual = new Date();  // Current date 
        Date d3 = dateFormatter.parse("30/03/1991"); 
        
        System.out.println("DATA ATUAL: " + dataAtual);
  
        boolean a = d3.after(d1); 
        System.out.println("Date d3 comes after " + 
                           "date d2: " + a); 
  
        boolean b = d3.before(dataAtual); 
        System.out.println("Date d3 comes before "+ 
                           "date d2: " + b); 
  
        int c = d1.compareTo(dataAtual); 
        System.out.println(c); 
  
        System.out.println("Miliseconds from Jan 1 "+ 
                "1970 to date d1 is " + d1.getTime()); 
  
        System.out.println("Before setting "+dataAtual); 
        dataAtual.setTime(204587433443L); 
        System.out.println("After setting "+dataAtual); 
    } 
	

}
