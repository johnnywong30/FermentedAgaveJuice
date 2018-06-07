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

import jutils.CSVRW;
import java.time.LocalDateTime;

public class History{
    
    public static void viewHistory(){
	System.out.println(getHistory());
    }

    public static String getHistory(){
	CSVRW history = new CSVRW("History.csv");
	String retStr = "========================== History ==========================\n\n";
	for(int r = 0; r < history.size(); r++){
	    for(int c = 0; c < 2; c++){
		if(c == 0){
		    retStr += LocalDateTime.parse(history.get(r,c));
		}
		if(c == 1){
		    retStr = retStr + history.get(r,c) + "\t";
		}
	    }
	    retStr += "\n";
	}
	return retStr;
    }
}
