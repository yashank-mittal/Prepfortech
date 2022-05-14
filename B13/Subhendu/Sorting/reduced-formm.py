"""
Given an array with N distinct elements, convert the given array to a reduced form where all elements
are in range from 0 to N-1. The order of elements is same, i.e., 0 is placed in place of the smallest element,
1 is placed for second smallest element, … N-1 is placed for the largest element.
"""
def solution(arr):
    copy_arr = arr[:]
    copy_arr.sort()
    index_dict = {}
    for idx, attr in enumerate(copy_arr):
        index_dict[attr] = idx

    ans = []
    for i in arr:
        ans.append(index_dict[i])
    return ans