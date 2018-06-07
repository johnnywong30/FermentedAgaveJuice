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
import jutils.*;
public class Habit{

    //Instance Variables
    private String[] _keywords;
    private double[] _counter;

    //Methods
    public static void viewHabitChart(){
	System.out.println(habitChart());
    }

    //returns string version of the chart
    public static String habitChart(){
	String retStr = "";
	CSVRW habits = new CSVRW("Habits.csv");
	for(int r = 0; r < habits.size() -1; r++){
	    for(int c = 0; c < 2; c++){
		if(c == 0){
		    retStr = retStr + habits.get(r,c) + "\t";
		}
		if(c == 1){
		    int ctr = habits.get(r,c);
		    while(ctr > 0){
			retStr = retStr + "X";
               ctr
		    }
		}
	    }
	    retStr += "\n";
	}

    }
    /*
      public void calculateHabits(){

      }

      public double sumArray(){

      }

      public double percentageOfHabit(String keyword){

      }
    */
    public static void main(String[] args){
	viewHabitChart();
    }
}
