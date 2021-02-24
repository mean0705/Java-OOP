package hw2;

import java.util.ArrayList;

public abstract class DotCom {
    private ArrayList<String> locationCells;
    private String name; 
    private String size = "null";
    private int hp;
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
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
            }
            else
            {
                result = "hit";
            }
        }
        return result;
    }

    //TODO:  all the following code was added and should have been included in the book
    
}
