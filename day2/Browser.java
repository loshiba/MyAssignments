package week1.day2;

public class Browser {

		public String launchBrowser(String browserName) {
	
			return browserName +" " +"Browser Launched Successfully";
		}
		
		public void loadUrl() {
			System.out.println(" Application URL loaded successfully");
		}
		
		public static void main(String[] args) {
			Browser bro=new Browser();
			String launchBrowser = bro.launchBrowser("Chrome");
			System.out.println(launchBrowser);
			//bro.launchBrowser("Chrome");
			bro.loadUrl();
			
	}

}
