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
