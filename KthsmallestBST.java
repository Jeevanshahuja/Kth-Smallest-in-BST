class Solution {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list= new ArrayList<>();
        inOrderTraversal(root, list, k);
        if (list.size() == 0 && k > list.size())
            return -1;
        else
            return list.get(list.size() - 1);
    }
    public void inOrderTraversal(TreeNode root, List<Integer> list, int k) {       
        if (root == null)
            return;
        
        inOrderTraversal(root.left, list, k);
        if (list.size() < k) list.add(root.val);
        else return;
        inOrderTraversal(root.right, list, k);
        
    }
    
}