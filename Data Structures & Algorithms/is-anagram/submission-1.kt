class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val sortedS = s.toCharArray().sorted().joinToString("")
        val sortedT = t.toCharArray().sorted().joinToString("")

        return sortedS == sortedT
    }
}
