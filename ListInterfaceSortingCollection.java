package week3.homeAssignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListInterfaceSortingCollection {

	public static void main(String[] args) {
	
			List<String> listarray=new ArrayList<String>();
			String[] companyName= {"HCL", "Wipro", "Aspire Systems", "CTS"};
			
			
			for(int i=0;i<companyName.length;i++)
			{
				
				listarray.add(companyName[i]);
				
			}
			System.out.print("Given Company Name : " +listarray +"\n");
			Collections.sort(listarray);
			
			System.out.print("Company Name in descending order : ");
			for(int j=listarray.size()-1;j>=0;j--)
			{
			System.out.print(listarray.get(j)+",");
			}
		}

	}