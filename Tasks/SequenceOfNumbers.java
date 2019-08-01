package tests;

public class SequenceOfNumbers {

    // !!! TASK:  Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere. !!!

    public static void main(String[] args) {
        System.out.println(array123(new int[]{1, 1, 2, 3, 1}));
        System.out.println(array123(new int[]{1, 1, 2, 4, 1}));
        System.out.println(array123(new int[]{1, 1, 2, 1, 2, 3}));
        System.out.println(array123(new int[]{1, 2}));
    }


    public static boolean array123(int[] nums) {
        int temp = 0;

        if (nums.length < 3) return false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 1) {
                temp = 2;
                if (nums[i + 1] == temp) {
                    temp = 3;
                    if (nums[i + 2] == temp) {
                        return true;
                    }
                }
            }
        }

        return false;

    }


}
