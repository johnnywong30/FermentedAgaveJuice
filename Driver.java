//Fermented Agave Juice
//Sophia Xia, Johnny Wong, Clarence Cheng
//APCS1 pd 1
//05-29-18

import jutils.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class Driver{
     // INSTANCE VARIABLES
     private static String response;

     // METHODS
     public static void initialCheck(){
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
          }
          // User does have a Schedule
          else if (Schedules.get(0, 0).equals("User")){
               System.out.println("Welcome to your Schedule!");
          }
     }
     public static void decisions(){
          response = "";
          System.out.println("What would you like to do?");
          System.out.println("1. Add to your Schedule.");
          System.out.println("2. View your Schedule.");
          System.out.println("3. View a Friend's Schedule.");
          System.out.println("4. Exit.");
          while (!response.equals("1") || !response.equals("2") || !response.equals("3") || !response.equals("4")){
               response = Keyboard.readString();
               if (response.equals("1")){

               }
               else if (response.equals("2")){

               }
               else if (response.equals("3")){

               }
               else if (response.equals("4")){
                    System.exit(0);
               }
               else{
                    System.out.println("Please select decision 1, 2, 3, or 4.");
               }
          }
     }
     

     // MAIN METHOD
     public static void main(String[] args){
          initialCheck();
          decisions();
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
