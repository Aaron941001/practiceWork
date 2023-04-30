This program uses dynamic programming to find the LCS of two strings. It creates a 2D array dp with dimensions (m+1)x(n+1), where m and n are the lengths of the two input strings. The array is filled with the lengths of the LCS of substrings of the input strings. The last element of the dp array dp[m][n] will have the length of LCS of two strings.

Then, it backtracks through the dp array to build the LCS string, by comparing characters of the two input strings and the dp array.

In this example, LCS of two strings abcdefg and acbcf is acbf.

It's important to note that this solution has time complexity of O(mn) and space complexity of O(mn) as well.