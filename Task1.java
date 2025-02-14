public class Task1 {
    
    public static void mergeArrays(int[] X, int[] Y, int m, int n) {
        int k = m - 1;
        for (int i = m - 1; i >= 0; i--) {
            if (X[i] != 0) {
                X[k--] = X[i];
            }
        }

        int i = n, j = 0;
        k = 0;
        while (i < m && j < n) {
            if (X[i] < Y[j]) {
                X[k++] = X[i++];
            } else {
                X[k++] = Y[j++];
            }
        }

        while (j < n) {
            X[k++] = Y[j++];
        }
    }

    public static void main(String[] args) {
        int[] X = { 0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] Y = { 1, 8, 9, 10, 15 };
        int m = X.length;
        int n = Y.length;
        
        mergeArrays(X, Y, m, n);

        for (int num : X) {
            System.out.print(num + " ");
        }
    }
}