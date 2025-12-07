public class Array2dUtility {

    // 1. print
    public static void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 2. sum
    public static int sum(int[][] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                total += array[i][j];
            }
        }
        return total;
    }

    // 3. average
    public static double average(int[][] array) {
        int total = sum(array);
        int elements = array.length * array[0].length; // square array
        double avg = (double) total / elements;
        return (int)(avg * 100) / 100.0;
    }

    // 4. minimum
    public static int minimum(int[][] array) {
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        return min;
    }

    // 5. maximum
    public static int maximum(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    // 6. evenCountStandard
    public static int evenCountStandard(int[][] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    // 7. evenCountEnhanced
    public static int evenCountEnhanced(int[][] array) {
        int count = 0;
        for (int[] row : array) {
            for (int num : row) {
                if (num % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    // 8. allPositive
    public static boolean allPositive(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] <= 0) {
                    return false;
                }
            }
        }
        return true;
    }

    // 9. rowSums
    public static int[] rowSums(int[][] array) {
        int[] sums = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < array[i].length; j++) {
                rowSum += array[i][j];
            }
            sums[i] = rowSum;
        }
        return sums;
    }

    // 10. colSums
    public static int[] colSums(int[][] array) {
        int[] sums = new int[array[0].length];
        for (int j = 0; j < array[0].length; j++) {
            int colSum = 0;
            for (int i = 0; i < array.length; i++) {
                colSum += array[i][j];
            }
            sums[j] = colSum;
        }
        return sums;
    }
}
