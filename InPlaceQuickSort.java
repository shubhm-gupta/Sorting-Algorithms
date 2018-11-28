
public class InPlaceQuickSort {
	
	int partition(int [] arr, int l, int r) {
		int pivot = arr[r]; //Taking last element as pivot
		int i=l;
		for(int j=l; j<r; j++)
		{
			// If current element is smaller than or equal to pivot 
			if (arr[j] <= pivot)
			{ 
				// swap arr[i] and arr[j]
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				i++;
			}
		}
		arr[r] = arr[i];
		arr[i] = pivot;
		
		return i;		
		}
		
	//main function that implements quick sorts
	void sort(int[] arr, int l, int r) {
		if (l<=r)
		{
			int pi = partition(arr, l, r);
			sort(arr, l, pi-1);
			sort(arr, pi+1, r);
		}
	}
	
	void printInPlaceQuickSortArray(int[] arr) {
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + "  ");
		}
	}
			
	}
	