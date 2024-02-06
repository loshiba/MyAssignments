package week1.day2;

public class EdgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Browser bro1=new Browser();
		
		//String browserName;
		String launchBrowser = bro1.launchBrowser("Edge");
		System.out.println(launchBrowser);
		bro1.loadUrl();
	}

}
