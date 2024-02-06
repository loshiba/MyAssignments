package week1.day2;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={2, 5, 7, 7, 5, 9, 2, 3};
		int arrLength =num.length;
		System.out.println("Length of given array is :" +"\n" +arrLength);
		Arrays.sort(num);

			System.out.println("Given Array after sorting :" +"\n" +Arrays.toString(num));	
		
	for(int i=0; i<num.length;i++)
	{
	for(int j=i+1;j<num.length;j++)	
	{
		if(num[i]==num[j])
		{
			
			System.out.println("Duplicate numbers in the Array is :" +num[i]);
		}
	}
	}

}
}