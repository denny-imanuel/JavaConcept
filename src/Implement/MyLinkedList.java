package Implement;

// implement your own linked list in java
public class MyLinkedList {

    // node contains data and next node
    private static class Node {
        Integer data;
        Node next;

        private Node(Integer data) {
            this.data = data;
            next = null;
        }
    }

    // define the first node as the head
    private Node head;

    public MyLinkedList(int data) {
        // initiate head data
        this.head = new Node(data);
    }

    public void traverseNode(Node node) {
        if (node.next != null) {
            System.out.println(node.data);
            traverseNode(node.next);
        }
    }

    public void insertNode(Node node, Integer data) {
        if (node.next != null) {
            insertNode(node.next, data);
        }
        else
            node.next = new Node(data);
    }

    public void removeNode(Node node, Integer data) {
        var prev_node = node;
        if (node.next != null) {
            if (data == node.data) {
                prev_node.next = node.next;
            }
            else
                removeNode(node.next, data);
        }
    }

}
