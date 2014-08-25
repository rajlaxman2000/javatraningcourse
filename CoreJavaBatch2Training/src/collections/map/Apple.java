package collections.map;

import java.util.HashMap;

public class Apple {
	
	private String color;
 
	public Apple(String color) {
		this.color = color;
	}
	
	public int hashCode(){
		if(this.color.equalsIgnoreCase("redGreen")){
			return ("red").length();
		}
		return this.color.length();
	}
 
	public boolean equals(Object obj) {
		
		if (!(obj instanceof Apple))
			return false;	
		if (obj == this)
			return true;
		
		return this.color.equals(((Apple) obj).color);
	}
	
	public String toString(){
		return color;
	}
 
	
}
