package org.huhu.leetcode.n2559;

class SolutionA implements Solution {

    private static final boolean[] VOWEL = new boolean['z' + 1];

    static {
        VOWEL['a'] = true;
        VOWEL['e'] = true;
        VOWEL['i'] = true;
        VOWEL['o'] = true;
        VOWEL['u'] = true;
    }

    @Override
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] pre = new int[n + 1];
        for (int i = 0; i < n; i++) {
            String s = words[i];
            char l = s.charAt(0), r = s.charAt(s.length() - 1);
            int x = VOWEL[l] && VOWEL[r] ? 1 : 0;
            pre[i + 1] = pre[i] + x;
        }
        n = queries.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = pre[queries[i][1] + 1] - pre[queries[i][0]];
        }
        return arr;
    }

}
