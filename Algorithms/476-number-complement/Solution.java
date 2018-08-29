public class Solution {
    public int findComplement(int num) {
        int zeros = Integer.numberOfLeadingZeros(num);
        return ((num << zeros ) ^ 0xffffffff) >> zeros;
    }
}
