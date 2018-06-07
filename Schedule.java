/*
  FermentedAgaveJuice -- Johnny Wong, Sophia Xia, Clarence Cheng
  Schedule Planner
  APCS2 pd1
 */
 import jutils.*;
 import java.util.LinkedList;
 import java.time.LocalDate;
 import java.time.LocalTime;
 import java.time.LocalDateTime;

 public class Schedule{
      // INSTANCE VARIABLES
      private String _name;
      private LinkedList<Event> _events;
      // private Habit _habits;
      // private History _history;

      // CONSTRUCTOR
      public Schedule(String name){
           _name = name;
           _events = new LinkedList<Event>();
           // _habits = new Habits(_name);
           // _history = new History(_name);
      }

      // METHODS
      // public void notify(){
      //
      // }
      /*

     public void changeEventTime(LocalDateTime originalTime, LocalDateTime newTime){

     }
     public void viewFreeTime(){

     }
     public LocalDateTime getFreeTime(LocalDateTime specifiedTime){

     }
     public void viewSharedFreeTime(String friendName){

     }
     */
      public String getName(){
           return _name;
      }

      public String toString(){
           String ret = "";
           ret = getName() + "'s Schedule\n";
           // Format of Schedule
           // Time -- Event
           for (int i = 0; i < size(); i++){
                int listOrder = i + 1;
                ret += listOrder + ". " + _events.get(i).getTime() + " -- " + _events.get(i).getDescription() + "\n";
           }
           return ret;
      }
      public void addEvent(Event newEvent){
           // if _events is currently empty, set head to newEvent
           if (size() == 0){
                _events.add(newEvent);
           }
           else if (size() == 1){
                if (_events.getFirst().getTime().compareTo(newEvent.getTime()) == - 1){
                     _events.add(newEvent);
                     System.out.println("Your Event has been added at time " + newEvent.getTime());
                }
                else if (_events.getFirst().getTime().compareTo(newEvent.getTime()) == 1){
                     _events.addFirst(newEvent);
                     System.out.println("Your Event has been added at time " + newEvent.getTime());
                }
                else{
                     overwrite(0, newEvent);
                }
           }
           else{// otherwise
                // iterate through current _events to find where to place newEvent
                // based on _time
                for (int i = 0; i < _events.size(); i++){
                     // found correct index for newEvent
                     if (_events.get(i).getTime().compareTo(newEvent.getTime()) == -1){
                          if (_events.get(i + 1) == null){
                               _events.add(newEvent);
                               System.out.println("Your Event has been added at time " + newEvent.getTime());
                               break;
                          }
                          else if (_events.get(i + 1).getTime().compareTo(newEvent.getTime()) == 1){
                               _events.add(i + 1, newEvent);
                               System.out.println("Your Event has been added at time " + newEvent.getTime());
                               break;
                          }
                     }
                     // there is an Event already scheduled with the same time as newEvent
                     else if (_events.get(i).getTime().compareTo(newEvent.getTime()) == 0){
                          overwrite(i, newEvent);
                     }
                }
           }
           writeToCSV(getName());
      }
      public Event removeEvent(int index){
           Event removedEvent = _events.remove(index - 1);
           writeToCSV(getName());
           return removedEvent;
      }
      // HELPER METHODS
      public void overwrite(int index, Event newEvent){
           System.out.println("It seems like you have an Event at this time slot already.");
           System.out.println("Replace? y/n");
           String response = "";
           while (!response.equals("y") || !response.equals("n")){
                response = Keyboard.readString();
                if (response.equals("y")){
                     _events.add(index, newEvent);
                     System.out.println("Your Event has been added at time " + newEvent.getTime() + "\n");
                     break;
                }
                else if (response.equals("n")){
                     System.out.println("Your Event has not been added\n" );
                     break; // exit loop
                }
                else{
                     System.out.println("Please enter y or n");
                }
           }
      }
      public int size(){
           return _events.size();
      }

      public void writeToCSV(String name){
           CSVRW thisSchedule = new CSVRW("Schedules.csv");
           for (int r = 0; r < thisSchedule.size(); r++){
                if (thisSchedule.get(r, 0).equals(name)){
                     for (int c = 0; c < size(); c++){
                          // sets each sequential column to each Event in this Schedule
                          thisSchedule.set(r, c + 1, _events.get(c).toString());
                     }
                     thisSchedule.write("Schedules.csv");
                     break;
                }

           }
      }

      public static void main(String[] args){
           Schedule test = new Schedule("johnny");
           test.addEvent(new Event("test", LocalDateTime.now()));
           test.addEvent(new Event("test5", LocalDateTime.now().plusHours(5)));
           System.out.println(test);
           test.removeEvent(1);
           System.out.println(test);
      }
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
