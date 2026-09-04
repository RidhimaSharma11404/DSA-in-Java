class Solution {
    public int findCircleNum(int[][] isConnected) {

        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int count = 0;

        for (int i = 0; i < n; i++) {

            if (!visited[i]) {

                count++; // new province

                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                visited[i] = true;

                while (!q.isEmpty()) {

                    int curr = q.poll();

                    for (int nbr = 0; nbr < n; nbr++) {

                        if (isConnected[curr][nbr] == 1
                                && !visited[nbr]) {

                            visited[nbr] = true;
                            q.add(nbr);
                        }
                    }
                }
            }
        }

        return count;
    }
}