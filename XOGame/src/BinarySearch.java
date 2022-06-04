public class BinarySearch {

    // Searches the given array for an element with the given value.
    //
    // If an element with the given value is found, this method returns
    // the element's index within the array.
    //
    // Otherwise, this returns -1 to indicate the given value was not
    // present in the array.
    //
    public static int search(int low, int high, int[] arr, int value) {
      if (high == low) {
         if (arr[high] == value) {
            return high;
         } 
         return -1;
      } else if (high > low) {
         int mid = (high + low)/2;
         if (arr[mid] == value) {
           return mid;
         } else if (arr[mid] < value) {
            return search(mid +1, high, arr, value);
         } else {
            return search(low,mid-1, arr, value);
         }
      }
      return -1;
  }
 
    // Runs some tests on your search() method above.
    public static void main(String[] args) {
 
       // Make a test array from 1 to 10
       int[] testArray = new int[10];
       for (int i = 0; i < testArray.length; i++) {
          testArray[i] = i + 1;
       }
 
       // Point test: The element '3' should appear at index 2
       testCase(testArray, 3, 2);
 
       // Point test: If an element is not present, should return -1
       testCase(testArray, 42, -1);
       testCase(testArray, -7, -1);
 
       // The search method should be able to find every element in the array
       for (int i = 0; i < testArray.length; i++) {
          testCase(testArray, testArray[i], i);
       }
    }
 
    // Helper for running a single test case.
    //
    // Searches 'array' for the index of 'value' using your search method
    // and determines whether your search method returned the 'expected'
    // index.
    //
    // Prints information about the expected and actual behavior.
    //
    private static void testCase(int[] array, int value, int expected) {
 
       int actual = search(0, array.length-1, array, value);
 
       if (actual == expected) {
          System.out.printf("PASSED: search(array, %d) == %d\n", value, expected);
       } else {
          System.out.printf("FAILED: search(array, %d) returned %d; expected %d\n", value, actual, expected);
       }
    }

    
 }
 