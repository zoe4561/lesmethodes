public class exo4
{
    public static void main(String[] args)
    {
        //create a 1D array to represent a 3x3 matrix and find the sum of all elements in the matrix
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
                if (matrix[i][j] > max)
                {
                    max = matrix[i][j];
                }

            }
            System.out.println("The max element is: " + max);

        }
        System.out.println("The sum is: " + sum);
    }
}
