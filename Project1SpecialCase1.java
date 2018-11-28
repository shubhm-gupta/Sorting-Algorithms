
// Special Case 1. To sort an already sorted array using all the sorting algorithms
public class Project1SpecialCase1 {


	public static void main(String[] args) {
		int sizeOfArray = 5000;
		int[] arr = new int[sizeOfArray];
		
		Project1Arrays P1Arr = new Project1Arrays();
		P1Arr.generateRandomArray(arr, sizeOfArray);
		System.out.println("Unsorted Array : ");
		P1Arr.printUnsortedArray(arr);
		System.out.println();
		
		//to sort the array so that it can be tried for all sorting for special cases		
		InPlaceQuickSort IPQS = new InPlaceQuickSort();
		IPQS.sort(arr, 0, sizeOfArray-1);
		System.out.println("Sorted Array : ");
		IPQS.printInPlaceQuickSortArray(arr);
		System.out.println();
				

			// sort arr using insertion sort
		InsertionSort IS = new InsertionSort();
		System.out.println("Input Array for Insertion Sort : ");
		P1Arr.printUnsortedArray(arr);
		final long startTime = System.currentTimeMillis();
		IS.sort(arr);
		final long endTime = System.currentTimeMillis();
		System.out.println();
		System.out.print("Sorted Array using INSERTION SORT:  ");
		IS.printArray(arr);
		System.out.println();
		System.out.println("Total execution time for Insertion Sort: " + P1Arr.timeTakenforSorting(startTime, endTime) );
		System.out.println();
		
		System.out.println("******************************************************************************************************");

		//Sorting arr array using Merge Sort
		
		MergeSort MS = new MergeSort();
		System.out.println("Input Array for Merge Sort : ");
		P1Arr.printUnsortedArray(arr);
		final long startTime1 = System.currentTimeMillis();
		MS.mergeSort(arr, 0, sizeOfArray-1);
		final long endTime1 = System.currentTimeMillis();
		System.out.println();
		System.out.print("Sorted Array using MERGE SORT:  ");
		MS.printMergeSortArray(arr);
		System.out.println();
		System.out.println("Total execution time for Merge Sort: " + P1Arr.timeTakenforSorting(startTime1, endTime1) );
	
		System.out.println("******************************************************************************************************");
		
		//Sorting arr array using In-Place Quick Sort
				
		System.out.println("Input Array for In-Place Merge Sort : ");
		P1Arr.printUnsortedArray(arr);
		final long startTime2 = System.currentTimeMillis();
		IPQS.sort(arr, 0, sizeOfArray-1);
		final long endTime2=System.currentTimeMillis();
		System.out.println();
		System.out.print("Sorted Array using In-Place QUICK SORT:  ");
		IPQS.printInPlaceQuickSortArray(arr);
		System.out.println();
		System.out.println("Total execution time for Quick Sort: " + P1Arr.timeTakenforSorting(startTime2, endTime2) );
		
		System.out.println("******************************************************************************************************");		
		
		//Sorting arr array using Modified Quick Sort
		
		ModifiedQuickSort MQS = new ModifiedQuickSort();
		System.out.println("Input Array for Median of 3 Quick Sort : ");
		P1Arr.printUnsortedArray(arr);
		final long startTime3 = System.currentTimeMillis();
		MQS.median3MergeSort(arr, 0, sizeOfArray-1);
		final long endTime3=System.currentTimeMillis();
		System.out.println();
		System.out.print("Sorted Array using Median of 3 QUICK SORT:  ");
		MQS.printModifiedQuickSortArray(arr);
		System.out.println();
		System.out.println("Total execution time for Modified Quick Sort: " + P1Arr.timeTakenforSorting(startTime3, endTime3) );
		
		System.out.println("******************************************************************************************************");
	}

	}

