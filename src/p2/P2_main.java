package p2;

public class P2_main {

	public static void main(String[] args) {
		drawGrid();
		
	}
	static public int[][] grid = {{0,-1,0},{0,0,-1},{0,0,-1}};
	public static int countNeighbors(int row, int column) {
		if (grid[row][column] == -1) {
			return -1;
		}
		int r, c;
		int s = 0;
		for (int i = -1; i <= 1; i++) {
			for (int j = -1; j <= 1; j++) {
				r = row + i;
				c = column + j;
				if (((i == 0) && (j == 0)) || (r < 0) || (r > 2) || (c < 0) || (c > 2)) {
					continue;
				} 
				if (grid[r][c] == -1) {
					s++;
				}
			}
		}
		return s;
	}
	public static void drawGrid() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				grid[i][j] = countNeighbors(i, j);
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(grid[i][j] + " ");
				
			}
			System.out.println();
		}
	}
} // ka op richteg
