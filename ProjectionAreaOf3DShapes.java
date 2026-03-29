public class ProjectionAreaOf3DShapes {

    public static int projectionArea(int[][] grid) {
        int n = grid.length;
        int top = 0, front = 0, side = 0;

        for (int i = 0; i < n; i++) {
            int maxRow = 0;
            int maxCol = 0;

            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) top++;              // top view
                maxRow = Math.max(maxRow, grid[i][j]);  // front view
                maxCol = Math.max(maxCol, grid[j][i]);  // side view
            }

            front += maxRow;
            side += maxCol;
        }

        return top + front + side;
    }

    public static void main(String[] args) {

        int[][] grid = {
            {1, 2},
            {3, 4}
        };

        int result = projectionArea(grid);

        System.out.println("Projection Area: " + result);
    }
}