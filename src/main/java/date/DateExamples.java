package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExamples {
	
	// https://www.geeksforgeeks.org/date-class-java-examples/
	private static SimpleDateFormat diaMesAnoFormater = new SimpleDateFormat("dd/MM/yyyy");
	private static SimpleDateFormat horaMinutoFormater = new SimpleDateFormat("HH:mm");
	private static SimpleDateFormat diaFormater = new SimpleDateFormat("E");

	public static void main(String[] args) {

		try {

            String valorData = "2021-04-13T18:40:53.199Z";
            Date data = DateConversor.convertUTCToDate(valorData);
            System.out.println("Data " + data);
            System.out.println(diaMesAnoFormater.format(data));
            System.out.println(horaMinutoFormater.format(data));
            System.out.println(diaFormater.format(data));

            System.out.println(diaFormater.format(data) +"., "+ diaMesAnoFormater.format(data) +" às "+ horaMinutoFormater.format(data));


		} catch (ParseException e) {
			System.out.println("Exception; " + e);
		}
	}
	
	
    public static void exemplosDateBasicos() throws ParseException  { 
        // Creating date 
        Date d1 = diaMesAnoFormater.parse("27/12/1986");
        Date dataAtual = new Date();  // Current date 
        Date d3 = diaMesAnoFormater.parse("30/03/1991");
        
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
