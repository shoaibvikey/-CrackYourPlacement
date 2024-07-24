/*class Solution {
    int count = 0;
    private void solveRec(String s, int idx, StringBuilder sb, String t) {
        if (idx >= s.length()) {
            if (sb.toString().equals(t)) {
                count++;
                return;
            } else {
                return;
            }
        }
        sb.append(s.charAt(idx));
        solveRec(s, idx + 1, sb, t);
        sb.deleteCharAt(sb.length() - 1);
        solveRec(s, idx + 1, sb, t);
    }
    private int solveMemo(String s, int idx, String t, int t_idx, int[][] dp) {
        if (t_idx >= t.length())
            return 1;
        if (idx >= s.length())
            return 0;
        if (dp[idx][t_idx] != -1) {
            return dp[idx][t_idx];
        }
        int take = 0;
        int nontake = 0;
        if (s.charAt(idx) == t.charAt(t_idx)) {
            take = solveMemo(s, idx + 1, t, t_idx + 1, dp);
            nontake = solveMemo(s, idx + 1, t, t_idx, dp);
            return dp[idx][t_idx] = take + nontake;
        }
        return dp[idx][t_idx] = solveMemo(s, idx + 1, t, t_idx, dp);
    }
    public int numDistinct(String s, String t) {
        int[][] dp = new int[s.length() + 1][t.length() + 1];
        for (int[] d : dp) {
            Arrays.fill(d, -1);
        }

        return solveMemo(s, 0, t, 0, dp);
    }
} */