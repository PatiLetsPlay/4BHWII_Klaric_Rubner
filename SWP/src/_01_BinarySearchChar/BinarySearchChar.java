package _01_BinarySearchChar;

public class BinarySearchChar {

        public static int binarySearchChar(int array[], int gesucht, int low, int high) {

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if ((int)array[mid] == (int)gesucht)
                    return mid;

                if ((int)array[mid] < (int)gesucht)
                    low = mid + 1;

                else
                    high = mid - 1;
            }

            return -1;
        }

        public static void main(String args[]) {
            int array[] = { 'a', 'b', 'c', 'f', 'x', 'y', 'z' };
            char gesucht = 'x';
            int n = array.length;
            int result = binarySearchChar(array, gesucht, 0, n - 1);
            if (result == -1)
                System.out.println("Not found");
            else
                System.out.println("Element found at index " + result);
        }
}