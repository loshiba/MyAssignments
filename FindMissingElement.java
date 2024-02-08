package week1.day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]input = {1,4,3,2,8,6,7};
int arrLength=input.length;
System.out.println("Length of the given array is: " +arrLength);

Arrays.sort(input);
System.out.println("Given Array after sorting :"+Arrays.toString(input));
for(int i=0;i<input.length;i++)
{
if(input[i]!=i+1){
	System.out.println("Missing number in the array is:"+(i+1));
	break;
}
	}


}
}

