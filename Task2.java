public class Task2 {
    
    public static int maxSumPath(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int i = 0, j = 0;
        int sum1 = 0, sum2 = 0, result = 0;
        
        // Traverse both arrays simultaneously
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                sum1 += arr1[i++];
            } else if (arr1[i] > arr2[j]) {
                sum2 += arr2[j++];
            } else { // Found a common element, update result
                result += Math.max(sum1, sum2) + arr1[i];
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            }
        }
        
        // Add remaining elements of arr1
        while (i < m) {
            sum1 += arr1[i++];
        }
        
        // Add remaining elements of arr2
        while (j < n) {
            sum2 += arr2[j++];
        }
        
        // Add the maximum sum from the remaining elements
        result += Math.max(sum1, sum2);
        
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = { 3, 6, 7, 8, 10, 12, 15, 18, 100 };
        int[] arr2 = { 1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50 }  ;
        
        int maxSum = maxSumPath(arr1, arr2);
        System.out.println("Maximum sum path: " + maxSum);
    }
}