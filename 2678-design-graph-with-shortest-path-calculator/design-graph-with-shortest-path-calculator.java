class Graph {

    List<List<Pair>> graph;
    public Graph(int n, int[][] edges) {
        graph = new ArrayList<>();
        for (int i=0;i<n;i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            addEdge(edge);
        }

    }
    
    public void addEdge(int[] edge) {
        int from = edge[0];
        int to = edge[1];
        int cost = edge[2];
        graph.get(from).add(new Pair(to, cost));
    }
    
    public int shortestPath(int node1, int node2) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.cost - b.cost);

        pq.add(new Pair(node1, 0));
        int[] dist = new int[graph.size()];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[node1] = 0;

        while(!pq.isEmpty()) {
            Pair currPair = pq.remove();
            int currNode = currPair.node;
            int currentCost = currPair.cost;

            if (dist[currNode] < currentCost) {
                continue;
            }

            if (currNode == node2) {
                return currentCost;
            }

            for (Pair nbr : graph.get(currNode)) {
                int nbrNode = nbr.node;
                int nbrCost = nbr.cost;

                int totalCost = currentCost + nbrCost;

                if (totalCost < dist[nbrNode]) {
                    dist[nbrNode] = totalCost;
                    pq.add(new Pair(nbrNode, totalCost));
                }
            }
        }

        return -1;
    }


    class Pair {
        int node;
        int cost;

        Pair(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }
    }
}

/**
 * Your Graph object will be instantiated and called as such:
 * Graph obj = new Graph(n, edges);
 * obj.addEdge(edge);
 * int param_2 = obj.shortestPath(node1,node2);
 */