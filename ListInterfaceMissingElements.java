package week3.homeAssignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListInterfaceMissingElements {

	public static void main(String[] args) {
		
			int[] input= {1, 2, 3, 4, 10, 6, 8};
			List<Integer> lsinput=new ArrayList<Integer>();
			
			for(int i=0;i<input.length;i++)
			{
				lsinput.add(input[i]);
			}
			Collections.sort(lsinput);
			System.out.println("Given array after sorting :" +lsinput);
			for(int i=0;i<lsinput.size()-1;i++)
			{
				if(((lsinput.get(i))+1)!=lsinput.get((i+1)))
				{
					System.out.println("Missing Elements in the array  : "+(lsinput.get(i)+1));
				}
			}
			

		}

	}


