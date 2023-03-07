package Implement;

import java.util.*;
public class MyGraph<T> {

    // adj matrices is pointing a node to the list of nodes
    private Map<T, List<T>> graph;

    public MyGraph() {
        // initiate blank adj matrices
        graph = new HashMap<>();
    }

    public void insertVertex(T val) {
        if (!graph.containsKey(val)) {
            graph.put(val, new ArrayList<T>());
        }
    }

    public void removeVertex(T val) {
        if (graph.containsKey(val)) {
            graph.remove(val);
        }
    }

    public void insertEdge(T val1, T val2) {
        if (!(graph.containsKey(val1) & graph.containsKey(val2))) {
            graph.get(val1).add(val2);
        }
    }

    public void removeEdge(T val1, T val2) {
        if (graph.containsKey(val1) & graph.containsKey(val2)) {
            graph.get(val1).add(val2);
        }
    }

    public void printGraph() {
        for (var key: graph.keySet()) {
            for (var val: graph.get(key)) {
                System.out.println("graph: " + key + "->" + val);
            }
        }
    }

    public void dfsUsingStack(T start) {
        var visited = new HashSet<T>();
        var stack = new LinkedList<T>();
        stack.add(start);
        while (!stack.isEmpty()) {
            // get last stack
            var last = stack.pop();
            if (!visited.contains(last)) {
                visited.add(last);
                // insert neighbors that has not been visited to the stack
                var neighbors = graph.get(last);
                for (var neighbor : neighbors) {
                    if (!visited.contains(neighbor)) {
                        stack.add(neighbor);
                    }
                }
            }
        }
    }

    public void bfsUsingStack(T start) {
        var visited = new HashSet<T>();
        var queue = new PriorityQueue<T>();
        queue.add(start);
        while (!queue.isEmpty()) {
            // get first queue
            var first = queue.poll();
            if (!visited.contains(first)) {
                visited.add(first);
                // insert neighbors that has not been visited to the queue
                var neighbors = graph.get(first);
                for (var neighbor : neighbors) {
                    if (!visited.contains(neighbor)) {
                        queue.add(neighbor);
                    }
                }
            }
        }
    }


}
