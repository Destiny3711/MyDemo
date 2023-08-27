package com.demo.leetcode;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {
    public static void main(String[] args) {
        System.out.println(lengthOfLIS(new int[]{10,9,2,5,3,7,101,18})); // 应输出：3
    }
    public static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int ans = 0;
        for(int i = 0; i < n; ++ i){
            dp[i] = 1;
            for(int j = 0; j < i; ++ j){
                dp[i] = dp[i] > dp[j] ? Math.max(dp[i], dp[j] + 1) : dp[i];
            }
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}