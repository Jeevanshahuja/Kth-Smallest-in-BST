# Kth Smallest Element in a BST

## Problem Description
Given the root of a Binary Search Tree (BST) and an integer `k`, the goal is to return the **kth smallest value** (1-indexed) among all the node values in the tree.

## Solution
The solution uses an **in-order traversal** of the BST, which visits nodes in sorted order (ascending) due to the properties of a BST.

### Function: `kthSmallest(TreeNode root, int k)`
- **Input**: 
  - `TreeNode root`: The root of the BST.
  - `int k`: The position of the smallest element to find.
- **Output**: The `kth` smallest element in the BST.
- **Approach**:
  - Perform an **in-order traversal** of the tree.
  - Keep track of visited elements in a list until `k` elements are collected.

### Time Complexity
- **Time Complexity**: `O(N)` in the worst case, where `N` is the number of nodes in the BST.  
- **Space Complexity**: `O(H + k)`, where `H` is the height of the BST and `k` is the size of the list.

## Link to Problem
For more details, visit the problem on [LeetCode](https://leetcode.com/problems/kth-smallest-element-in-a-bst/description/).
