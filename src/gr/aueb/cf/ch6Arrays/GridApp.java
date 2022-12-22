package gr.aueb.cf.ch6Arrays;

public class GridApp {

    public static void main(String[] args) {
        int[][] grid = new int[2][2];
        int[][] grid2 = {{1,2},{3,4},{5,6}};

        grid[0][0] = 0;
        grid[0][1] = 1;
        grid[1][0] = 2;
        grid[1][1] = 3;

        printArray2D(grid);
        printArray2DIndex(grid2);
        int sumArr = sumArray(grid2);
        System.out.println(sumArr);

    }

    public static void printArray2D(int[][] grid) {
        for (int[] row : grid) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    public static void printArray2DIndex(int[][]grid) {
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                System.out.println(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int sumArray(int[][] grid) {
        int sum = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                sum = sum + grid[i][j];
            }
        }
        return sum;
    }
}
