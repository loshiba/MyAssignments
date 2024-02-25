package week3.homeAssignments;	

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListInterfaceSecondLargest {

	public static void main(String[] args) {
		
		
		//Declare an array {3, 2, 11, 4, 6, 7}
		int [] array= {3, 2, 11, 4, 6, 7};
		List<Integer> lsarray =new ArrayList<Integer>();
		System.out.println("Given Array :"+Arrays.toString(array));
		//Arrays.sort(array);		
		//System.out.println("Given Array after sorting is:"+Arrays.toString(array));
				
		for(int i=0;i<array.length;i++)
		{
			lsarray.add(array[i]);
		}

				Collections.sort(lsarray);
				System.out.println("Second Largest no in the given array is :"+ lsarray.get(lsarray.size()-2));
				
					}
					}
