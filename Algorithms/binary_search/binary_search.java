public class BinarySearch {
 
    public static int binarySearch(int[] inputArr, int key) {
         
        int start = 0;
        int end = inputArr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == inputArr[mid]) {
                return mid;
            }
            if (key < inputArr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
 
    public static void main(String[] args) {
         
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int key = 16;
        int result = binarySearch(arr, key);
        if (result == -1) {
            System.out.println("Element not found!");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}