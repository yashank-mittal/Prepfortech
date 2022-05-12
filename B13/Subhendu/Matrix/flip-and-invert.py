class Solution:
    def flipAndInvertImage(self, image: List[List[int]]) -> List[List[int]]:
        ## https://leetcode.com/problems/flipping-an-image/
        n = len(image)
        for i in image:
            i.reverse()
            for j in range(n):
                if i[j]:
                    i[j] = 0
                else:
                    i[j] = 1
        return image
