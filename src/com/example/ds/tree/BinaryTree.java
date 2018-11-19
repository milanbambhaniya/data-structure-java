package com.example.ds.tree;

public class BinaryTree {

    private BTNode root;

    public BinaryTree(int data) {
        root = new BTNode(data);
    }

    public BTNode add(BTNode parent, int data, String direction) {
        BTNode newNode = new BTNode(data);
        if ("left" == direction) {
            parent.setLeft(newNode);
        } else {
            parent.setRight(newNode);
        }
        return newNode;
    }


    public void traverse() {
        System.out.print("Tree nodes are ");
        BTNode temp = root;
        print(temp);
    }

    private void print(BTNode node) {
        if (node != null) {
            System.out.print(node.data + " ");
            print(node.getLeft());
            print(node.getRight());
        }
    }

    public BTNode getRoot() {
        return root;
    }

    private class BTNode {
        private int data;
        private BTNode left;
        private BTNode right;

        BTNode(int data) {
            this.data = data;
        }

        BTNode getLeft() {
            return left;
        }

        BTNode getRight() {
            return right;
        }

        void setLeft(BTNode btNode) {
            this.left = btNode;
        }

        void setRight(BTNode btNode) {
            this.right = btNode;
        }
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(3);
        BTNode n1 = binaryTree.add(binaryTree.getRoot(), 5, "left");
        BTNode n2 = binaryTree.add(binaryTree.getRoot(), 10, "right");
        binaryTree.add(n1, 15, "left");
        binaryTree.add(n2, 45, "left");
        binaryTree.traverse();
    }
}
