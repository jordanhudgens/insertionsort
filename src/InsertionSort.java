// Class: 		CS5381
// Student:		Jordan Hudgens
// Level:		Graduate Student
// Date:		2014-02-28
// Project:		Insertion Sort for 10, 100, and 1000 items
// Algorithm:	Comments are listed next to the insertion sort method for 10 items


public class InsertionSort {

	public static void main(String[] args) {

		// Array size_ten 10
		System.out.println("------------------- 10 items ------------------------");
		long start_10 = System.nanoTime(); // start timer for array of 10 items
		
		int size_10 = 10; // set array to the size of 10 items
		int[] data = new int[size_10]; // instantiate the array
		
		// randomize function
		for(int i = 0; i < size_10; i++) {
			data[i] = (int) (Math.random() * 100);
		}
		System.out.println("Before sorting: ");
		
		// prints out the unsorted/random array values
		for(int i = 0; i < size_10; ++i) {
			System.out.print(data[i] + ", ");
		}
		
		// insertion sort process starts
		for(int i = 0; i < size_10; ++i) { 	// loops through the full array
			for(int j = i; j > 0; --j) {	// nested for loop iterates and keeps invariance
				if (data[j-1] > data[j]) {	// if the item on the left is greater than the item on the right
					int hold = data[j];		// it sets the hold var to the value at the array index equal to j
					data[j] = data[j-1];	// then it moves the value in the j-1 position to the right
					data[j-1] = hold;		// and swaps it with the smaller value, which moves to the left
				}
			}
		}
		
		// prints out the sorted array
		System.out.println();
		System.out.println("After sorting: ");
		for(int i = 0; i < size_10; ++i) {
			System.out.print(data[i] + ", ");
		}
		// prints out the time for 10 items
		System.out.println();
		long end_10 = System.nanoTime();
		System.out.println("Insertion sort of 10 items took " + (end_10 - start_10) + " nano seconds");
		System.out.println();
		// End of array of size 10
		
		// Start of array of size 100
		System.out.println("------------------- 100 items ------------------------");
		long start_100 = System.nanoTime(); // start timer for array of 100 items
		
		int size_100 = 100;
		int[] data_100 = new int[size_100];
		for(int i = 0; i < size_100; i++) {
			data_100[i] = (int) (Math.random() * 100);
		}
		System.out.println("Before sorting: ");
		for(int i = 0; i < size_100; ++i) {
			System.out.print(data_100[i] + ", ");
		}

		for(int i = 0; i < size_100; ++i) {
			for(int j = i; j > 0; --j) {
				if (data_100[j-1] > data_100[j]) {
					int hold = data_100[j];
					data_100[j] = data_100[j-1];
					data_100[j-1] = hold;
				}
			}
		}

		System.out.println();
		System.out.println("After sorting: ");
		for(int i = 0; i < size_100; ++i) {
			System.out.print(data_100[i] + ", ");
		}
		// prints out the time for 100 items
		System.out.println();
		long end_100 = System.nanoTime();
		System.out.println("Insertion sort of 100 items took " + (end_100 - start_100) + " nano seconds");
		System.out.println();
		// End of array of size 100
		
		// Start of array of size 1000
		System.out.println("------------------- 1000 items ------------------------");
		long start_1000 = System.nanoTime(); // start timer for array of 1000 items

		int size_1000 = 500;
		int[] data_1000 = new int[size_1000];
		for(int i = 0; i < size_1000; i++) {
			data_1000[i] = (int) (Math.random() * 100);
		}
		System.out.println("Before sorting: ");
		for(int i = 0; i < size_1000; ++i) {
			System.out.print(data_1000[i] + ", ");
		}

		for(int i = 0; i < size_1000; ++i) {
			for(int j = i; j > 0; --j) {
				if (data_1000[j-1] > data_1000[j]) {
					int hold = data_100[j];
					data_1000[j] = data_1000[j-1];
					data_1000[j-1] = hold;
				}
			}
		}

		System.out.println();
		System.out.println("After sorting: ");
		for(int i = 0; i < size_1000; ++i) {
			System.out.print(data_1000[i] + ", ");
		}
		// prints out the time for 1000 items
		System.out.println();
		long end_1000 = System.nanoTime();
		System.out.println("Insertion sort of 1000 items took " + (end_1000 - start_1000) + " nano seconds");
		// End of array of size 1000
		
	}

	

}
