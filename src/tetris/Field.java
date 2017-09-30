package tetris;

public class Field {

    public static final int HEIGHT = 20;
    public static final int WIDTH = 9;
    public int[][] box = new int[HEIGHT][WIDTH];

    public boolean hasConflictAt(int row, int col, int[][] data) {
        for (int r = 0; r < data.length; r++) {
            for (int c = 0; c < data[r].length; c++) {
                if (data[r][c] == 0) {
                    continue;
                }
                int newRow = row + r;
                int newCol = col + c;
                if (newRow < 0 || newCol < 0 || newRow >= Field.HEIGHT ||
                        newCol >= Field.WIDTH) {
                    return true;
                }
                if (box[newRow][newCol] > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public void paste(int row, int col, int[][] data) {
        for (int r = 0; r < data.length; r++) {
            for (int c = 0; c < data[r].length; c++) {
                if (data[r][c] == 0) {
                    continue;
                }
                int newRow = row + r;
                int newCol = col + c;
                box[newRow][newCol] = data[r][c];
            }
        }
    }
}
