
public class Selection_Sort {
	
	public void  Sort(int arr[]) {
		
		//assign n variable variable to array length
		int n =arr.length;
		
		for(int i=0;i<(n-1);i++)
		{
			//get 0 index as minimum 
			int min_index=i;
			
			for(int j=(i+1);j<n;j++)
			{
				//check 1st element less than 0th element
				if(arr[j]<arr[min_index])
				{
					min_index=j;
				}
			}
			
			//move minimum value to temporary variable
			int temp=arr[min_index];
			arr[min_index]=arr[i];
			arr[i]=temp;
		}
	}
	
	//create method for print sorted array
	public void Print(int arr[]) {
		
		System.out.println("Sorted Array using Selection Sort: ");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ "  ");
		}
	}

	public static void main(String[] args) {
		
		//create object
		Selection_Sort  SS=new Selection_Sort();
		
		//initialized the values to  array
		int num[] = {12,100,81,140,55,70};
		
		//print initialized array
		System.out.println("Entered Array is: ");
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i]+"  ");
		}
		
		
		//called methods
		SS.Sort(num);
		System.out.println("\n");
		SS.Print(num);
	}

}
