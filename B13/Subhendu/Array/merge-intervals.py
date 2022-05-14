class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        ## https://leetcode.com/problems/merge-intervals/
        intervals.sort(key=lambda x: x[0])
        result = []
        for i in range(len(intervals)):
            if result and result[-1][1] >= intervals[i][0]:
                result[-1][1] = max(intervals[i][1], result[-1][1])
            else:
                result.append(intervals[i])
        return result
