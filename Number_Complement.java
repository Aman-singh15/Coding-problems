//The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in its binary representation.
// For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.
// Given an integer num, return its complement.

class Solution {
    public int findComplement(int num) {
        String binaryString = Integer.toBinaryString(num);
        StringBuilder nums = new StringBuilder(binaryString);
        for(int i=0;i<nums.length();i++){
            if(nums.charAt(i)=='0'){
                 nums.setCharAt(i, '1');
            }else{
                 nums.setCharAt(i, '0');
            }
        }
        String complement=nums.toString();
        return Integer.parseInt(complement,2);
    }
}
