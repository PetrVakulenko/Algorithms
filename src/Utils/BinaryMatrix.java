package Utils;

import java.util.ArrayList;
import java.util.List;

public class BinaryMatrix {
    private int rows;
    private int columns;

    private int[][] matrix;

    public BinaryMatrix(int m, int n) {
        this.rows = m;
        this.columns = n;

        this.matrix = new int[rows][columns];
    }

    public List<Integer> dimensions() {
        List<Integer> dimensions = new ArrayList<>();

        dimensions.add(this.rows);
        dimensions.add(this.columns);

        return dimensions;
    }

    public int get(int i, int j) throws Exception {
        this.validateDimensions(i, j);

        return matrix[i][j];
    }

    public void setOne(int i, int j) throws Exception {
        this.validateDimensions(i, j);

        this.matrix[i][j] = 1;
    }

    private void validateDimensions(int i, int j) throws Exception {
        if (i > rows) throw new Exception("Maximum rows of matrix " + this.rows);
        if (j > columns) throw new Exception("Maximum columns of matrix " + this.columns);
    }
}
