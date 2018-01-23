package Linkedin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestLinkedIn {
    public static void main(String[] args) {


        FactorCombinations fc = new FactorCombinations();
        List<List<Integer>> res = fc.getFactors(24);
        for(List<Integer> temp: res) {
            System.out.println();
            for(int i: temp) {
                System.out.print(" " + i);
            }
        }





//        int[] nums = {7, 17, 22, 37};
//        SearchNearestSortedArray snr = new SearchNearestSortedArray();
//        int val = snr.search(nums, 16);
//        System.out.println(val);






//        TrappedWater tw = new TrappedWater();
//        int[] nums = {0,1,0,2,1,0,1,3,2,1,2,1};
//        int sum = tw.trap(nums);






//        productExceptSelf pes = new productExceptSelf();
//        int[] nums = {1, 0};
//        int[] res = pes.getProducts(nums);



//        LCA lca = new LCA();
//        TreeNode root = new TreeNode(2);
//        root.left = new TreeNode(1);
//        root.right = new TreeNode(3);
//        TreeNode anc = lca.lowestCommonAncestor(root, root.left, root.right);

//        root.left.left = new TreeNode(4);
//        root.left.right = new TreeNode(5);

//        BinaryTreeIterator bit = new BinaryTreeIterator(root);
//        while (bit.hasNext()) {
//            System.out.println(bit.next());
//        }

//        maxProductArray mPA = new maxProductArray();
//        int[] arr = {-4, -3, -2};
//        mPA.maxProduct(arr);
//




//
//        String[] arr = {"hot","dot","dog","lot","log"};
//        List<String> inp = new ArrayList<>();
//        inp.add("hot");
//        inp.add("dot");
//        inp.add("dog");
//        inp.add("lot");
//        inp.add("log");
//
//        WordLadder wl = new WordLadder();
//        int res = wl.ladderLength("hit", "cog", inp);
//        System.out.println(res);







        //
//        ValidNumber vn = new ValidNumber();
//        boolean res = vn.validNumber(".1");
//        System.out.println(res);


//        Power pw = new Power();
//        double val = pw.myPow(2.000 , -2147483648);
//        System.out.println(val);





//        int[] check = {1, 2, 1};
//        Permutations2 ap = new Permutations2();
//        List<List<Integer>> res= ap.permuteUnique(check);
//
//        for(List<Integer> temp: res) {
//            System.out.println();
//            for(int i:temp) {
//                System.out.print(i + " ");
//            }
//        }
    }
}
