/*
FermentedAgaveJuice -- Johnny Wong, Sophia Xia, Clarence Cheng
Schedule Planner
APCS2 pd1
*/

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Event{
     // INSTANCE VARIABLES
     private String _description;
     private LocalDateTime _time;

     // CONSTRUCTOR
     public Event(String task, LocalDateTime time){
          _description = task;
          _time = time;
     }
     // METHODS

     public String getDescription(){
          return _description;
     }

     public LocalDateTime getTime(){
          return _time;
     }

     public String setDescription(String newDescription){
          String oldDescription = _description;
          _description = newDescription;
          return oldDescription;
     }

     public LocalDateTime setTime(LocalDateTime newTime){
          LocalDateTime oldTime = _time;
          _time = newTime;
          return oldTime;
     }
     public String toString(){
          String ret = "";
          ret +=  _time;
          ret += "; " + _description;
          return ret;
     }

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
