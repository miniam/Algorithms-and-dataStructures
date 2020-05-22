/*
author - Darshan Sheth
*/


public class PrintHello 
{ 
	public void duplicheck(int [] a, int [] b) {
		 
		int count = 0;
		//Check By brute force O(n^2) time
		System.out.print("Duplicate Elements : ");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i] == b[j]) {
					if(count == 0) {
						System.out.print(a[i]);
					}else {
						System.out.print(","+a[i]);
					}
					 
					count++;
				}
			}
		}
		 
		System.out.println("\nNumber of Duplicate Elements :  "+ count); //Display number of duplicates
	}

	public static void main(String args[]) 
	{ 
		PrintHello obj = new PrintHello();
		int [] a = {1,2,3,4,5}; //Array 1
		int [] b = {6,7,1,8,2,3}; //Array 2
		obj.duplicheck(a,b);
		
	} 
} 

 
