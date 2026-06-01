class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val uniqueNumbers = mutableSetOf<Int>()

        for (number in nums) {
            val added = uniqueNumbers.add(number)

            if (!added) {
                return true
            }
        }

        return false
    }
}
