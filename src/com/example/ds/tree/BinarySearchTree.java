package com.example.ds.tree;

public class BinarySearchTree {

    private BSTNode root;

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private BSTNode insertRec(BSTNode root, int data) {
        if (null == root) {
            root = new BSTNode(data);
        } else if (data <= root.data) {
            root.left = insertRec(root.left, data);
        } else {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    public void inorder() {
        if (null == root) {
            System.out.println("Tree is empty");
        } else {
            System.out.print("InOrder trarversal is ");
            inorderRec(root);
            System.out.println();
        }
    }

    public void preOrder() {
        if (null == root) {
            System.out.println("Tree is empty");
        } else {
            System.out.print("PreOrder trarversal is ");
            preOrderRec(root);
            System.out.println();
        }
    }

    public void postOrder() {
        if (null == root) {
            System.out.println("Tree is empty");
        } else {
            System.out.print("PostOrder trarversal is ");
            postOrderRec(root);
            System.out.println();
        }
    }

    private void postOrderRec(BSTNode root) {
        if (root != null) {
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.data + " ");
        }
    }

    private void preOrderRec(BSTNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    private void inorderRec(BSTNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    private class BSTNode {
        int data;
        BSTNode left;
        BSTNode right;

        BSTNode(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.inorder();
        bst.insert(10);
        bst.insert(15);
        bst.insert(5);
        bst.insert(7);
        bst.insert(14);
        bst.insert(20);
        bst.insert(3);
        bst.inorder();
        bst.preOrder();
        bst.postOrder();
    }
}
