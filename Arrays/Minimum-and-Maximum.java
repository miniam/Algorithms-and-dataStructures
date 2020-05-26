
public class CalculateMinMax 
{ 
	public void MinMaxcheck(int [] a) { //method to find minmax
		int min = a[0];
		int max = 0;
		for(int i=0;i<a.length;i++) {
			int CurrentElement = a[i];
			if(min >= CurrentElement) {
				min = CurrentElement;
			}
			if(max <= CurrentElement) {
				max = CurrentElement;
			}
		}
		 
		System.out.println("\nMin : "+ min + "\nMax : "+ max ); //Display min and max elements
	}

	public static void main(String args[]) 
	{ 
		CalculateMinMax obj = new CalculateMinMax(); //Create a class object
		int [] a = {10,6,2,3,4,5,8}; //Array to find min and max element
	
		obj.MinMaxcheck(a);
		
	} 
} 
