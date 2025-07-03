class Solution(object):
    def firstMissingPositive(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums) == 1:
            if nums[0] == 1:
                return nums[0] + 1
            else: 
                return 1
        arr = sorted([num for num in nums if num > 0])
        if not arr or arr[0] !=1:
            return 1
        ans = 0
        for i in range(1, len(arr)):
            if arr[i] - arr[i - 1] > 1:
                return arr[i - 1] + 1
        return arr[-1]+1