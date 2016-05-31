package cse360assign2;

import java.util.Arrays;

public class Analytics extends OrderedIntList {

	 /**
	  * this method takes a list of numbers 
	  * @return the mean
	  */
	public double mean(){
		
		    double mean = 0;
		    if (count == 0)
		    	mean = -1;
		    
		    else 
		    {
		    	for (int index = 0; index < count; index++) 
		    		mean += intList[index];
		    
		    	mean = mean / count;
		    }
		    return mean ;
		}
	 /**
	  * this method takes a list of numbers 
	  * @return median
	  */
	public int median(){
		Arrays.sort(intList);
		int median = 0;
		if(count == 0)
			median = -1;
		
		else{
		median = intList[0]+ intList[intList.length-1]/2;
		}
		    
		    return median ;
		}
	 /**
	  * this method takes a list of numbers 
	  * @return the highest number
	  */
	
	public int high(){
		int high = 0;
		
		if (count == 0){
			 high= -1;
		}
		else{
			for(int index=0; index < count; index++ ){
				if(intList[index]>high)
					high = intList[index];
				}}
			return high;
		}
	/**
	  * this method takes a list of numbers 
	  * @return the lowest number
	  */
	
	public int low() {
			Arrays.sort(intList);
			int low = 0;
			if (count == 0)
				low = -1;
			
			else{
				low = intList[0];}
			
			return low;
		}
	
	/**
	  * this method takes a list of numbers 
	  * @return how many numbers in the list
	  */
	public int numInts(){
		return count;
	}
	}

	
		
	
	

