package hw2;

import java.util.ArrayList;

public class BigDotCom extends DotCom {
	
	private ArrayList<String> locationCells;
    private String name, size = "BIG";
    private int hp = 4;
    private int horizontal;
    
    public void setHor(int in) {
    	horizontal = in;
    }
    
    public int getHor() {
		  return horizontal;
	}
    
    public void setName(String string) {
        name = string;
    }
    
    public void setLocationCells(ArrayList<String> loc)
    {
        locationCells = loc;
    }
    
    
    public ArrayList<String> getLocationCells()
    {
        return locationCells;
    }
    
    public String getSize() {
		  return size;
	}
	
	public String checkYourself(String userInput)
    {
        String result = "miss";
        
        //用indexOf來檢查是否打中
        int index = locationCells.indexOf(userInput); 
        if (index >= 0) {
        	locationCells.set(index, userInput + "!");
            hp = hp - 1;
            if (hp == 0) {
                result = "kill";
            }
            else
            {
                result = "SMASH!";
            }
        }
        return result;
    }
}
