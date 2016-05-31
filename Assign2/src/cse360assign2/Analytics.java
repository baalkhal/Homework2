package cse360assign2;

import java.util.Arrays;

public class Analytics extends OrderedIntList {
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
	
	public int median(){
		Arrays.sort(intList);
		int median = 0;
		if(count == 0)
			median = -1;
		
		else{
		if (intList.length % 2 == 0)
		    median = (intList[count/2]) + (intList[count/2 - 1]);
		
		else
		    median =  intList[count/2];}
		 
		    
		    return median ;
		}
	
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
	public int low() {
			Arrays.sort(intList);
			int low = 0;
			if (count == 0)
				low = -1;
			
			else{
				low = intList[0];}
			
			return low;
		}
	public int numInts(){
		return count;
	}
	}

	
		
	
	

