/*
FermentedAgaveJuice -- Johnny Wong, Sophia Xia, Clarence Cheng
Schedule Planner
APCS2 pd1
*/
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Friend{
     // INSTANCE VARIABLES
     private String _name;
     private Schedule _schedule;

     // CONSTRUCTOR
     public Friend(String name){
          _name = name;
          _schedule = new Schedule(name);
     }

     public Friend(String name, boolean hasSchedule){
          _name = name;
          _schedule = new Schedule(_name, true);
     }

     // METHODS
     public String getName(){
          return _name;
     }
     public Schedule getSchedule(){
          return _schedule;
     }
     public void addEvent(Event newEvent){
          _schedule.addEvent(newEvent);
     }
     public Event removeEvent(int index){
          return _schedule.removeEvent(index);
     }
     // public void changeEventTime(LocalDateTime originalTime, LocalDateTime newTime){
     //
     // }
     // public void viewFreeTime(){
     //
     // }
     // public LocalDateTime getFreeTime(){
     //
     // }

     // HELPER METHODS
}


/*
 ________                                            _                __       _                                      _____          _
|_   __  |                                          / |_             |  ]     / \                                    |_   _|        (_)
  | |_ \_|.---.  _ .--.  _ .--..--.  .---.  _ .--. `| |-'.---.   .--.| |     / _ \     .--./) ,--.  _   __  .---.      | | __   _   __   .---.  .---.
  |  _|  / /__\\[ `/'`\][ `.-. .-. |/ /__\\[ `.-. | | | / /__\\/ /'`\' |    / ___ \   / /'`\;`'_\ :[ \ [  ]/ /__\\ _   | |[  | | | [  | / /'`\]/ /__\\
 _| |_   | \__., | |     | | | | | || \__., | | | | | |,| \__.,| \__/  |  _/ /   \ \_ \ \._//// | |,\ \/ / | \__.,| |__' | | \_/ |, | | | \__. | \__.,
|_____|   '.__.'[___]   [___||__||__]'.__.'[___||__]\__/ '.__.' '.__.;__]|____| |____|.',__` \'-;__/ \__/   '.__.'`.____.' '.__.'_/[___]'.___.' '.__.'
                                                                                     ( ( __))
 */
