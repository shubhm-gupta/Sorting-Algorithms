public class InsertionSort {
	
	// Insertion sort function
	void sort(int arr[]) {
	for (int i=1; i<arr.length; ++i)
	{
		int key = arr[i];
		int j = i-1;
		while (j>=0 && arr[j] > key)
		{
			arr[j+1] = arr[j];
			j--;
		}
		arr[j+1] = key;
	}
	}
	
	//print array
	void printArray(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+"  ");			
		}
	}
}
