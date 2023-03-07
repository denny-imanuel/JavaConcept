package Implement;

import java.util.LinkedList;
import java.util.PriorityQueue;

// implement your own binary tree in java with BFS & DFS search
public class MyBinaryTree {

    // node contains data and left/right node
    public static class Node {
        public Integer data;
        public Node left;
        public Node right;
        public Node(Integer data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    // define a node as the root
    private Node root;

    public MyBinaryTree(Integer data) {
        // initiate root data
        this.root = new Node(data);
    }

    public Node insertNode(Node node, Integer data) {
        if (node != null) {
               if (data < node.data)
                   node.left = insertNode(node.left, data);
               if (data > node.data)
                   node.right = insertNode(node.right, data);
               return node;
        }
        else
            return new Node(data);
    }

    public void removeNode(Node node, Integer data) {
        if (node != null) {
            if (data < node.data)
                removeNode(node.left, data);
            if (data > node.data)
                removeNode(node.right, data);
            if (data == node.data) {
                node.data = null;
                node.left = null;
                node.right = null;
            }
        }
    }

    // DFS pre order
    public void dfsPreOrder(Node node) {
        if (node != null) {
            // shows value before recursive left/right
            System.out.print(node.data + "->");
            // recursive left/right
            dfsPreOrder(node.left);
            dfsPreOrder(node.right);
        }
    }

    // DFS in order
    public void dfsInOrder(Node node) {
        if (node != null) {
            dfsInOrder(node.left);
            // shows value between recursive left/right
            System.out.print(node.data + "->");
            dfsInOrder(node.right);
        }
    }

    // DFS post order
    public void dfsPostOrder(Node node) {
        if (node != null) {
            dfsPostOrder(node.left);
            dfsPostOrder(node.right);
            // shows value after recursive left/right
            System.out.print(node.data + "->");
        }
    }

    // BFS using stack
    public void bfsUsingStack(Node node) {
        var stack = new LinkedList<Node>();
        stack.add(node);
        while(!stack.isEmpty())
        {
            // shows last stack value
            var last = stack.pop();
            System.out.print(last.data + "->");
            // insert left to the stack
            if (last.left != null)
                stack.add(last.left);
            // insert right to the stack
            if (last.right != null)
                stack.add(last.right);
        }
    }

    // BFS by queue
    public void bfsUsingQueue(Node node) {
        var queue = new PriorityQueue<Node>();
        queue.add(node);
        while (!queue.isEmpty()) {
            // shows first queue value
            var first = queue.poll();
            System.out.println(first.data + "->");
            // insert left to the queue
            if (first.left != null)
                queue.add(first.left);
            // insert right to the queue
            if (first.right != null)
                queue.add(first.right);
        }
    }
}
