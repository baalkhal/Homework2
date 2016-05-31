/**
 * Bader Alkhaldi
 * PIN: 14
 * description: this program takes integers and keep them in an ascending order
 */


package cse360assign2;
public class OrderedIntList {
	protected int[] intList;  
	protected int count; 
	OrderedIntList (){
		
			intList = new int[10];
	}
	
	/**
	 * To insert a new number in the array
	 * @param number = the number that the user want to add to the array.
	 */
	public void insert (int number) {
		if (count == intList.length) 	
			grow();
		
		if (count == 0) {   			
			intList[0]= number;			
			count += 1;
	}
		
		else {
			int index1 = 0;
			int index3 = 0;
			boolean done = false;
		
			while (done != true && index1<count ){
		if  (number<intList[index1]) 
			done = true;
		
		else{
			index1 += 1;
			index3 += 1;
		}
			}
		for (int index2 = count; index2>index3; index2--) 
			intList[index2] = intList[index2-1];
		
			intList[index3]= number; 
		
			count+=1;}
	}
	
	/**
	 * To extend the array limit to hold more values. 
	 */
	private void grow(){
			int []temp = new int[count*2];
		
		for (int i = 0; i<count; i++ )
			temp [i] = intList[i];
			intList = temp;
	}
	
	/**
	 * to print the array elements. 5 per each line.
	 */
	public void print () {
		for (int i = 0; i<count; ) {
	
		if (i%5==0) 
			System.out.println();
			System.out.print(intList[i++]+"\t");	
	}
			System.out.println();;
	}
	}