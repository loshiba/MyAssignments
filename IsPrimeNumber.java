package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int input=22;
int temp =0;
if(input==0||input==1)
{
	System.out.println(input + "is not a prime number");

}
else
{
	for(int i=2;i<input-1;i++)
	{
	if(input%i==0) {
			System.out.println(input + " is not a prime number");
	temp =1;
	break;
	}	
	}	
	if(temp==0) {
		System.out.println(input + " is a prime number");
		
				}
	
}	
}
}	


