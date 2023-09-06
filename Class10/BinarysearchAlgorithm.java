package Class10;

import java.util.Arrays;

//search given key from multiple elements 
//faster in performance than linear search

public class BinarysearchAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = { 10, 32, 2, 5, 67, 8, 3 };
		Arrays.sort(intArr);
		System.out.println("Sorted Array is " + Arrays.toString(intArr));
		int lookOutFor = 8;
		int lastElementPositionInArray = intArr.length - 1;
		binarySearch(intArr, 0, lastElementPositionInArray, lookOutFor);

	}
	//In binary search, it is mandatory to sort elements before searching

	static void binarySearch(int[] intArr, int startingPosition, int lastPosition, int searchElement) {
		int midElementPosition = (startingPosition + lastPosition) / 2;
		while (startingPosition <= lastPosition) {
			if (intArr[midElementPosition] < searchElement) {
				startingPosition = midElementPosition + 1;

			} else if(intArr[midElementPosition] == searchElement) {
					System.out.println("Elemeny found at position " + midElementPosition);
					break;

				} else {
					lastPosition = midElementPosition - 1;
				}
				midElementPosition = (startingPosition + lastPosition) / 2;
			}
			if (startingPosition > lastPosition) {
				System.out.println("Element is not found !");
			}
		}

	}


