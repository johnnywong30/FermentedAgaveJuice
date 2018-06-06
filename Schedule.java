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
import java.util.LinkedList;
public class Schedule{
    // INSTANCE VARIABLES
    private LinkedList<Event> _events;
    private Habit _habits;
    private History _history;
    private String _name;
    
    // CONSTRUCTOR
    public Schedule(String name){
	_name = name;
	_events = new LinkedList<Event>();
	_habits = new Habits(_name);
	_history = new History(_name);
    }

    // METHODS
    public void notify(){
	
    }
    public String toString(){

    }
    public void addEvent(Event newEvent){
	_events.add(newEvent);
    }
    public Event removeEvent(Time timeOfEvent){

    }
    public void changeEventTime(Time originalTime, Time newTime){

    }
    public void viewFreeTime(){

    }
    public Time getFreeTime(Time specifiedTime){

    }
    public void viewSharedFreeTime(String friendName){

    }
}
