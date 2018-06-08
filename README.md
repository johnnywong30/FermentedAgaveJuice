# FermentedAgaveJuice
It was a chilly Wednesday morning. Successful distillery turned CS project.

## Roster: Johnny Wong, Sophia Xia, and Clarence Cheng

### Schedule Planner


  Schedule Planner presents the user a user-friendly interface in the terminal to create and modify their own Schedules. From the terminal the user can: add Events to their Schedule, remove Events, or create Schedules for their Friends.
  (Not implemented yet.) Through this program, the user will be able to check when they are free, when their Friends are free, and be notified of an upcoming Event.

### How it Works!


  Schedule Planner operates through our Driver.java file, a user interface in the Terminal. Driver.java creates an instance of Schedule for the user whether or not they have a Schedule already. If they do have a Schedule already stored in our Schedules.csv, Schedule will encapsulate a LinkedList that holds Event Objects for each Event the User has. Each column after the first in our Schedules.csv file stores each Event in the form of their time and description. If they do not have a Schedule, the user is prompted to create one or not.
  For Event, time is formatted as "yyyy-MM-dd HH:mm" and the description the user decides to input when adding. In Schedules.csv, each Event is stored as a String in the format "yyyy-MM-dd HH:mm|description"; when accessing this stored data, a LinkedList of Events is created where each stored Event from Schedules.csv is added to it. A Schedule is constructed with the name of the person it belongs to as well as this LinkedList of Events. Every time String, whether it be from user input or Schedules.csv, is parsed and formatted into a LocalDateTime through the DateTimeFormatter formatter, that formats the String to the standard of "yyyy-MM-dd HH:mm".


   From the Terminal, the user can:
   1. View their Schedule
   2. Add to their Schedule
   3. Remove from their Schedule
   4. View a Friend's Schedule
   5. Exit
   The same can be said for a Friend's Schedule!
   Each command invokes Driver methods that wrap Schedule's methods.


   Viewing a Schedule is simply printing out the Schedule.

   To add to a Schedule, Driver invokes the method addToSchedule(Schedule inputSchedule) with the current Schedule being accessed and adds to that inputSchedule via the method found in class Schedule, addEvent(Event newEvent). The newEvent is the Event instantiated based on what was inputted (the user is asked for the description and time of the Event).


   To remove from a Schedule, Driver invokes the method removeFromSchedule(Schedule inputSchedule) with the current Schedule being accessed and removes from that inputSchedule via the method found in class Schedule, removeEvent(int index). The Event removed is selected from the Schedule displayed to the user; the user inputs an int, a number of the list corresponding to an Event the Schedule currently has.

   To view a Friend's Schedule, the user inputs the Friend's name. If that Friend does not exist in Schedules.csv, the user is prompted if they would like to create this Friend's Schedule. If that Friend does exist, their Schedule is accessed in the same way as the user's Schedule and the same commands can be done as stated above.


### How to Launch!
0. $ cd .../FermentedAgaveJuice
1. $ javac Driver.java
2. $ java Driver
