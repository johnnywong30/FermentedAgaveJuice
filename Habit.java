/*
  ________                                            _                __       _                                      _____          _
  |_   __  |                                          / |_             |  ]     / \                                    |_   _|        (_)
  | |_ \_|.---.  _ .--.  _ .--..--.  .---.  _ .--. `| |-'.---.   .--.| |     / _ \     .--./) ,--.  _   __  .---.      | | __   _   __   .---.  .---.
  |  _|  / /__\\[ `/'`\][ `.-. .-. |/ /__\\[ `.-. | | | / /__\\/ /'`\' |    / ___ \   / /'`\;`'_\ :[ \ [  ]/ /__\\ _   | |[  | | | [  | / /'`\]/ /__\\
  _| |_   | \__., | |     | | | | | || \__., | | | | | |,| \__.,| \__/  |  _/ /   \ \_ \ \._//// | |,\ \/ / | \__.,| |__' | | \_/ |, | | | \__. | \__.,
  |_____|   '.__.'[___]   [___||__||__]'.__.'[___||__]\__/ '.__.' '.__.;__]|____| |____|.',__` \'-;__/ \__/   '.__.'`.____.' '.__.'_/[___]'.___.' '.__.'
  ( ( __))

  FermentedAgaveJuice -- Johnny Wong, Sophia Xia, Clarence Cheng
  Schedule Planner
  APCS2 pd1
*/
<<<<<<< HEAD

import jutils.CSVRW;
=======
import jutils.*;
public class Habit{
>>>>>>> 163ae97a84fb9c87ec2cdf2c8be3e9078e15fb66

public class Habit{

    //Methods
    //viewHabitChart: prints out the information stored in the CSV file
    public static void viewHabitChart(){
	System.out.println(habitChart());
    }

    //habitChart: helper method for viewHabitChart
    //returns string version of the informtation in the CSV
    public static String habitChart(){
	String retStr = "========================== Habit Tracker ==========================\n\n";
	CSVRW habits = new CSVRW("Habits.csv");
	for(int r = 0; r < habits.size(); r++){
	    for(int c = 0; c < 2; c++){
		if(c == 0){
		    retStr = retStr + habits.get(r,c) + "\t";
		}
		if(c == 1){
		    int ctr = Integer.parseInt(habits.get(r,c));
		    while(ctr > 0){
			retStr = retStr + "X";
<<<<<<< HEAD
			ctr --;
=======
               ctr
>>>>>>> 163ae97a84fb9c87ec2cdf2c8be3e9078e15fb66
		    }
		}
	    }
	    retStr += "\n";
	}
<<<<<<< HEAD
	retStr += "\n===================================================================";
	return retStr;
=======

>>>>>>> 163ae97a84fb9c87ec2cdf2c8be3e9078e15fb66
    }

    
    public static void calculateHabits(String keyword){
	System.out.println(percentageOfHabit(keyword) + "%");
    }

    //percentageOfHabits
    public static double percentageOfHabit(String keyword){
	CSVRW habits = new CSVRW("Habits.csv");
	double percentage = 0.0;
	double total = 0.0;
	for(int r = 0; r < habits.size(); r++){
	    if(habits.get(r, 0).equals(keyword)){
		percentage = (double)Integer.parseInt(habits.get(r,1));
	    }
	    total += (double)Integer.parseInt(habits.get(r,1));
	}
	percentage = percentage * 100 / total;
	return percentage;
    }
}
