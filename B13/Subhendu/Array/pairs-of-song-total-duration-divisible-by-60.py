from collections import defaultdict
class Solution:
    def numPairsDivisibleBy60(self, time: List[int]) -> int:
        ## https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/
        remainders = defaultdict(int)
        ret = 0
        for t in time:
            if t%60 == 0:
                ret += remainders[0]
            else:
                ret += remainders[60-t%60]
            remainders[t % 60] += 1
        return ret