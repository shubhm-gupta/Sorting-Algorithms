public class Project1Arrays {
	
	//To generate array of random integers of any given size
	void generateRandomArray(int[] arr, int size) {
		for (int k=0; k<size; k++)
		{
			int r = (int) (Math.random()*50000);
			arr[k] = r;
		}
	}

	//To print Unsorted array of random numbers
	void printUnsortedArray(int[] arr) {
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + "  ");
		}
	}
	
	//copy array to demonstrate sorting for each sorting type
	void copyRandomArray(int[] arr, int[] arr1) {
		for (int n=0; n<arr.length; n++)
		{
			arr1[n] = arr[n];
		}
	}
	
	// To reverse sort an array
	void reverseSortedArray(int[] arr, int[] arr1) {
		for (int i=0, j=arr.length-1; i<arr.length; i++, j--) {
			arr1[j] = arr[i];
			}
	}
	
	//calculate time taken for sorting an array
	long timeTakenforSorting(long startTime, long endTime) {
		long time = endTime - startTime;
		return time;
	}
}