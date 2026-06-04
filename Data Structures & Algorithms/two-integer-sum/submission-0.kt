class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val seen = mutableMapOf<Int, Int>()
        
        nums.forEachIndexed { index, num ->
            val difference = target - num

            if (seen[difference] != null) {
                return intArrayOf(seen[difference]!!, index)
            }
            seen[num] = index
        }

        throw RuntimeException()
    }
}