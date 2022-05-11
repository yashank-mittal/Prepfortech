"""
Given an array of n integers and a positive number k. We are allowed to take any k integers from the given array.
The task is to find the minimum possible value of the difference between maximum and minimum of K numbers.
"""
def solution(arr, k):
    arr.sort()
    i = 0
    j = k -1
    min_diff = float('inf')
    while j < len(arr):
        diff = arr[j] - arr[i]
        min_diff = min(min_diff, diff)
        j += 1
        i += 1
    return min_diff
