package week1.day2;

import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] array1= {3,2,11,4,6,7};
int [] array2= {1,2,8,4,9,7};
System.out.println("Given 1st Array :"+Arrays.toString(array1));
System.out.println("Given 2nd  Array :" +Arrays.toString(array2));
for(int i=0;i<array1.length;i++) {
	
	for(int j=0;j<array2.length;j++) { 
		
		if(array1[i]==array2[j])
		{
			System.out.println("Intersection or Common elements in the 2 arrays:"+array1[i]);
			
		}
	}

}
}
}