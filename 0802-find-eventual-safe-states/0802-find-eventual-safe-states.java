class Solution {
    public List<Integer> eventualSafeNodes(int[][] edges) {

        int V = edges.length;

        ArrayList<Integer>[] graph = new ArrayList[V];

        for(int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        int[] indegree = new int[V];

        // Reverse graph
        for(int u = 0; u < V; u++) {
            for(int v : edges[u]) {
                graph[v].add(u);
                indegree[u]++;
            }
        }
    


        Queue<Integer> q = new LinkedList<>();

        // Terminal nodes
        for(int i = 0; i < V; i++) {
            if(indegree[i] == 0) {
                q.add(i);
            }
        }

        List<Integer> ans = new ArrayList<>();

        while(!q.isEmpty()) {

            int node = q.poll();

            ans.add(node);

            for(int neighbour : graph[node]) {

                indegree[neighbour]--;

                if(indegree[neighbour] == 0) {
                    q.add(neighbour);
                }
            }
        }

        Collections.sort(ans);

        return ans;
    }
}