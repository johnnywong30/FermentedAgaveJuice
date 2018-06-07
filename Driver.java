//Fermented Agave Juice
//Sophia Xia, Johnny Wong, Clarence Cheng
//APCS1 pd 1
//05-29-18

import jutils.*;

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
               while (!response.equals("y")){
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

     // MAIN METHOD
     public static void main(String[] args){
          initialCheck();

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
