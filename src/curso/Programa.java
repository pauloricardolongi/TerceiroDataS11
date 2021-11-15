package curso;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Programa {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date x1 = new Date(); 
		
		
		
		System.out.println("x1: " + sdf2.format(x1));
		
	}

}
