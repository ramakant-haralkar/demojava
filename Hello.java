import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		
		System.out.println("Today: "+dtf.format(now));

	}

}
