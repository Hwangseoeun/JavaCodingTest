package Algorithm;

public class BinarySearchTree {
    static class TreeNode{
        int value;
        TreeNode left, right;

        TreeNode(int value){
            this.value = value;
        }
    }

    //생성, 삭제
    TreeNode root;

    BinarySearchTree(){
        root = null;
    }

    public void insert(int value){
        root = insert(root, value);
    }

    public TreeNode insert(TreeNode root, int value){
        if(root == null){
            root = new TreeNode(value);
            return root;
        }
        if(root.value > value){
            root.left = insert(root.left, value);
        }
        else if(root.value < value){
            root.right = insert(root.right, value);
        }

        return root;
    }

    public void delete(int value){
        root = delete(root, value);
    }

    public TreeNode delete(TreeNode root, int value){
        if(root == null){
            return null;
        }

        if(root.value > value){
            root.left = delete(root.left, value);
        }
        else if(root.value < value){
            root.right = delete(root.right, value);
        }
        else{
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            root.value = findMinValue(root.right);
            root.right = delete(root.right, root.value);
        }
        return root;
    }

    int findMinValue(TreeNode root){
        int minval = root.value;

        while (root.left != null){
            minval = root.left.value;
            root = root.left;
        }

        return minval;
    }
}
