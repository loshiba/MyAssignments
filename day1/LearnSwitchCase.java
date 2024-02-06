package week1.day1;

public class LearnSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String browserName = "Chrome";
		
		
		switch(browserName)
		{
		case "Edge":
			System.out.println("Edge is opened");
			break;
			
			default: 
				System.out.println(browserName+ "\n"+  "Is not in the list");
				break;

		}
	
	}
	

}
