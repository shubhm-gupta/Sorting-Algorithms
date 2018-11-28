
public class Project1 {
	
		public static void main(String[] args) {
			
		int sizeOfArray = 50000;
		int[] arrInsSort = new int[sizeOfArray];
		int[] arrMergeSort = new int[sizeOfArray];
		int[] arrInPlQS = new int[sizeOfArray];
		int[] arrMedianQS= new int[sizeOfArray];
		
		
		Project1Arrays P1 = new Project1Arrays();
		P1.generateRandomArray(arrInsSort, sizeOfArray);  // generating an array of size n and same will be sorted using Insertion sort
		P1.copyRandomArray(arrInsSort, arrMergeSort);     // copy this array separately for Merge sort
		P1.copyRandomArray(arrInsSort, arrInPlQS);		  // copy this array separately for In Place Merge sort
		P1.copyRandomArray(arrInsSort, arrMedianQS);	  // copy this array separately for Median of 3 Merge sort
		
						
		//Sorting arrInsSort array using Insertion Sort
		
		InsertionSort IS = new InsertionSort();
		System.out.println("Unsorted Array for Insertion Sort : ");
		P1.printUnsortedArray(arrInsSort);
		final long startTime = System.currentTimeMillis();
		IS.sort(arrInsSort);
		final long endTime = System.currentTimeMillis();
		System.out.println();
		System.out.print("Sorted Array using INSERTION SORT:  ");
		IS.printArray(arrInsSort);
		System.out.println();
		System.out.println("Total execution time for Insertion Sort: " + P1.timeTakenforSorting(startTime, endTime) );
		
		System.out.println("******************************************************************************************************");

		//Sorting arrMergeSort array using Merge Sort
		
		MergeSort MS = new MergeSort();
		System.out.println("Unsorted Array for Merge Sort : ");
		P1.printUnsortedArray(arrMergeSort);
		final long startTime1 = System.currentTimeMillis();
		MS.mergeSort(arrMergeSort, 0, sizeOfArray-1);
		final long endTime1 = System.currentTimeMillis();
		System.out.println();
		System.out.print("Sorted Array using MERGE SORT:  ");
		MS.printMergeSortArray(arrMergeSort);
		System.out.println();
		System.out.println("Total execution time for Merge Sort: " + P1.timeTakenforSorting(startTime1, endTime1) );
	
		System.out.println("******************************************************************************************************");
		
		//Sorting arrInPlQS array using In-Place Quick Sort
		
		InPlaceQuickSort IPQS = new InPlaceQuickSort();
		System.out.println("Unsorted Array for In-Place Merge Sort : ");
		P1.printUnsortedArray(arrInPlQS);
		final long startTime2 = System.currentTimeMillis();
		IPQS.sort(arrInPlQS, 0, sizeOfArray-1);
		final long endTime2=System.currentTimeMillis();
		System.out.println();
		System.out.print("Sorted Array using In-Place QUICK SORT:  ");
		//IPQS.printInPlaceQuickSortArray(arrInPlQS);
		IPQS.printInPlaceQuickSortArray(arrMergeSort);
		System.out.println();
		System.out.println("Total execution time for Quick Sort: " + P1.timeTakenforSorting(startTime2, endTime2) );
		
		System.out.println("******************************************************************************************************");		
		
		//Sorting arrMedianQS array using Modified Quick Sort
		
		ModifiedQuickSort MQS = new ModifiedQuickSort();
		System.out.println("Unsorted Array for Median of 3 Quick Sort : ");
		P1.printUnsortedArray(arrMedianQS);
		final long startTime3 = System.currentTimeMillis();
		MQS.median3MergeSort(arrMedianQS, 0, sizeOfArray-1);
		final long endTime3=System.currentTimeMillis();
		System.out.println();
		System.out.print("Sorted Array using Median of 3 QUICK SORT:  ");
		MQS.printModifiedQuickSortArray(arrMedianQS);
		System.out.println();
		System.out.println("Total execution time for Modified Quick Sort: " + P1.timeTakenforSorting(startTime3, endTime3) );
		
		System.out.println("******************************************************************************************************");
	}

}