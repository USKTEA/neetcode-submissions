class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val seen = mutableSetOf<Int>()

        for (number in nums) {
            val added = seen.add(number)

            if (!added) {
                return true
            }
        }

        return false
    }
}
