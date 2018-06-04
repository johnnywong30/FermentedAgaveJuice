import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;

public class timey{
    //	LocalTime currentTime = LocalTime.now();
    //String[] pow = new String[2];
    
    // public 
    public static void main(String[] args){
	//LocalDateTime currentTime = LocalDateTime.now();
	LocalTime currentTime = LocalTime.now();
        	
		System.out.println(currentTime);	      

		/* WORKS BUT TEMPORARILY COMMENTED FOR TESTING
		LocalTime wow = LocalTime.now().plusSeconds(30);
		//System.out.println(wow.compareTo(currentTime));
		while( currentTime.isBefore(wow)){
		    currentTime = LocalTime.now();
		}
		System.out.println(",,,,,,,,,,,,,");
		System.out.println(currentTime);
		System.out.println(wow);
		*/

		LocalTime pew = LocalTime.of(17,59,15);
		while( currentTime.isBefore(pew)){
		    currentTime = LocalTime.now();
		}
		System.out.println(currentTime.isBefore(pew));
		System.out.println(",,,,,,,,,,,,,");
		System.out.println(currentTime);
		System.out.println(pew);
    }}
