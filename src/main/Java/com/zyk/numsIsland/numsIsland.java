package com.zyk.numsIsland;

import java.util.LinkedList;
import java.util.Queue;

public class numsIsland {

    public int numIslands(char[][] grid) {
        int nc = grid[0].length;
        int nr = grid.length;
        int result = 0;
        for (int i=0; i < nr; i++)  {
            for (int j = 0; j < nc; j++) {
                if ('1' == grid[i][j]) {
                    Queue<Integer> queue = new LinkedList();
                    result ++;
                    grid[i][j] = 0;
                    queue.add( i * nc + j);
                    while (!queue.isEmpty()) {
                        int id = queue.remove();
                        int row = id / nc;
                        int col = id % nc;
                        if (i > 0 && grid[row-1][col] == 1) {
                            queue.add((row-1) * nc + col);
                            grid[row-1][col] = '0';
                        }
                        if (j < nc && grid[row][col+1] == 1)  {
                            queue.add(row * nc + col + 1);
                            grid[row][col+1] = '0';
                        }
                        if (i < nr && grid[row+1][col] == 1) {
                            queue.add((row+1) * nc + col);
                            grid[row+1][col]= '0';
                        }
                        if (j > 0 && grid[row][col-1] == 1) {
                            queue.add(row * nc + col - 1);
                            grid[row][col-1]= '0';
                        }
                    }
                }

            }
        }
        return result;
    }

}
