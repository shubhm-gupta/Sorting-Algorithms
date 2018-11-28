
public class ModifiedQuickSort {

	//swapping two elements of an array
	void swap(int[] arr, int a, int b) {
		int temp;
		temp = arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	
	//insertion sort for partition less than or equal to 10
	void insertionSort(int[] arr, int l, int r) {
		for (int i=l+1; i<r; ++i)
		{
			int key = arr[i];
			int j =i-1;
			while(j>=0 && arr[j] > key)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}
	
	//to find median of first, middle & last element as pivot and sorting the array
	void median3MergeSort(int[] arr, int l, int r) {
		if(l>=r)
			return;
		else {
		int m=(l+r)/2;
		if (arr[l] > arr[m])
			swap(arr,l,m);
		if (arr[l] > arr[r])
			swap(arr,l, r);
		if (arr[m]>arr[r])
			swap(arr,m, r);
		int pivot = arr[m];
		swap(arr,m,r-1);
		int i=l; int j=r-2;
		if (r-l<=10)
			insertionSort(arr, l, r);
		else
		{
			while(true) 
			{
				while(arr[++i] < pivot);
				while(arr[--j] > pivot);
				if (i<j)
					swap(arr,i, j);
				else 
					break;
			}
		swap(arr,i, r-1);
		median3MergeSort(arr, l, i-1);
		median3MergeSort(arr, i+1, r);
		}
		}
	}
	
	//print the array sorted using Median of 3 quick sort
	void printModifiedQuickSortArray(int[] arr) {
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+ "  ");
		}
	}

}
