class Solution {
    public int[] findOrder(int V, int[][] edges) {
        ArrayList<Integer>[] graph = new ArrayList[V];
        for(int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // 2. Build graph + indegree
        int[] indegree = new int[V];

        for(int[] edge : edges) {

            int u = edge[0];
            int v = edge[1];

            graph[v].add(u);
            indegree[u]++;
        }

        // 3. Put indegree 0 nodes in queue
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < V; i++) {
            if(indegree[i] == 0) {
                q.add(i);
            }
        }

        // 4. BFS
        int[] ans = new int[V];
        int index = 0;

        while(!q.isEmpty()) {

            int node = q.poll();

            ans[index++] = node;

            for(int neighbour : graph[node]) {

                indegree[neighbour]--;

                if(indegree[neighbour] == 0) {
                    q.add(neighbour);
                }
            }
        }

        // 5. Cycle check
        if(index != V) {
            return new int[0];
        }

        return ans;
    }
}
