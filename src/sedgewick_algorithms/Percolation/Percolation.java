package sedgewick_algorithms.Percolation;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {
    private int n;

    private int top = 0;

    private int bottom;

    private int countOpenSites = 0;

    private boolean[][] opened;

    private WeightedQuickUnionUF wquf;

    /**
     * Perform independent trials on an n-by-n grid
     */
    public Percolation(int n) {
        validation(n);

        this.n = n;
        bottom = this.n * this.n + 1;
        wquf = new WeightedQuickUnionUF(this.n * this.n + 2);
        opened = new boolean[this.n][this.n];
    }

    /**
     * Validate one parameter
     */
    private void validation(int n) {
        if (n < 1) {
            throw new IndexOutOfBoundsException("N is out of bounds");
        }
    }

    /**
     * Validate two parameters
     */
    private void validation(int row, int col) {
        if (row < 1 || row > n) {
            throw new IndexOutOfBoundsException("Row is out of bounds");
        }

        if (col < 1 || col > n) {
            throw new IndexOutOfBoundsException("Col is out of bounds");
        }
    }

    /**
     * Opens the site (row, col) if it is not open already
     */
    public void open(int row, int col) {
        validation(row, col);

        countOpenSites++;
        opened[row - 1][col - 1] = true;
        if (row == 1) {
            wquf.union(getQFIndex(row, col), top);
        }
        if (row == n) {
            wquf.union(getQFIndex(row, col), bottom);
        }

        if (col > 1 && isOpen(row, col - 1)) {
            wquf.union(getQFIndex(row, col), getQFIndex(row, col - 1));
        }
        if (col < n && isOpen(row, col + 1)) {
            wquf.union(getQFIndex(row, col), getQFIndex(row, col + 1));
        }
        if (row > 1 && isOpen(row - 1, col)) {
            wquf.union(getQFIndex(row, col), getQFIndex(row - 1, col));
        }
        if (row < n && isOpen(row + 1, col)) {
            wquf.union(getQFIndex(row, col), getQFIndex(row + 1, col));
        }
    }

    /**
     * Is the site (row, col) open?
     */
    public boolean isOpen(int row, int col) {
        validation(row, col);

        return opened[row - 1][col - 1];
    }

    /**
     * Is the site (row, col) full?
     */
    public boolean isFull(int row, int col) {
        validation(row, col);

        return wquf.connected(top, getQFIndex(row, col));
    }

    /**
     * Returns the number of open sites
     */
    public int numberOfOpenSites() {
        return countOpenSites;
    }

    /**
     * Does the system percolate?
     */
    public boolean percolates() {
        return wquf.connected(top, bottom);
    }

    /**
     * Get index by row and col
     */
    private int getQFIndex(int row, int col) {
        return n * (row - 1) + col;
    }

    /**
     * Test client (optional)
     */
    public static void main(String[] args) {
        StdOut.println("Please run PercolationStats instead.");
    }
}
