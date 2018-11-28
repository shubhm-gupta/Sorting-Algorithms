
public class MergeSort {
	void merge(int[] arr, int l, int m, int r) {
			
			int n1= m-l+1;    // index 0 to middle element
			int n2= r-m;     // index middle element +1 to last element
			
			//Create two new arrays with half the number of elements 
			int[] arr1= new int[n1];
			int[] arr2= new int[n2];
			
			//Copying the elements to these new arrays
			for (int i =0; i<n1; i++)
				arr1[i]= arr[l+i];
			for (int j=0; j<n2; j++)
				arr2[j]=arr[m+1+j];
				
			int i=0; int j=0;  //Initial Index of both sub-arrays
			int k =l; // Initial Index of new sub-array where the sorted sequence will be stored
			
			while (i<n1 && j<n2)
			{
				if (arr1[i] < arr2[j])
				{
					arr[k] = arr1[i];
					i++;
				}
				else
				{
					arr[k] = arr2[j];
					j++;
				}
			k++;	
			}
			
			//copying remaining elements of first sub-array
			while (i<n1)
			{
				arr[k] = arr1[i];
				i++;
				k++;
			}
			
			//copying remaining elements of second sub-array
			while (j<n2)
			{
				arr[k] = arr2[j];
				j++;
				k++;
			}
	}

	//merge sort main function
	void mergeSort(int[] arr, int l, int r) {
		if (l<r) 
		{
			 int m = (l+r)/2; 
		
			mergeSort(arr,l,m);
			mergeSort(arr, m+1, r);
			merge(arr, l, m, r);
		}
	}
	
	//print array sorted using merge sort
	void printMergeSortArray(int[] arr) {
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + "  ");
		}
	}
}











