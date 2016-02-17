public class Solution {
    /**
     * @param num: an integer
     * @return: an integer, the number of ones in num
     */
    public int countOnes(int num) {
        // write your code here
        int sum=0;
        while(num > 0) {
            int temp = num%2;
            num/=2;
            if(temp == 1) {
                sum++;
            }
        }
        return sum;
    }
};
