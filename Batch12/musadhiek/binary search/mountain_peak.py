"""Let's call an array arr a mountain if the following properties hold:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... arr[i-1] < arr[i]
arr[i] > arr[i+1] > ... > arr[arr.length - 1]
Given an integer array arr that is guaranteed to be a mountain, 
return any i such that arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1]."""


def peakIndexInMountainArray( arr):
        start = 0 
        end =  len(arr)-1
        while start <= end:
            
            mid = start + (end-start)//2
            if arr[mid] > arr[mid+1] and arr[mid]> arr[mid-1]:
                return mid
            if arr[mid-1]> arr[mid]:
                peak = mid-1
                end = mid
            else:
                start = mid+1
        return peak
arr1 = [18,29,38,59,98,100,99,98,90]
arr2 = [3,9,8,6,4]
print(peakIndexInMountainArray(arr1),"peak for arr1")
print(peakIndexInMountainArray(arr2),"peak for arr2")