public class ArraysExample {
    public static void main(String[] args) {

        // ===== 1-мысал =====
        // Бірөлшемді массивтің ең үлкен элементі
        int[] arr = {3, 7, 2, 9, 5};

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        System.out.println("Ең үлкен элемент: " + max);

        // ===== 2-мысал =====
        // Екіөлшемді массивтің барлық элементтер қосындысы
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int sum = 0;
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                sum += matrix[r][c];
            }
        }

        System.out.println("Матрица қосындысы: " + sum);
    }
}
