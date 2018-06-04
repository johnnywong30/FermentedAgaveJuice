import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Scanner;


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

		//stolen from some Q&A Forum and editedx
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a number: ");
		int a = reader.nextInt();//HOURS, MILITARY TIME/24 HOUR CLOCK
		while(a < LocalTime.now().getHour() || a > 24){
		    System.out.println("nope");
		    a = reader.nextInt();
		}
		
		int b = reader.nextInt();//MINUTES
		while(b > 60){
		       System.out.println("nope");
		     b = reader.nextInt();
		}
			
		int c = reader.nextInt();//SECONDS, WILL BE REMOVED EVENTUALLY
		while(c > 60){
		       System.out.println("nope");
		    c = reader.nextInt();
		}
		System.out.println("wait");	
		reader.close();
		//edited stolen stuff
		
		LocalTime pew = LocalTime.of(a,b,c);
		
		while( currentTime.isBefore(pew)){
		    currentTime = LocalTime.now();
		}
		System.out.println(currentTime.isBefore(pew));
		System.out.println(",,,,,,,,,,,,,");
		System.out.println(currentTime);
		System.out.println(pew);
    }}
