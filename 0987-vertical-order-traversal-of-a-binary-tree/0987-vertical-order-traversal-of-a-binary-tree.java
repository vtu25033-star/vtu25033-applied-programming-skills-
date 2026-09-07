// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution {
//     class NodeInfo {
//         TreeNode node;
//         int row;
//         int col;

//         NodeInfo(TreeNode node, int row, int col) {
//             this.node = node;
//             this.row = row;
//             this.col = col;
//         }
//     }

//     public List<List<Integer>> verticalTraversal(TreeNode root) {
//         List<List<Integer>> result = new ArrayList<>();
//         if (root == null) return result;
//         Map<Integer, Map<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
//         Queue<NodeInfo> queue = new LinkedList<>();
//         queue.offer(new NodeInfo(root, 0, 0));
//         while (!queue.isEmpty()) {
//             NodeInfo curr = queue.poll();
//             TreeNode node = curr.node;
//             int row = curr.row;
//             int col = curr.col;

//             map.putIfAbsent(col, new TreeMap<>());
//             map.get(col).putIfAbsent(row, new PriorityQueue<>());
//             map.get(col).get(row).offer(node.val);

//             if (node.left != null) {
//                 queue.offer(new NodeInfo(node.left, row + 1, col - 1));
//             }
//             if (node.right != null) {
//                 queue.offer(new NodeInfo(node.right, row + 1, col + 1));
//             }
//         }

//         for (Map<Integer, PriorityQueue<Integer>> colMap : map.values()) {
//             List<Integer> colList = new ArrayList<>();
//             for (PriorityQueue<Integer> pq : colMap.values()) {
//                 while (!pq.isEmpty()) {
//                     colList.add(pq.poll());
//                 }
//             }
//             result.add(colList);
//         }

//         return result;
//     }
// }
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Map<Integer, List<Integer>> map = new HashMap<>();
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        Queue<Integer> colQueue = new LinkedList<>();
        nodeQueue.offer(root);
        colQueue.offer(0);
        int minCol = 0;
        int maxCol = 0;
        while (!nodeQueue.isEmpty()) {
            int size = nodeQueue.size();
            Map<Integer, List<Integer>> levelMap = new HashMap<>();
            for (int i = 0; i < size; i++) {
                TreeNode curr = nodeQueue.poll();
                int col = colQueue.poll();
                minCol = Math.min(minCol, col);
                maxCol = Math.max(maxCol, col);
                levelMap.putIfAbsent(col, new ArrayList<>());
                levelMap.get(col).add(curr.val);
                if (curr.left != null) {
                    nodeQueue.offer(curr.left);
                    colQueue.offer(col - 1);
                }
                if (curr.right != null) {
                    nodeQueue.offer(curr.right);
                    colQueue.offer(col + 1);
                }
            }
            for (int col : levelMap.keySet()) {
                List<Integer> list = levelMap.get(col);
                Collections.sort(list); 
                map.putIfAbsent(col, new ArrayList<>());
                map.get(col).addAll(list);
            }
        }
        for (int col = minCol; col <= maxCol; col++) {
            result.add(map.get(col));
        }
        return result;
    }
}