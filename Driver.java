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

               }
               else if (response.equals("4")){

               }
               else if (response.equals("5")){
                    System.exit(0);
               }
               else{
                    System.out.println("Please select decision 1, 2, 3, 4, or 5.");
               }
          }
     }
     public static void viewSchedule(Schedule yourSchedule){
          System.out.print("\033[H\033[2J");
          System.out.flush();
          System.out.println(yourSchedule);
          decisions(yourSchedule);
     }
     public static void addToSchedule(Schedule yourSchedule){
          System.out.print("\033[H\033[2J");
          System.out.flush();
          System.out.println("Your current Schedule is as follows:");
          System.out.println(yourSchedule);
          System.out.print("Please input the name of your Event: ");
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
          yourSchedule.addEvent(addedEvent);

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


     // MAIN METHOD
     public static void main(String[] args){
          Schedule yourSchedule = initialCheck();
          decisions(yourSchedule);
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
