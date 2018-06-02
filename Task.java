/*
  FermentedAgaveJuice -- Johnny Wong, Sophia Xia, Clarence Cheng
  Schedule Planner
  APCS2 pd1
 */


/*
 ________                                            _                __       _                                      _____          _                 
|_   __  |                                          / |_             |  ]     / \                                    |_   _|        (_)                
  | |_ \_|.---.  _ .--.  _ .--..--.  .---.  _ .--. `| |-'.---.   .--.| |     / _ \     .--./) ,--.  _   __  .---.      | | __   _   __   .---.  .---.  
  |  _|  / /__\\[ `/'`\][ `.-. .-. |/ /__\\[ `.-. | | | / /__\\/ /'`\' |    / ___ \   / /'`\;`'_\ :[ \ [  ]/ /__\\ _   | |[  | | | [  | / /'`\]/ /__\\ 
 _| |_   | \__., | |     | | | | | || \__., | | | | | |,| \__.,| \__/  |  _/ /   \ \_ \ \._//// | |,\ \/ / | \__.,| |__' | | \_/ |, | | | \__. | \__., 
|_____|   '.__.'[___]   [___||__||__]'.__.'[___||__]\__/ '.__.' '.__.;__]|____| |____|.',__` \'-;__/ \__/   '.__.'`.____.' '.__.'_/[___]'.___.' '.__.'
                                                                                     ( ( __))                                                          

 */

import java.util.Date;
import java.time.LocalTime;

public class Task{
    
    // INSTANCE VARIABLES ------------------------------------------------------

    private String _description;
    private LocalTime _time;
    
    // CONSTRUCTORS ------------------------------------------------------

    public Task(){
	_description = "";
	_time = null;
    }
    
    public Task(String task, String time){
	_description = task;
	_time = strToTime(time);
    }
    
    // METHODS ------------------------------------------------------

    public String getDescription(){
	return _description;
    }
    
    public LocalTime getTime(){
	return _time;
    }

    public String setDescription(String newDescription){
	String oldDescription = _description;
	_description = newDescription;
	return oldDescription;
    }

    public LocalTime setTime(String newTime){
	LocalTime oldTime = _time;
	_time = strToTime(newTime);
	return oldTime;
    }
    
    
    // HELPER METHODS ------------------------------------------------------

    //Converts a String to Local Time
    //User input in format "hh:mm"
    private LocalTime strToTime(String newTime){
	//Error Handling in case User's input is invalid
	//Turn a String Object into a Time Object
	LocalTime t = LocalTime.parse(newTime);
	return t;
    }

    //Converts a String to Local Date Time
    //User input in format "yyyy-mm-ddThh:mm:ss"
    private LocalDateTime strToDateTime(String newTime){
	LocalDateTime dT = LocalDateTime.parse(newTime);
	return t;
    }

    /* MAIN METHOD
    public static void main(String[] args){
    	Task Physics = new Task("Make up Labs", "09:00");
	System.out.println(Physics.getDescription());
	System.out.println(Physics.getTime());
	System.out.println(Physics.setDescription("Make up Labs Cries T^T"));
	System.out.println(Physics.setTime("12:00"));
	System.out.println(Physics.getDescription());
	System.out.println(Physics.getTime());
	System.out.println(Physics.strToTime("12:00"));
    }
    */
}
