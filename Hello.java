import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println("Demo java new commit");
		System.out.println("Demo java new commit 09-10-2019");
		System.out.println("Demo java new commit 2nd 09-10-2019");
		System.out.println("Today: "+dtf.format(now));

	}

}
