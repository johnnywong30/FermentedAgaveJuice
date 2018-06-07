/*
FermentedAgaveJuice -- Johnny Wong, Sophia Xia, Clarence Cheng
Schedule Planner
APCS2 pd1
*/
public class Habit{

     //Instance Variables
     private String[] _keywords;
     private double[] _counter;

     //Methods
     public void viewHabitChart(){
          System.out.println(habitChart());
     }

     //returns string version of the chart
     public String habitChart(){
          CSVRW(Habit.csv);
          //ArrayList<ArrayList<String>> chart = CSVRW.get();
          return Habit.csv;
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


/*
 ________                                            _                __       _                                      _____          _
|_   __  |                                          / |_             |  ]     / \                                    |_   _|        (_)
  | |_ \_|.---.  _ .--.  _ .--..--.  .---.  _ .--. `| |-'.---.   .--.| |     / _ \     .--./) ,--.  _   __  .---.      | | __   _   __   .---.  .---.
  |  _|  / /__\\[ `/'`\][ `.-. .-. |/ /__\\[ `.-. | | | / /__\\/ /'`\' |    / ___ \   / /'`\;`'_\ :[ \ [  ]/ /__\\ _   | |[  | | | [  | / /'`\]/ /__\\
 _| |_   | \__., | |     | | | | | || \__., | | | | | |,| \__.,| \__/  |  _/ /   \ \_ \ \._//// | |,\ \/ / | \__.,| |__' | | \_/ |, | | | \__. | \__.,
|_____|   '.__.'[___]   [___||__||__]'.__.'[___||__]\__/ '.__.' '.__.;__]|____| |____|.',__` \'-;__/ \__/   '.__.'`.____.' '.__.'_/[___]'.___.' '.__.'
                                                                                     ( ( __))
 */
