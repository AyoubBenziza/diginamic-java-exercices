package fr.diginamic.Automates;

public class GameOfTheLife {
    private int[][] grid;
    private int[][] newGrid;
    private final int width;
    private final int height;
    private int generations = 0;

    public GameOfTheLife(int width, int height) {
        this.width = width;
        this.height = height;
        this.grid = new int[height][width];
        this.newGrid = new int[height][width];
    }

    public void setCell(int x, int y) {
        this.grid[x][y] = 1;
    }

    public void nextGeneration() {
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
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

        // Move the cells towards the end in width direction
        for (int i = 0; i < this.height; i++) {
            for (int j = this.width - 1; j > 0; j--) {
                this.grid[i][j] = this.grid[i][j - 1];
            }
        }

        // Generate new cells in the first column
        for (int i = 0; i < this.height; i++) {
            this.grid[i][0] = Math.random() < 0.5 ? 0 : 1;
        }

        this.grid = this.newGrid;
        this.newGrid = new int[this.height][this.width]; // Corrected line
    }

    private int countNeighbors(int x, int y) {
        int count = 0;
        for (int i = Math.max(0, x - 1); i <= Math.min(x + 1, height - 1); i++) {
            for (int j = Math.max(0, y - 1); j <= Math.min(y + 1, width - 1); j++) {
                count += this.grid[i][j];
            }
        }
        return count - this.grid[x][y];
    }

    public void printGrid() {
        this.generations++;
        System.out.println();
        System.out.println("/".repeat(this.width / 2) + " Génération : " + this.generations + " " + "\\".repeat(this.width / 2));
        for (int i = 0; i < this.height; i++) {
            System.out.println("-".repeat(this.width * 2 + 1));
            System.out.print("|");
            for (int j = 0; j < this.width; j++) {
                System.out.print(this.grid[i][j] == 1 ? "*" : " ");
                System.out.print("|");
            }
            System.out.println();
        }
    }
}
