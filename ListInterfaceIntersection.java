package week3.homeAssignments;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceIntersection {
	public static void main(String[] args) {
	
		
		   List<Integer> lsarray1 =new ArrayList<Integer>();
			List<Integer> lsarray2 =new ArrayList<Integer>();
			int [] input={3, 2, 11, 4, 6, 7};
			int [] input1 ={1, 2, 8, 4, 9, 7};
			
			//adding array elements to list
			
			for(int i=0;i<input.length;i++)
			{
			lsarray1.add(input[i]);	
			lsarray2.add(input1[i]);
			}
			//comparing the two list and print the intersection element in the 2 arrays
			System.out.println("Intersection of the 2 array list elements : ");
			for(int j=0;j<lsarray1.size();j++)
			{
				if(lsarray1.get(j)==lsarray2.get(j))
				{
					System.out.print(lsarray2.get(j)+" ");
				}

			}


	}

	}

	


