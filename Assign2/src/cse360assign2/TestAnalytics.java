package cse360assign2;

public class TestAnalytics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Analytics test = new Analytics();

	for (int index=0; index < 10; index++ ){
		test.insert(index);
	}
	test.print();
	
	System.out.println("the mean is: "+test.mean());
	System.out.println("the median is: "+test.median());
	System.out.println("the high is: "+test.high());
	System.out.println("the low is: "+test.low());
	System.out.println("the numInts is: "+test.numInts());
	
	

	}

}
