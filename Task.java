ve/*
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

/*
METHODS
+ String getDescription()
+ Time getTime()
+ String setDescription(String newDescription)
+ Time setTime(Time newTime)
 */

public class Task{
    // INSTANCE VARIABLES
    private String _description;
    private Time _time;
    
    // CONSTRUCTOR
    public Task(String task, String time){
	_description = task;
	_time = time;
    }
    // METHODS
    
    public String getDescription(){
	return _description;
    }
    
    public Time getTime(){
	return _time;
    }

    public String setDescription(String newDescription){
	String oldDescription = _description;
	_description = newDescription;
	return oldDescription;
    }

    public Time setTime(Time newTime){
	Time oldTime = _time;
	_time = newTime;
	return oldTime;
    }
    
    
    // HELPER METHODS

}
