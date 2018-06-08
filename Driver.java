//Fermented Agave Juice
//Sophia Xia, Johnny Wong, Clarence Cheng
//APCS1 pd 1
//05-29-18

import jutils.*;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Driver{
     // INSTANCE VARIABLES
     private static String response;
     private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
     private static Schedule userSchedule;

     // METHODS
     public static Schedule initialCheck(){
          System.out.print("\033[H\033[2J");
          System.out.flush();
          response = "";
          // Check the CSV
          // Does user have Schedule?
          CSVRW Schedules = new CSVRW("Schedules.csv");

          if (Schedules.get(0, 0).equals("Schedule")){
               System.out.println("User does not have a schedule. Make one? y/n");
               while (!response.equals("y") || !response.equals("n")){
                    response = Keyboard.readString();
                    if (response.equals("y")){
                         // Creates slot for User's Schedule
                         Schedules.set(0, 0, "User");
                         // Write to file
                         Schedules.write("Schedules.csv");
                         break;
                    }
                    else if (response.equals("n")){
                         System.out.println("User does not want to create a Schedule");
                         System.exit(0);
                    }
                    // Exception handling
                    else{
                         System.out.println("Please enter y or n");
                    }
               }
               System.out.print("\033[H\033[2J");
               System.out.flush();
               System.out.println("Welcome to your Schedule!");
               Schedule yourSchedule = new Schedule("User");
               return yourSchedule;
          }
          // User does have a Schedule
          else if (Schedules.get(0, 0).equals("User")){
               System.out.println("Welcome to your Schedule!");
               Schedule yourSchedule = new Schedule("User", true);
               return yourSchedule;
          }
          return null;
     }
     public static void decisions(Schedule yourSchedule){
          response = "";
          System.out.println("What would you like to do?");
          System.out.println("1. View your Schedule.");
          System.out.println("2. Add to your Schedule.");
          System.out.println("3. Remove from your Schedule.");
          System.out.println("4. View a Friend's Schedule.");
          System.out.println("5. Exit.");
          while (!response.equals("1") || !response.equals("2") || !response.equals("3") || !response.equals("4")){
               response = Keyboard.readString();
               if (response.equals("1")){
                    viewSchedule(yourSchedule);
               }
               else if (response.equals("2")){
                    addToSchedule(yourSchedule);
               }
               else if (response.equals("3")){
                    removeFromSchedule(yourSchedule);
               }
               else if (response.equals("4")){
                    viewFriend();
               }
               else if (response.equals("5")){
                    System.exit(0);
               }
               else{
                    System.out.println("Please select decision 1, 2, 3, 4, or 5.");
               }
          }
     }
     public static void decisions(Schedule yourSchedule, Schedule friendSchedule){
          response = "";
          System.out.println("What would you like to do?");
          System.out.println("1. View " + friendSchedule.getName() + "'s Schedule.");
          System.out.println("2. Add to " + friendSchedule.getName() + "'s Schedule.");
          System.out.println("3. Remove from " + friendSchedule.getName() + "'s Schedule.");
          System.out.println("4. View another Friend's Schedule.");
          System.out.println("5. Back to your Schedule.");
          while (!response.equals("1") || !response.equals("2") || !response.equals("3") || !response.equals("4")){
               response = Keyboard.readString();
               if (response.equals("1")){
                    viewSchedule(friendSchedule);
               }
               else if (response.equals("2")){
                    addToSchedule(friendSchedule);
               }
               else if (response.equals("3")){
                    removeFromSchedule(friendSchedule);
               }
               else if (response.equals("4")){
                    viewFriend();
               }
               else if (response.equals("5")){
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println(userSchedule);
                    decisions(userSchedule);
               }
               else{
                    System.out.println("Please select decision 1, 2, 3, 4, or 5.");
               }
          }
     }
     public static void viewSchedule(Schedule inputSchedule){
          System.out.print("\033[H\033[2J");
          System.out.flush();
          System.out.println(inputSchedule);
          notification(inputSchedule);
          decisions(userSchedule, inputSchedule);
     }
     public static void addToSchedule(Schedule inputSchedule){
          System.out.print("\033[H\033[2J");
          System.out.flush();
          System.out.println("Current Schedule is as follows:");
          System.out.println(inputSchedule);
          System.out.print("Please input the name of Event: ");
          String event = Keyboard.readString();
          System.out.println("Please input the time this Event will take place in this format: ");

          System.out.println("yyyy-MM-dd HH:mm");
          System.out.println("For example:  2018-06-08 08:05 ");
          System.out.println("NOTE: We run on a 24 clock system so if you have an Event at 8:30 pm, enter 20:30 for the hh:mm");
          String time = "";
          while (!isThisDateValid(time)){
               time = Keyboard.readString();
               if (isThisDateValid(time)){
                    break;
               }
               else{
                    System.out.println("Enter the time in proper format!");
               }
          }
          LocalDateTime eventTime = LocalDateTime.parse(time, formatter);
          Event addedEvent = new Event(event, eventTime);
          // System.out.println(addedEvent);
          inputSchedule.addEvent(addedEvent);
          // back to home screen
          System.out.print("\033[H\033[2J");
          System.out.flush();
          System.out.println(inputSchedule);
          decisions(userSchedule, inputSchedule);

     }
     public static void removeFromSchedule(Schedule inputSchedule){
          System.out.print("\033[H\033[2J");
          System.out.flush();
          System.out.println("Current Schedule is as follows:");
          System.out.println(inputSchedule);
          if (inputSchedule.size() > 0){
               System.out.println("Which Event would you like to remove?\nEnter the position of the Event you'd like to remove in the above list.");
               int num = 0;
               while (num == 0){
                    num = Keyboard.readInt();
                    if (num > 0 && num <= inputSchedule.size()){
                         inputSchedule.removeEvent(num);
                    }
                    else{
                         num = 0;
                         System.out.println("Remove a valid Event!");
                    }
               }
          }
          else{
               System.out.println("There are no Events in Schedule!");
          }
          // back to home screen
          System.out.print("\033[H\033[2J");
          System.out.flush();
          System.out.println(inputSchedule);
          decisions(userSchedule, inputSchedule);
     }
     public static void viewFriend(){
          response = "";
          Friend newFriend;
          System.out.println("Who's Schedule are you trying to view?");
          response = Keyboard.readString();
          CSVRW thisSchedule = new CSVRW("Schedules.csv");
          for (int r = 0; r <= thisSchedule.size(); r++){
               if (r == thisSchedule.size()){
                    System.out.println("This person's Schedule does not exist. Make one? y/n");
                    String answer = "";
                    while (answer.length() == 0){
                         answer = Keyboard.readString();
                         if (answer.equals("y")){
                              newFriend = new Friend(response);
                              thisSchedule.addRow();
                              thisSchedule.set(thisSchedule.size() - 1, 0, response);
                              thisSchedule.write("Schedules.csv");
                              System.out.println("This is your Friend " + response + "'s Schedule" );
                              System.out.println(newFriend.getSchedule());
                              System.out.print("\033[H\033[2J");
                              System.out.flush();
                              System.out.println(newFriend.getSchedule());
                              decisions(userSchedule, newFriend.getSchedule());
                              break;
                         }
                         else if (answer.equals("n")){
                              System.out.println("No new Schedule has been created for " + response + ".");
                              break;
                         }
                         else{
                              answer = "";
                              System.out.println("Input is invalid. Try again.");
                         }
                    }
               }
               else if (thisSchedule.get(r, 0).equals(response)){
                    newFriend = new Friend(response, true);
                    System.out.println("This is your Friend " + response + "'s Schedule" );
                    System.out.println(newFriend.getSchedule());
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println(newFriend.getSchedule());
                    decisions(userSchedule, newFriend.getSchedule());

               }
          }

     }
     public static boolean isThisDateValid(String dateToValidate){
          if (dateToValidate == null){
               return false;
          }
          if (dateToValidate.length() != "yyyy-MM-dd HH:mm".length()){
               return false;
          }
          return true;
     }
     public static void notification(Schedule inputSchedule){
          LocalDateTime currentTime = LocalDateTime.now().withSecond(0).withNano(0);
          for (Event event: inputSchedule.getEvents()){
               for (int minutes = 5; minutes > -1; minutes--){
                    if (event.getTime().minusMinutes(minutes).isEqual(currentTime) && minutes == 0){
                         String notifier =  event.getDescription() + " has started!";
                         String red = "\u001B[31m";
                         String reset = "\u001B[0m";
                         notifier = red + notifier + reset +"\n";
                         System.out.println(notifier);
                         break;
                    }
                    else if (event.getTime().minusMinutes(minutes).isEqual(currentTime)){
                         String notifier = event.getDescription() + " is about to start in " + minutes + " minutes!";
                         String red = "\u001B[31m";
                         String reset = "\u001B[0m";
                         notifier = red + notifier + reset +"\n";
                         System.out.println(notifier);
                         break;
                    }
               }
          }
     }


     // MAIN METHOD
     public static void main(String[] args){
          userSchedule = initialCheck();
          decisions(userSchedule);
          // Yes then open schedule
          // No then make schedule

          // What would user like to do?
          // exit, view, addstuff, check friend
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
