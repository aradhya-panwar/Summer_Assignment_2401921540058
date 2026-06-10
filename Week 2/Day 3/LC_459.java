class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String twice = s + s;
        String trimmed = twice.substring(1, twice.length() - 1);

        return trimmed.contains(s);
    }
}