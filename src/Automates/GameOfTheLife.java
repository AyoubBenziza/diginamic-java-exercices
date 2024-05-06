package Automates;

public class GameOfTheLife {
    private int[][] grid;
    private int[][] newGrid;
    private final int size;

    public GameOfTheLife(int size) {
        this.size = size;
        this.grid = new int[size][size];
        this.newGrid = new int[size][size];
    }

    public void setCell(int x, int y) {
        this.grid[x][y] = 1;
    }

    public void nextGeneration() {
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                int neighbors = countNeighbors(i, j);
                if (this.grid[i][j] == 1) {
                    if (neighbors < 2 || neighbors > 3) {
                        this.newGrid[i][j] = 0;
                    } else {
                        this.newGrid[i][j] = 1;
                    }
                } else {
                    if (neighbors == 3) {
                        this.newGrid[i][j] = 1;
                    } else {
                        this.newGrid[i][j] = 0;
                    }
                }
            }
        }
        this.grid = this.newGrid;
        this.newGrid = new int[this.size][this.size];
    }

    private int countNeighbors(int x, int y) {
        int count = 0;
        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                if (i >= 0 && i < this.size && j >= 0 && j < this.size) {
                    if (i != x || j != y) {
                        count += this.grid[i][j];
                    }
                }
            }
        }
        return count;
    }

    public void printGrid() {
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                System.out.print(this.grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
