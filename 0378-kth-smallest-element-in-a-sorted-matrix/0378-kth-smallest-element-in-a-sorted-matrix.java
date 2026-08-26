class Solution {
    public int kthSmallest(int[][] matrix, int k) {

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> matrix[a[0]][a[1]] - matrix[b[0]][b[1]]
        );

        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            pq.add(new int[]{i, 0});
        }

        for (int count = 1; count < k; count++) {

            int[] curr = pq.poll();

            int row = curr[0];
            int col = curr[1];

            if (col + 1 < n) {
                pq.add(new int[]{row, col + 1});
            }
        }

        int[] curr = pq.peek();

        return matrix[curr[0]][curr[1]];
    }
}