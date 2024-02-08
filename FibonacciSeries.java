package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int range= 8, firstnum = 0, secondnum = 1;
	    System.out.println("Fibonacci Series until " +range + " is:");
	    for (int i = 1; i <= range; i++) {
	    	System.out.print(firstnum + ", ");
	      // to find next term
	      int nextnum = firstnum + secondnum;
	      firstnum= secondnum;
	      secondnum = nextnum;
	      //System.out.print(firstnum + ", ");
	}

}
}