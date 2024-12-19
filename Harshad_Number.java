//An integer divisible by the sum of its digits is said to be a Harshad number. You are given an integer x. Return the sum of the digits of x if x is a Harshad number, otherwise, return -1.
// Example 1:
// Input: x = 18
// Output: 9
// Explanation:
// The sum of digits of x is 9. 18 is divisible by 9. So 18 is a Harshad number and the answer is 9.

class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
           String indexAsString = Integer.toString(x);
          int sum=0;
          int j=0;
          while(j<indexAsString.length()){
             //  sum+= Character.getNumericValue(indexAsString.charAt(j));
              sum=sum+indexAsString.charAt(j)-'0';
               j++;
          }
          if(x%sum==0){
            return sum;
          }
          return -1;
    }
}
