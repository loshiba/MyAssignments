package week1.day2;

public class IsPalindrome {

	public static void main(String[] args) {
int input=32123;
int output=0;
int remainder;
int temp=input;

while(input >0)
{
	remainder=input%10;
	output=(output*10)+remainder;
	input=input/10;
}
if(output ==temp) {
	System.out.println(temp+ " The given number is a plaindrome");
}
else {
	System.out.println(temp+ " The given number is not a plaindrome");
}
	}

}
