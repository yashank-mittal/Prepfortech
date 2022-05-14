"""
Ritik  is celebrating Raksha Bandhan with his ‘N’ sisters. Each of his sisters plans to tie him one Rakhi,
having some integer value. The integer value for all ‘N’ Rakhis is provided in an array ‘ARR’.
Ninja wants the total sum of values of all tied Rakhis to be strictly positive.
Your task is to tell him the maximum Rakhis he can have on his hand.
"""
def solution(arr):
    arr.sort()
    pos_sum = 0
    for i in range(len(arr)-1, -1, -1):
        if pos_sum + arr[i] > 0:
            pos_sum += arr[i]
    return pos_sum
