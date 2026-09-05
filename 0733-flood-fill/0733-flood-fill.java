class Solution {
    public int[][] floodFill(int[][] grid, int sr, int sc, int color) {

        int n = grid.length;
        int m = grid[0].length; 
        int original = grid[sr][sc];
        if(original == color) {
            return grid;
        }

        Queue<int[]> q = new LinkedList<>();

        q.add(new int[]{sr, sc});

        grid[sr][sc] = color;

        int[][] dir = {
            {1,0},
            {-1,0},
            {0,1},
            {0,-1}
        };

        while(!q.isEmpty()) {

            int[] curr = q.poll();

            int r = curr[0];
            int c = curr[1];

            for(int[] d : dir) {

                int nr = r + d[0];
                int nc = c + d[1];

                if(nr >= 0 && nr < n &&
                   nc >= 0 && nc < m &&
                   grid[nr][nc] == original) {

                    grid[nr][nc] = color;

                    q.add(new int[]{nr, nc});
                }
            }
        }

        return grid;
    }
}